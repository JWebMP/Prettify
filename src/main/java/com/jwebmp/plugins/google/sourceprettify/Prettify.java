package com.jwebmp.plugins.google.sourceprettify;

import com.jwebmp.core.base.html.PreFormattedText;
import com.jwebmp.core.base.html.interfaces.GlobalChildren;
import com.jwebmp.core.plugins.ComponentInformation;

/**
 * Implements the Google Code Prettify JavaScript
 *
 * @param <J>
 * @author MMagon
 * @version 1.0
 * @since 2014 09 28
 */
@ComponentInformation(name = "google-code-prettify ",
        description = "An embeddable script that makes source-code snippets in HTML prettier.",
        url = "https://code.google.com/archive/p/google-code-prettify")
public class Prettify<J extends Prettify<J>>
        extends PreFormattedText<J>
        implements GlobalChildren
{
    @SuppressWarnings("FieldCanBeLocal")
    private final PrettifyFeature feature = new PrettifyFeature(this);
    private SourceCodeLanguages sourceCodeLanguage = SourceCodeLanguages.Java;
    private SourceCodePrettifyThemes sourceCodePrettifyTheme = SourceCodePrettifyThemes.Default;

    private boolean showLineNums;

    /**
     * Constructs a new Source Code Prettify
     */
    public Prettify()
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
     * @return
     */
    @SuppressWarnings("unchecked")
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
     * @param theme The theme to use
     */
    @SuppressWarnings("unchecked")
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
