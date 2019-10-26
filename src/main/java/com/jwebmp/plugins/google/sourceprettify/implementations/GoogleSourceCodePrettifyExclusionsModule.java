package com.jwebmp.plugins.google.sourceprettify.implementations;

import com.guicedee.guicedinjection.interfaces.IGuiceScanJarExclusions;
import com.guicedee.guicedinjection.interfaces.IGuiceScanModuleExclusions;

import javax.validation.constraints.NotNull;
import java.util.HashSet;
import java.util.Set;

public class GoogleSourceCodePrettifyExclusionsModule
		implements IGuiceScanModuleExclusions<GoogleSourceCodePrettifyExclusionsModule>,
				           IGuiceScanJarExclusions<GoogleSourceCodePrettifyExclusionsModule>
{

	@Override
	public @NotNull Set<String> excludeJars()
	{
		Set<String> strings = new HashSet<>();
		strings.add("jwebmp-google-source-code-prettify-*");
		return strings;
	}

	@Override
	public @NotNull Set<String> excludeModules()
	{
		Set<String> strings = new HashSet<>();
		strings.add("com.jwebmp.plugins.google.sourceprettify");
		return strings;
	}
}
