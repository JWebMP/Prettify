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

import com.jwebmp.core.Page;
import com.jwebmp.core.base.references.JavascriptReference;
import com.jwebmp.core.plugins.PluginInformation;
import com.jwebmp.core.services.IPageConfigurator;

import javax.validation.constraints.NotNull;

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
		pluginGitUrl = "https://github.com/GedMarc/JWebMP-GoogleSourceCodePrettifyPlugin",
		pluginSourceUrl = "https://github.com/google/code-prettify",
		pluginWikiUrl = "https://github.com/GedMarc/JWebMP-GoogleSourceCodePrettifyPlugin/wiki",
		pluginOriginalHomepage = "https://github.com/google/code-prettify",
		pluginDownloadUrl = "https://sourceforge.net/projects/jwebswing/files/plugins/GoogleSourceCodePrettifyPlugin.jar/download",
		pluginIconUrl = "bower_components/google-code-prettify/icon.gif",
		pluginIconImageUrl = "bower_components/google-code-prettify/google_prettify_example.jpg",
		pluginLastUpdatedDate = "2017/03/04")
@SuppressWarnings("unused")
public class JQSourceCodePrettifyPageConfigurator
		implements IPageConfigurator<JQSourceCodePrettifyPageConfigurator>
{
	/**
	 * If this configurator is enabled
	 */
	private static boolean enabled = true;
	private static SourceCodePrettifyThemes theme = SourceCodePrettifyThemes.Default;

	public JQSourceCodePrettifyPageConfigurator()
	{
		//No config needed
	}

	/**
	 * Method isEnabled returns the enabled of this AngularAnimatedChangePageConfigurator object.
	 * <p>
	 * If this configurator is enabled
	 *
	 * @return the enabled (type boolean) of this AngularAnimatedChangePageConfigurator object.
	 */
	public static boolean isEnabled()
	{
		return JQSourceCodePrettifyPageConfigurator.enabled;
	}

	/**
	 * Method setEnabled sets the enabled of this AngularAnimatedChangePageConfigurator object.
	 * <p>
	 * If this configurator is enabled
	 *
	 * @param mustEnable
	 * 		the enabled of this AngularAnimatedChangePageConfigurator object.
	 */
	public static void setEnabled(boolean mustEnable)
	{
		JQSourceCodePrettifyPageConfigurator.enabled = mustEnable;
	}

	public static SourceCodePrettifyThemes getTheme()
	{
		return JQSourceCodePrettifyPageConfigurator.theme;
	}

	public static void setTheme(SourceCodePrettifyThemes theme)
	{
		JQSourceCodePrettifyPageConfigurator.theme = theme;
	}

	@NotNull
	@Override
	public Page configure(Page<?> page)
	{
		if (!page.isConfigured())
		{
			page.getBody()
			    .getJavascriptReferences()
			    .add(new JavascriptReference("JQueryPrettify", 1.0, "bower_components/google-code-prettify/src/prettify.min.js"));
			page.getBody()
			    .getCssReferences()
			    .add(JQSourceCodePrettifyPageConfigurator.theme.getCssReference());
		}
		return page;
	}

	@Override
	public boolean enabled()
	{
		return JQSourceCodePrettifyPageConfigurator.enabled;
	}
}
