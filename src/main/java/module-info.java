import com.jwebmp.plugins.google.sourceprettify.PrettifyPageConfigurator;
import com.jwebmp.plugins.google.sourceprettify.implementations.GoogleCodePrettifyModuleInclusion;

module com.jwebmp.plugins.prettify {
    exports com.jwebmp.plugins.google.sourceprettify;

    requires com.jwebmp.core;
    requires com.jwebmp.client;

    requires jakarta.validation;
    requires java.logging;

    provides com.jwebmp.core.services.IPageConfigurator with PrettifyPageConfigurator;
    provides com.guicedee.guicedinjection.interfaces.IGuiceScanModuleExclusions with com.jwebmp.plugins.google.sourceprettify.implementations.GoogleSourceCodePrettifyExclusionsModule;
    provides com.guicedee.guicedinjection.interfaces.IGuiceScanModuleInclusions with GoogleCodePrettifyModuleInclusion;

    opens com.jwebmp.plugins.google.sourceprettify to com.fasterxml.jackson.databind, com.jwebmp.core;
}
