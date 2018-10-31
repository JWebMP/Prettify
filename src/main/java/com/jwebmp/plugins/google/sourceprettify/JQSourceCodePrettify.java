/*
 * Copyright (C) 2017 Marc Magon
 *
 * This program is free software: you can redistribute it and/or modify
 * it under the terms of the GNU General Public License as published by
 * the Free Software Foundation, either version 3 of the License, or
 * (at your option) any later version.
 *
 * This program is distributed in the hope that it will be useful,
 * but WITHOUT ANY WARRANTY; without even the implied warranty of
 * MERCHANTABILITY or FITNESS FOR A PARTICULAR PURPOSE.  See the
 * GNU General Public License for more details.
 *
 * You should have received a copy of the GNU General Public License
 * along with this program.  If not, see <http://www.gnu.org/licenses/>.
 */
package com.jwebmp.plugins.google.sourceprettify;

import com.jwebmp.core.base.html.PreFormattedText;
import com.jwebmp.core.base.html.interfaces.GlobalChildren;
import com.jwebmp.core.plugins.ComponentInformation;
import com.jwebmp.logger.LogFactory;

import javax.validation.constraints.NotNull;

/**
 * Implements the Google Code Prettify JavaScript
 *
 * @param <J>
 *
 * @author MMagon
 * @version 1.0
 * @since 2014 09 28
 */
@ComponentInformation(name = "google-code-prettify ",
		description = "An embeddable script that makes source-code snippets in HTML prettier.",
		url = "https://code.google.com/archive/p/google-code-prettify")
public class JQSourceCodePrettify<J extends JQSourceCodePrettify<J>>
		extends PreFormattedText<J>
		implements GlobalChildren
{

	private static final java.util.logging.Logger log = LogFactory.getInstance()
	                                                              .getLogger("SourceCodePrettify");
	private static final String rootSource = "/";

	private final JQSourceCodePrettifyFeature feature = new JQSourceCodePrettifyFeature(this);
	private SourceCodeLanguages sourceCodeLanguage = SourceCodeLanguages.Java;
	private SourceCodePrettifyThemes sourceCodePrettifyTheme = SourceCodePrettifyThemes.Default;

	private boolean showLineNums;

	/**
	 * Constructs a new Source Code Prettify
	 */
	public JQSourceCodePrettify()
	{
		addFeature(feature);
	}

	/**
	 * Constructs the HTML required for prettify to work
	 *
	 * @return
	 */
	@Override
	protected StringBuilder renderBeforeTag()
	{
		StringBuilder sb = new StringBuilder();
		sb.append(getCurrentTabIndentString())
		  .append("<?prettify lang=")
		  .append(getSourceCodeLanguage().name()
		                                 .toLowerCase());
		if (isShowLineNums())
		{
			sb.append(" linenums=true");
		}
		sb.append("?>");
		sb.append(getNewLine());
		return sb;
	}

	/**
	 * Gets the source code language in use
	 *
	 * @return
	 */
	public SourceCodeLanguages getSourceCodeLanguage()
	{
		return sourceCodeLanguage;
	}

	/**
	 * Sets the language programming for
	 *
	 * @param sourceCodeLanguage
	 */
	@SuppressWarnings("unchecked")
	@NotNull
	public J setSourceCodeLanguage(SourceCodeLanguages sourceCodeLanguage)
	{
		this.sourceCodeLanguage = sourceCodeLanguage;
		return (J) this;
	}

	/**
	 * If line numbers must be shown
	 *
	 * @return
	 */
	public boolean isShowLineNums()
	{
		return showLineNums;
	}

	/**
	 * Showing the line numbers
	 *
	 * @param showLineNums
	 *
	 * @return
	 */
	public J setShowLineNums(boolean showLineNums)
	{
		this.showLineNums = showLineNums;
		return (J) this;
	}

	/**
	 * Returns the current theme in place. Default is Sons of Obsidion
	 *
	 * @return
	 */
	public SourceCodePrettifyThemes getSourceCodePrettifyTheme()
	{
		return sourceCodePrettifyTheme;
	}

	/**
	 * Sets the displaying theme that this feature will use
	 *
	 * @param theme
	 * 		The theme to use
	 */
	@SuppressWarnings("unchecked")
	@NotNull
	public final J setTheme(SourceCodePrettifyThemes theme)
	{
		sourceCodePrettifyTheme = theme;
		if (sourceCodePrettifyTheme != null)
		{
			addCssReference(theme.getCssReference());
		}
		return (J) this;
	}

	@Override
	public int hashCode()
	{
		return super.hashCode();
	}

	@Override
	public boolean equals(Object o)
	{
		return super.equals(o);
	}
}
