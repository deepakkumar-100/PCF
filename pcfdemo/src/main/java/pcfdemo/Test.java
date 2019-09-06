package pcfdemo;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.net.HttpURLConnection;
import java.net.MalformedURLException;
import java.net.URL;

public class Test {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		
		  
		  for(int i=1; i<=1000; i++) { try {
		  
		  URL url = new URL("https://springpostgresqldeepak.cfapps.io/app/all");
			 // URL url = new URL("https://pcfdemobharat.cfapps.io/greet/Deepak");
		  
		  HttpURLConnection conn = (HttpURLConnection) url.openConnection();
		  conn.setRequestMethod("GET"); conn.setRequestProperty("Accept",
		  "application/json");
		  
		  if (conn.getResponseCode() != 200) { throw new
		  RuntimeException("Failed : HTTP error code : " + conn.getResponseCode()); }
		  
		  BufferedReader br = new BufferedReader(new InputStreamReader(		  (conn.getInputStream())));
		  
		  String output; System.out.println("Output from Server .... \n"); while
		  ((output = br.readLine()) != null) { System.out.println(output); }
		  
		  conn.disconnect();
		  
		  } catch (MalformedURLException e) {
		  
		  e.printStackTrace();
		  
		  } catch (IOException e) {
		  
		  e.printStackTrace();
		  
		  }
		  }
	}
}
		  
		 	