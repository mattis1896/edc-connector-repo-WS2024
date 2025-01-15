package org.eclipse.edc.extension.status;

import org.eclipse.edc.runtime.metamodel.annotation.Inject;
import org.eclipse.edc.spi.system.ServiceExtension;
import org.eclipse.edc.spi.system.ServiceExtensionContext;
import org.eclipse.edc.web.spi.WebService;

/**
 * This class represents an extension for the EDC (Eclipse Data Space Connector) system
 * that registers the Status API endpoint.
 * 
 * It implements the `ServiceExtension` interface, which is used to extend the EDC runtime
 * and provides functionality to register custom web resources like the `StatusApiController`.
 */
public class StatusEndpointExtension implements ServiceExtension {

    private static final String LOG_PREFIX_SETTING = "edc.samples.basic.03.logprefix"; // From the official samples
    @Inject
    WebService webService;


    /**
     * This method is called during the initialization of the EDC extension.
     * It retrieves the log prefix from the configuration settings and registers the `StatusApiController`
     * as a web resource with the EDC WebService.
     * 
     * @param context the ServiceExtensionContext that provides access to the extension's settings
     */
    @Override
    public void initialize(ServiceExtensionContext context) {
        var logPrefix = context.getSetting(LOG_PREFIX_SETTING, "status");
        webService.registerResource(new StatusApiController(context.getMonitor(), logPrefix));
    }
}
