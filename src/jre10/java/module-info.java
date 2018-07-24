import com.jwebmp.core.services.IPageConfigurator;
import com.jwebmp.plugins.google.sourceprettify.JQSourceCodePrettifyPageConfigurator;

module com.jwebmp.plugins.google.sourceprettify {
	exports com.jwebmp.plugins.google.sourceprettify;

	requires com.jwebmp.core;
	requires com.jwebmp.logmaster;
	requires com.fasterxml.jackson.annotation;

	requires java.validation;
	requires java.logging;

	provides IPageConfigurator with JQSourceCodePrettifyPageConfigurator;
	opens com.jwebmp.plugins.google.sourceprettify to com.fasterxml.jackson.databind, com.jwebmp.core;
}
