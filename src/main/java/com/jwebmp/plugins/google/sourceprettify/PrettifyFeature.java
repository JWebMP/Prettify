package com.jwebmp.plugins.google.sourceprettify;

import com.jwebmp.core.Feature;
import com.jwebmp.core.htmlbuilder.javascript.JavaScriptPart;

/**
 * Implements the Google Prettify-It JQuery class
 *
 * @author mmagon
 * @since 2014/06/06
 */
public class PrettifyFeature
        extends Feature<PrettifyFeature, JavaScriptPart<?>, PrettifyFeature>
{


    /**
     * Constructs a source code displayer with the given PRE tag.
     * <p>
     *
     * @param comp
     */
    public PrettifyFeature(Prettify<?> comp)
    {
        super("JWSourceCodePrettify");
        setComponent(comp);
    }

    @Override
    public void assignFunctionsToComponent()
    {
        addQuery("prettyPrint();" + getNewLine());
    }
}
