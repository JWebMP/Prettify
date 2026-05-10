import com.jwebmp.plugins.google.sourceprettify.PrettifyPageConfigurator;
import com.jwebmp.plugins.google.sourceprettify.implementations.GoogleCodePrettifyModuleInclusion;

module com.jwebmp.plugins.prettify {
    exports com.jwebmp.plugins.google.sourceprettify;

    requires com.jwebmp.core;
    requires com.jwebmp.client;
    requires com.jwebmp.core.base.angular.client;

    provides com.jwebmp.core.services.IPageConfigurator with PrettifyPageConfigurator;
    provides com.guicedee.client.services.config.IGuiceScanModuleExclusions with com.jwebmp.plugins.google.sourceprettify.implementations.GoogleSourceCodePrettifyExclusionsModule;
    provides com.guicedee.client.services.config.IGuiceScanModuleInclusions with GoogleCodePrettifyModuleInclusion;

    opens com.jwebmp.plugins.google.sourceprettify to com.fasterxml.jackson.databind, com.jwebmp.core, com.google.guice, com.jwebmp.core.angular;
    opens com.jwebmp.plugins.google.sourceprettify.implementations to com.fasterxml.jackson.databind, com.jwebmp.core, com.google.guice, com.jwebmp.core.angular;
}
