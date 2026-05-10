package com.jwebmp.plugins.google.sourceprettify.implementations;

import com.guicedee.client.services.config.IGuiceScanModuleInclusions;

import java.util.HashSet;
import java.util.Set;

public class GoogleCodePrettifyModuleInclusion implements IGuiceScanModuleInclusions<GoogleCodePrettifyModuleInclusion>
{
        @Override
        public Set<String> includeModules()
        {
                Set<String> set = new HashSet<>();
                set.add("com.jwebmp.plugins.google.sourceprettify");
                return set;
        }
}
