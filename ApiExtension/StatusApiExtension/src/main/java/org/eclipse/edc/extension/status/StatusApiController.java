package org.eclipse.edc.extension.status;


import jakarta.ws.rs.Consumes;
import jakarta.ws.rs.GET;
import jakarta.ws.rs.Path;
import jakarta.ws.rs.Produces;
import jakarta.ws.rs.core.MediaType;
import org.eclipse.edc.spi.monitor.Monitor;

import static java.lang.String.format;

/**
 * This class defines an API endpoint that responds with the status of the connector.
 * It is exposed as a REST API and can be accessed via an HTTP GET request.
 * 
 * The API is designed to provide a simple "status" endpoint that can be used 
 * to check if the connector is running properly.
 */
@Consumes({MediaType.APPLICATION_JSON})
@Produces({MediaType.APPLICATION_JSON})
@Path("/")
public class StatusApiController {

    private final Monitor monitor;
    private final String logPrefix;

    /**
     * Constructor that initializes the monitor and log prefix.
     * 
     * @param monitor the monitor used for logging status
     * @param logPrefix the prefix to be used in log messages
     */
    public StatusApiController(Monitor monitor, String logPrefix) {
        this.monitor = monitor;
        this.logPrefix = logPrefix;
    }
   
    /**
     * This method is triggered by a GET request to the "status" path.
     * It logs the incoming request and responds with a JSON message indicating that the connector is running.
     * 
     * @return a JSON string indicating the connector's status
     */
    @GET
    @Path("status")
    public String checkStatus() {
        monitor.info(format("%s :: Received a status request", logPrefix));
        return "{\"response\":\"Connector Running\"}";
    }
}
