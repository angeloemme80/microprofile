package it.angelomassaro.microprofile;

import javax.inject.Singleton;
import javax.json.Json;
import javax.json.JsonObject;
import javax.json.JsonObjectBuilder;
import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;

/**
 *
 */
@Path("/avvocato")
@Singleton
public class HelloController {

    @GET
    public String sayHello() {
        return "Hello World";
    }
    
    @GET
    @Path("/uno")
    @Produces(MediaType.APPLICATION_JSON)
    public JsonObject json() {
    	JsonObjectBuilder builder = Json.createObjectBuilder();
		return builder.add("nome", "Angela")
				.add("cognome", "Russo")
				.add("eta", 41)
				.add("timestamp", System.currentTimeMillis())
                .build();
    }
    
    
}
