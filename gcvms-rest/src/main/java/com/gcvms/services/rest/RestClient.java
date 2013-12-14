package com.gcvms.services.rest;

import javax.ws.rs.core.MediaType;

import com.sun.jersey.api.client.Client;
import com.sun.jersey.api.client.ClientResponse;
import com.sun.jersey.api.client.WebResource;



public class RestClient {
    
    
    private static final String WEB_REST = "http://localhost:8999/gcvms/rest";
    
    private static final String VEHICLE = "/vehicle";
    static Client client = Client.create();
        
    public static void createVehicle() {

        String CREATE = "/create";
        WebResource webResource = client.resource(WEB_REST +VEHICLE+ CREATE );
        String parameter =
                "{\"id\":\"10\",\"type\":\"large\",\"routeId\":\"1012\"}";
        
        ClientResponse response = webResource.type(MediaType.APPLICATION_JSON).post(ClientResponse.class, parameter);
        
        if (response.getStatus() != 201) {
            throw new RuntimeException("Failed : HTTP error code : " + response.getStatus());
        }
//        VehicleVO vo = response.getEntity(VehicleVO.class);
        System.out.println(response.toString());
        return;
    }

    public static void main(String... strings) {
      		createVehicle();
    }

}
