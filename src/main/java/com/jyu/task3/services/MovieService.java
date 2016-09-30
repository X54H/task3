package com.jyu.task3.services;

import com.jyu.task3.user.User;
import com.jyu.task3.user.Users;

import javax.ws.rs.*;
import javax.ws.rs.core.Response;


@Path("/movies")
public class MovieService {

  //return movies list
  @GET
  @Produces({"application/json", "application/xml"})
  public Response get(){

    return Response.ok(Users.getInstance()).build();

  }

  //you can inser an user
  @Path("add")
  @POST
  @Consumes({"application/json", "application/xml"})
  @Produces({"application/json", "application/xml"})
  public Response addUser(User u){
    Users.getInstance().add(u);
    return Response.ok().build();
  }

  //return an user
  @Path("get/{name}")
  @GET
  @Produces({"application/json", "application/xml"})
  public Response getByName(@PathParam("name") String name){
    User u = Users.getInstance().getByName(name);
    if(u!=null)
      return Response.ok(u).build();
    else
      return Response.status(Response.Status.NOT_FOUND).build();
  }
} 
