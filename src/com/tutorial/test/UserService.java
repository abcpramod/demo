package com.tutorial.test;

//import java.util.List;

import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;
import javax.ws.rs.core.Response;
import javax.ws.rs.core.Response.ResponseBuilder;
import javax.ws.rs.core.Response.Status;

@Path("/UserService")
public class UserService {
   UserDao userDao = new UserDao();
	
    
	@GET
    @Path("/users")
    @Produces(MediaType.APPLICATION_XML)
	public Response getUsers(){
	 
    	ResponseBuilder builder = Response.status(Status.OK).entity(userDao.getAllUsers());
    	Response response = builder.build();
    	return response ;
		
    	
	}
}
