package com.jwebmp.plugins.google.sourceprettify.implementations;

import com.guicedee.client.services.config.IGuiceScanModuleExclusions;
import com.guicedee.client.services.config.IGuiceScanJarExclusions;
import java.util.LinkedHashSet;
import java.util.Set;

/** SPI services and direct resource access do not require scanning this library. */
public class GoogleSourceCodePrettifyExclusionsModule implements IGuiceScanModuleExclusions<GoogleSourceCodePrettifyExclusionsModule>, IGuiceScanJarExclusions<GoogleSourceCodePrettifyExclusionsModule> {
    @Override public Set<String> excludeModules() { return Set.of("com.jwebmp.plugins.prettify"); }
    @Override public Set<String> excludeJars() {
        Set<String> jars = new LinkedHashSet<>();
        jars.add("prettify.jar");
        for (int digit = 0; digit <= 9; digit++) jars.add("prettify-" + digit + "*.jar");
        return jars;
    }
}
