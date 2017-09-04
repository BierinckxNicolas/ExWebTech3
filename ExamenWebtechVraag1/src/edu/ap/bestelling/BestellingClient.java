package edu.ap.bestelling;

import org.restlet.resource.ClientResource;

public class BestellingClient {

	public static void main(String[] args) {
        
        try {
       	ClientResource resource = new ClientResource("http://localhost:8080/overzicht/bestellingen");
       	// Post a new race
       	String bestelling1 = "<?xml version=\"1.0\" encoding=\"UTF-8\" standalone=\"yes\"?>";
       	bestelling1 += "<bestelling id=\"1\" nameKlant=\"Nicolas Bierinckx\" adresss=\"Galgeveld 20, 2200 Herentals\" datebestelling=\"04/09/2017 - 12:00\" nameProduct=\"Ben & Jerry ijs\">";
       	bestelling1 += "<hoeveelheid>5</hoeveelheid>";
       	bestelling1 += "</bestelling>";
   		resource.post(bestelling1);
   		// get the response
       	System.out.println(resource.getResponseEntity().getText());
       	
       	String bestelling2 = "<?xml version=\"1.0\" encoding=\"UTF-8\" standalone=\"yes\"?>";
       	bestelling2 += "<bestelling id=\"2\" nameKlant=\"Julie Jacobs\" adress=\"adress=\"Hopland 12, 2000 Antwerpen\" datebestelling=\"04/09/2017 - 14:00\"  nameProduct=\"Shampoo\">";
       	bestelling2 += "<hoeveelheid>3</hoeveelheid>";
       	bestelling2 += "</bestelling>";
   		resource.post(bestelling2);
   		// get the response
       	System.out.println(resource.getResponseEntity().getText());
       }
       catch (Exception e) {
           System.out.println("In main : " + e.getMessage());
       }

	}

}
