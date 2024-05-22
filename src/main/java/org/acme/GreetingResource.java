package org.acme;

import jakarta.ws.rs.GET;
import jakarta.ws.rs.Path;
import jakarta.ws.rs.Produces;
import jakarta.ws.rs.core.MediaType;
import org.eclipse.microprofile.config.inject.ConfigProperty;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

@Path("/hello")
public class GreetingResource {
    Logger logger = LoggerFactory.getLogger(GreetingResource.class);
    @ConfigProperty(name = "test")
    String prop;

    @GET
    @Produces(MediaType.TEXT_PLAIN)
    public String hello() {
        return "Hello: %s".formatted(prop);
    }
}
