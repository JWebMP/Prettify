package com.jwebmp.plugins.google.sourceprettify.implementations;

import com.guicedee.guicedinjection.interfaces.IGuiceScanModuleInclusions;
import jakarta.validation.constraints.NotNull;

import java.util.HashSet;
import java.util.Set;

public class GoogleCodePrettifyModuleInclusion implements IGuiceScanModuleInclusions<GoogleCodePrettifyModuleInclusion>
{
	@Override
	public @NotNull Set<String> includeModules()
	{
		Set<String> set = new HashSet<>();
		set.add("com.jwebmp.plugins.google.sourceprettify");
		return set;
	}
}
