package edu.ap.producten;

import java.util.ArrayList;

import org.json.JSONObject;
import org.json.JSONArray;
import org.restlet.resource.Get;
import org.restlet.resource.Post;
import org.restlet.resource.ServerResource;

public class ProductResource extends ServerResource {

	@Get("txt")
	public String allProducts() {
		
		JSONArray a = (JSONArray)parser.parse(new FileReader("/Users/nicolas/Documents/workspace/ExamenWebtechVraag2/producten.json”));

		  for (Object o : a)
		  {
		    JSONObject product = (JSONObject) o;
		    String name = (String) product.get("productName");
		    String producent = (String) product.get("producent");
		    String prijs = (String) product.get("price");
		  }

		return a.toString();
	}
	
	@Post("txt")
	public void newProduct(String json, String naam, String producent, String prijs) {
		
		JSONObject obj = new JSONObject(json);
		obj.put("productName", naam);
		obj.put("producent", producent);
		obj.put("price", prijs);
		try (JSONWriter file = new JSONWriter("/Users/nicolas/Documents/workspace/ExamenWebtechVraag2/producten.json”)) {
			file.write(obj.toJSONString());
		}	
	}
}