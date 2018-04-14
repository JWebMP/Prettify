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

import com.jwebmp.Page;
import com.jwebmp.PageConfigurator;
import com.jwebmp.base.references.JavascriptReference;
import com.jwebmp.plugins.PluginInformation;

/**
 * @author GedMarc
 * @since 26 Feb 2017
 */
@PluginInformation(pluginName = "Google Code Prettify",
		pluginUniqueName = "google-code-prettify",
		pluginDescription = "An embeddable script that makes source-code snippets in HTML prettier.",
		pluginVersion = "1.9.2",
		pluginDependancyUniqueIDs = "",
		pluginCategories = "code, highlight, source",
		pluginSubtitle = "A Javascript module and CSS file that allows syntax highlighting of source code snippets in an html page.",
		pluginGitUrl = "https://github.com/GedMarc/JWebSwing-GoogleSourceCodePrettifyPlugin",
		pluginSourceUrl = "https://github.com/google/code-prettify",
		pluginWikiUrl = "https://github.com/GedMarc/JWebSwing-GoogleSourceCodePrettifyPlugin/wiki",
		pluginOriginalHomepage = "https://github.com/google/code-prettify",
		pluginDownloadUrl = "https://sourceforge.net/projects/jwebswing/files/plugins/GoogleSourceCodePrettifyPlugin.jar/download",
		pluginIconUrl = "bower_components/google-code-prettify/icon.gif",
		pluginIconImageUrl = "bower_components/google-code-prettify/google_prettify_example.jpg",
		pluginLastUpdatedDate = "2017/03/04")
@SuppressWarnings("unused")
public class JQSourceCodePrettifyPageConfigurator
		extends PageConfigurator
{

	private static final long serialVersionUID = 1L;

	private static SourceCodePrettifyThemes theme = SourceCodePrettifyThemes.Default;

	public JQSourceCodePrettifyPageConfigurator()
	{
		//No config needed
	}

	public static SourceCodePrettifyThemes getTheme()
	{
		return theme;
	}

	public static void setTheme(SourceCodePrettifyThemes theme)
	{
		JQSourceCodePrettifyPageConfigurator.theme = theme;
	}

	@Override
	public Page configure(Page page)
	{
		if (!page.isConfigured())
		{
			page.getBody()
			    .getJavascriptReferences()
			    .add(new JavascriptReference("JQueryPrettify", 1.0, "bower_components/google-code-prettify/src/prettify.js"));
			page.getBody()
			    .getCssReferences()
			    .add(theme.getCssReference());
		}
		return page;
	}
}
