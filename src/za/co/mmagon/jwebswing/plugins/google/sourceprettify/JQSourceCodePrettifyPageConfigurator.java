/*
 * The MIT License
 *
 * Copyright 2017 GedMarc.
 *
 * Permission is hereby granted, free of charge, to any person obtaining a copy
 * of this software and associated documentation files (the "Software"), to deal
 * in the Software without restriction, including without limitation the rights
 * to use, copy, modify, merge, publish, distribute, sublicense, and/or sell
 * copies of the Software, and to permit persons to whom the Software is
 * furnished to do so, subject to the following conditions:
 *
 * The above copyright notice and this permission notice shall be included in
 * all copies or substantial portions of the Software.
 *
 * THE SOFTWARE IS PROVIDED "AS IS", WITHOUT WARRANTY OF ANY KIND, EXPRESS OR
 * IMPLIED, INCLUDING BUT NOT LIMITED TO THE WARRANTIES OF MERCHANTABILITY,
 * FITNESS FOR A PARTICULAR PURPOSE AND NONINFRINGEMENT. IN NO EVENT SHALL THE
 * AUTHORS OR COPYRIGHT HOLDERS BE LIABLE FOR ANY CLAIM, DAMAGES OR OTHER
 * LIABILITY, WHETHER IN AN ACTION OF CONTRACT, TORT OR OTHERWISE, ARISING FROM,
 * OUT OF OR IN CONNECTION WITH THE SOFTWARE OR THE USE OR OTHER DEALINGS IN
 * THE SOFTWARE.
 */
package za.co.mmagon.jwebswing.plugins.google.sourceprettify;

import za.co.mmagon.jwebswing.Page;
import za.co.mmagon.jwebswing.PageConfigurator;
import za.co.mmagon.jwebswing.plugins.PluginInformation;

/**
 *
 * @author GedMarc
 * @since 26 Feb 2017
 *
 */
@PluginInformation(pluginName = "Google Code Prettify", pluginUniqueName = "google-code-prettify",
        pluginDescription = "An embeddable script that makes source-code snippets in HTML prettier.",
        pluginVersion = "1.9.2",
        pluginDependancyUniqueIDs = "", pluginCategories = "fonts, icons",
        pluginSubtitle = "Automatically exported from code.google.com/p/google-code-prettify ",
        pluginGitUrl = "https://github.com/GedMarc/JWebSwing-GoogleSourceCodePrettifyPlugin",
        pluginSourceUrl = "",
        pluginWikiUrl = "https://github.com/GedMarc/JWebSwing-GoogleSourceCodePrettifyPlugin/wiki",
        pluginOriginalHomepage = "https://github.com/google/code-prettify")
public class JQSourceCodePrettifyPageConfigurator extends PageConfigurator
{

    private static final long serialVersionUID = 1L;

    public JQSourceCodePrettifyPageConfigurator()
    {

    }

    @Override
    public Page configure(Page page)
    {
        return page;
    }

}
