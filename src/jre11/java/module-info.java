import com.jwebmp.plugins.google.sourceprettify.implementations.GoogleCodePrettifyModuleInclusion;

module com.jwebmp.plugins.google.sourceprettify {
	exports com.jwebmp.plugins.google.sourceprettify;

	requires com.jwebmp.core;
	

	requires jakarta.validation;
	requires java.logging;
	requires com.guicedee.guicedinjection;

	provides com.jwebmp.core.services.IPageConfigurator with com.jwebmp.plugins.google.sourceprettify.JQSourceCodePrettifyPageConfigurator;
	provides com.guicedee.guicedinjection.interfaces.IGuiceScanModuleExclusions with com.jwebmp.plugins.google.sourceprettify.implementations.GoogleSourceCodePrettifyExclusionsModule;
	provides com.guicedee.guicedinjection.interfaces.IGuiceScanModuleInclusions with GoogleCodePrettifyModuleInclusion;
	
	opens com.jwebmp.plugins.google.sourceprettify to com.fasterxml.jackson.databind, com.jwebmp.core;
}
