package com.gcvms.services.rest;

import javax.ws.rs.Consumes;
import javax.ws.rs.GET;
import javax.ws.rs.POST;
import javax.ws.rs.Path;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;
import javax.ws.rs.core.Response;


@Path("/daily")
public class GCVMSService {

    @GET
    @Path("/login")
    @Produces({ MediaType.APPLICATION_JSON })
    public Response authenticate(){
    	System.out.println("login success");
    	return Response.status(200).entity("success").header("Access-Control-Allow-Origin", "*").build();
    }
 
    @POST
    @Path("/create")
    @Consumes({ MediaType.APPLICATION_JSON })
    @Produces({ MediaType.APPLICATION_JSON })
    public Response createDaily(DailyTripVO dailyTrip) {
    System.out.println(dailyTrip.toString());	
        return Response.status(201).entity("successfull").header("Access-Control-Allow-Origin", "*").build();
    }

    @GET
    @Path("/getall")
    @Produces({ MediaType.APPLICATION_JSON })
    public Response getAllVehicle(){
    	return Response.status(200).entity(new VehiclePopulator().getSampleSet()).header("Access-Control-Allow-Origin", "*").build();
    }
 
    @POST
    @Path("/createvehicle")
    @Consumes({ MediaType.APPLICATION_JSON })
    @Produces({ MediaType.APPLICATION_JSON })
    public Response create(VehicleVO vehicle) {
    System.out.println(vehicle.toString());	
        return Response.status(201).entity("successfull").header("Access-Control-Allow-Origin", "*").build();
    }

//  @GET
//  @Path("/create")
//  @Consumes({ MediaType.APPLICATION_JSON })
//  @Produces({ MediaType.APPLICATION_JSON })
//  public Response createVehicle(VehicleVO vehicle){
//  	System.out.println(vehicle.toString());	
//      return Response.status(200).entity("successfully saved").header("Access-Control-Allow-Origin", "*").build();
//  }

}