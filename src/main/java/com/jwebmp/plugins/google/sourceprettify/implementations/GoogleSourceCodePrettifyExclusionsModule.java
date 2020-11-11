package com.jwebmp.plugins.google.sourceprettify.implementations;

import com.guicedee.guicedinjection.interfaces.IGuiceScanModuleExclusions;

import jakarta.validation.constraints.NotNull;
import java.util.HashSet;
import java.util.Set;

public class GoogleSourceCodePrettifyExclusionsModule
		implements IGuiceScanModuleExclusions<GoogleSourceCodePrettifyExclusionsModule>
{
	@Override
	public @NotNull Set<String> excludeModules()
	{
		Set<String> strings = new HashSet<>();
		strings.add("com.jwebmp.plugins.google.sourceprettify");
		return strings;
	}
}
