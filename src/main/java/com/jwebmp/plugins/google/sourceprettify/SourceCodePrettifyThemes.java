package com.jwebmp.plugins.google.sourceprettify;

import com.jwebmp.core.base.references.CSSReference;
import com.jwebmp.core.utilities.TextUtilities;

/**
 * The themes available to the source code engine
 *
 * @author GedMarc
 * @since 18 Dec 2014
 */
public enum SourceCodePrettifyThemes
{

	Default("node_modules/code-prettify/bin/prettify.min.css"),
	Desert("node_modules/code-prettify/styles/desert.css"),
	Doxy("node_modules/code-prettify/styles/doxy.css"),
	Sons_Of_Obsidian("node_modules/code-prettify/styles/sons-of-obsidian.css"),
	Sons_Of_Obsidian_Fixed_BG("node_modules/code-prettify/styles/sons-of-obsidian-fixed-background.css"),
	Sunburst("node_modules/code-prettify/styles/sunburst.css");

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
