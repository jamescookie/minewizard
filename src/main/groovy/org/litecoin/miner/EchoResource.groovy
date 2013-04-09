package org.litecoin.miner

import com.yammer.dropwizard.jersey.params.DateTimeParam
import com.yammer.dropwizard.jersey.params.IntParam
import com.yammer.metrics.annotation.Timed

import javax.ws.rs.GET
import javax.ws.rs.Path
import javax.ws.rs.PathParam
import javax.ws.rs.Produces
import javax.ws.rs.core.MediaType
import javax.ws.rs.core.Response

@Path("/")
@Produces(MediaType.APPLICATION_JSON)
public class EchoResource {
    EchoResource() {
    }

    @GET
    @Path("")
    String echo() {
        "hello"
    }
}
