package com.jyu.task3.comment;

import javax.ws.rs.*;
import javax.ws.rs.core.MediaType;
import javax.ws.rs.core.Response;
import java.util.List;

@Path("/")
@Consumes(MediaType.APPLICATION_JSON)
@Produces(MediaType.APPLICATION_JSON)
public class CommentResource {
    private Comments commentsList = new Comments();

    @GET
    public Response getCommentslist(@PathParam("userID") int UserID){
        return Response.ok(commentsList).build();
    }

    @Path("/add")
    @POST
    @Consumes({"application/json", "application/xml"})
    public Response addComment(Comment c){
        commentsList.add(c);
        return Response.ok().build();
    }

}
