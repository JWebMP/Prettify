import com.jwebmp.plugins.google.sourceprettify.PrettifyPageConfigurator;
module com.jwebmp.plugins.prettify {
    exports com.jwebmp.plugins.google.sourceprettify;

    requires com.jwebmp.core;
    requires com.jwebmp.client;
    requires com.jwebmp.core.base.angular.client;

    provides com.jwebmp.core.services.IPageConfigurator with PrettifyPageConfigurator;
    provides com.guicedee.client.services.config.IGuiceScanModuleExclusions with com.jwebmp.plugins.google.sourceprettify.implementations.GoogleSourceCodePrettifyExclusionsModule;

    opens com.jwebmp.plugins.google.sourceprettify to tools.jackson.databind, com.jwebmp.core, com.google.guice, com.jwebmp.core.angular;
    opens com.jwebmp.plugins.google.sourceprettify.implementations to tools.jackson.databind, com.jwebmp.core, com.google.guice, com.jwebmp.core.angular;

    provides com.guicedee.client.services.config.IGuiceScanJarExclusions with com.jwebmp.plugins.google.sourceprettify.implementations.GoogleSourceCodePrettifyExclusionsModule;
}
