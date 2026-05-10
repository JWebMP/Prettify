package com.jwebmp.plugins.google.sourceprettify.implementations;

import com.guicedee.client.services.config.IGuiceScanModuleExclusions;

import java.util.HashSet;
import java.util.Set;

public class GoogleSourceCodePrettifyExclusionsModule
		implements IGuiceScanModuleExclusions<GoogleSourceCodePrettifyExclusionsModule>
{
	@Override
	public Set<String> excludeModules()
	{
		Set<String> strings = new HashSet<>();
		strings.add("com.jwebmp.plugins.google.sourceprettify");
		return strings;
	}
}
