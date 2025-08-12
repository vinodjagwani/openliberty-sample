package com.demo.openliberty.rest;

import jakarta.ws.rs.GET;
import jakarta.ws.rs.Path;
import jakarta.ws.rs.Produces;
import jakarta.ws.rs.core.MediaType;
import jakarta.ws.rs.core.Response;
import java.util.Map;

@Path("/hello")
public class HelloResource {

    @GET
    @Produces(MediaType.APPLICATION_JSON)
    public Response hello() {
        Map<String, String> msg = Map.of(
                "message", "Hello from Open Liberty!",
                "status", "ok"
        );
        return Response.ok(msg).build();
    }
}
