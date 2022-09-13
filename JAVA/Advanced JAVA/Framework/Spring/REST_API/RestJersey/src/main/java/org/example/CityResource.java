package org.example;

import jakarta.ws.rs.GET;
import jakarta.ws.rs.Path;
import jakarta.ws.rs.Produces;
import jakarta.ws.rs.core.MediaType;

@Path("cities")             //in url when /cities will call this java file been referred
public class CityResource {

    @GET                                    //GET Annotation is for getting something from server
    @Produces(MediaType.APPLICATION_JSON)   //We are asking for "JSON" type of data from the server. We can also ask for text and xml
    public CIty getCity(){
        CIty cIty = new CIty(101,"Bhopal");
        return cIty;
    }

}
