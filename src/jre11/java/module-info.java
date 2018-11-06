import com.jwebmp.core.services.IPageConfigurator;
import com.jwebmp.guicedinjection.interfaces.IGuiceScanJarExclusions;
import com.jwebmp.guicedinjection.interfaces.IGuiceScanModuleExclusions;
import com.jwebmp.plugins.google.sourceprettify.JQSourceCodePrettifyPageConfigurator;
import com.jwebmp.plugins.google.sourceprettify.implementations.GoogleSourceCodePrettifyExclusionsModule;

module com.jwebmp.plugins.google.sourceprettify {
	exports com.jwebmp.plugins.google.sourceprettify;

	requires com.jwebmp.core;
	requires com.jwebmp.logmaster;
	requires com.fasterxml.jackson.annotation;

	requires java.validation;
	requires java.logging;
	requires com.jwebmp.guicedinjection;

	provides IPageConfigurator with JQSourceCodePrettifyPageConfigurator;
	provides IGuiceScanJarExclusions with GoogleSourceCodePrettifyExclusionsModule;
	provides IGuiceScanModuleExclusions with GoogleSourceCodePrettifyExclusionsModule;

	opens com.jwebmp.plugins.google.sourceprettify to com.fasterxml.jackson.databind, com.jwebmp.core;
}
