module com.jwebmp.plugins.google.sourceprettify {
	exports com.jwebmp.plugins.google.sourceprettify;

	requires com.jwebmp.core;
	requires com.guicedee.logmaster;

	requires jakarta.validation;
	requires java.logging;
	requires com.guicedee.guicedinjection;

	provides com.jwebmp.core.services.IPageConfigurator with com.jwebmp.plugins.google.sourceprettify.JQSourceCodePrettifyPageConfigurator;
	provides com.guicedee.guicedinjection.interfaces.IGuiceScanModuleExclusions with com.jwebmp.plugins.google.sourceprettify.implementations.GoogleSourceCodePrettifyExclusionsModule;

	opens com.jwebmp.plugins.google.sourceprettify to com.fasterxml.jackson.databind, com.jwebmp.core;
}
