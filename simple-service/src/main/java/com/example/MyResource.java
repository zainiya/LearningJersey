package com.example;

import java.net.URI;
import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.Produces;
//import javax.ws.rs.core.MediaType;
import javax.ws.*;
import javax.ws.rs.PUT;
import javax.ws.rs.core.Response;
import javax.ws.rs.*;
import org.glassfish.jersey.server.spi.Container;

/**
 * Root resource (exposed at "myresource" path)
 */
@Path("/helloworld")
public class MyResource {

    /**
     * Method handling HTTP GET requests. The returned object will be sent
     * to the client as "text/plain" media type.
     *
     * @return String that will be returned as a text/plain response.
     */
//    @GET
//    @Produces(MediaType.TEXT_PLAIN)
//    public String getIt() {
//        return "Got it!";
//    } 
    public static final String CLICHED_MESSAGE = "Hello World!";

    @GET
    @Path("{username}")
        public Response getHello(@PathParam("username") String userName) {
        return Response.status(200).entity("getUserByName " + userName).build();
    }

//    @PUT
//    public Response putContainer(){
//        System.out.println("PUT CONTAINER " + container);
//        URI uri = uriInfo.getAbsolutePath();
//        Container c = new Container(container, uri.toString());
//
//        Response r;
//        if(!MemoryStore.MS.hasContainer(c)){
//            r = Response.created(uri).build();
//        }else{
//            r = Response.noContent().build();
//        }
//
//        MemeoryStore.MS.createContainer(c);
//        return r;
//    }

}
