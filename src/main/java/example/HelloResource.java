package example;

import jakarta.validation.Valid;
import jakarta.ws.rs.GET;
import jakarta.ws.rs.Path;
import jakarta.ws.rs.QueryParam;
import jakarta.ws.rs.QueryParam;
import jakarta.ws.rs.core.MultivaluedMap;

@Path("/hello")
public class HelloResource {

    @GET
    public String hello(@QueryParam("number") int number) {
        System.out.println("### number: " + number);
        return "Received: " + number;
    }

}
