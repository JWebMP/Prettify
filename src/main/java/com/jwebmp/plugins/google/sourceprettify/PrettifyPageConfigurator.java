package com.jwebmp.plugins.google.sourceprettify;

import com.jwebmp.core.base.angular.client.annotations.typescript.TsDependency;
import com.jwebmp.core.base.angular.client.annotations.angularconfig.NgScript;
import com.jwebmp.core.base.angular.client.annotations.angularconfig.NgStyleSheet;
import com.jwebmp.core.plugins.PluginInformation;
import com.jwebmp.core.services.IPage;
import com.jwebmp.core.services.IPageConfigurator;

/**
 * @author GedMarc
 * @since 26 Feb 2017
 */
@PluginInformation(pluginName = "Google Code Prettify",
        pluginUniqueName = "google-code-prettify",
        pluginDescription = "An embeddable script that makes source-code snippets in HTML prettier.",
        pluginVersion = "0.1.0",
        pluginDependancyUniqueIDs = "",
        pluginCategories = "code, highlight, source",
        pluginSubtitle = "A Javascript module and CSS file that allows syntax highlighting of source code snippets in an html page.",
        pluginGitUrl = "https://github.com/JWebMP/Prettify",
        pluginSourceUrl = "https://github.com/googlearchive/code-prettify",
        pluginWikiUrl = "https://github.com/JWebMP/Prettify/wiki",
        pluginOriginalHomepage = "https://github.com/googlearchive/code-prettify",
        pluginDownloadUrl = "https://mvnrepository.com/artifact/com.jwebmp.plugins/prettify",
        pluginIconUrl = "",
        pluginIconImageUrl = "",
        pluginLastUpdatedDate = "2025/05/10",
        pluginGroupId = "com.jwebmp.plugins",
        pluginArtifactId = "prettify"
)
@TsDependency(value = "code-prettify", version = "^0.1.0")
@NgScript("node_modules/code-prettify/bin/prettify.min.js")
@NgStyleSheet("node_modules/code-prettify/bin/prettify.min.css")
@SuppressWarnings("unused")
public class PrettifyPageConfigurator
        implements IPageConfigurator<PrettifyPageConfigurator>
{
    public PrettifyPageConfigurator()
    {
        //No config needed
    }

    @Override
    public IPage<?> configure(IPage<?> page)
    {
        return page;
    }

    @Override
    public boolean enabled()
    {
        return true;
    }
}
