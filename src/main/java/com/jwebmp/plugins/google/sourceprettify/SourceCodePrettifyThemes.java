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

import com.jwebmp.core.base.references.CSSReference;
import com.jwebmp.core.utilities.TextUtilities;

/**
 * /**
 * The themes available to the source code engine
 * <p>
 *
 * @author GedMarc
 * @since 18 Dec 2014
 * 		<p>
 */
public enum SourceCodePrettifyThemes
{

	Default("bower_components/google-code-prettify/bin/prettify.min.css"),
	Desert("bower_components/google-code-prettify/styles/desert.min.css"),
	Doxy("bower_components/google-code-prettify/styles/doxy.min.css"),
	Sons_Of_Obsidian("bower_components/google-code-prettify/styles/sons-of-obsidian.min.css"),
	Sons_Of_Obsidian_Fixed_BG("bower_components/google-code-prettify/styles/sons-of-obsidian-fixed-background.min.css"),
	Sunburst("bower_components/google-code-prettify/styles/sunburst.min.css");

	private final String cssReference;

	SourceCodePrettifyThemes(String cssReference)
	{
		this.cssReference = cssReference;
	}

	/**
	 * Returns the location of the theme CSS File
	 *
	 * @return The CSS Reference
	 */
	public CSSReference getCssReference()
	{
		return new CSSReference("theme" + name() + "prettify", 1.0, cssReference).setSpecifiedClassName("prettifytheme");
	}

	@Override
	public String toString()
	{
		return TextUtilities.cleanAttributeName(name());
	}

}
