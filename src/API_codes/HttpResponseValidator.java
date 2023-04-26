package API_codes;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.net.HttpURLConnection;
import java.net.URL;

public class HttpResponseValidator {
	
	 public static void main(String[] args) throws IOException {
	        // Example URL to send HTTP request to
	        String urlString = "https://jsonplaceholder.typicode.com/todos/1";

	        URL url = new URL(urlString);
	        HttpURLConnection connection = (HttpURLConnection) url.openConnection();

	        // Set HTTP method
	        connection.setRequestMethod("GET");

	        // Send HTTP request
	        connection.connect();

	        // Check HTTP response code
	        int responseCode = connection.getResponseCode();
	        if (responseCode == HttpURLConnection.HTTP_OK) {
	            // Read HTTP response
	            BufferedReader in = new BufferedReader(new InputStreamReader(connection.getInputStream()));
	            String inputLine;
	            StringBuffer response = new StringBuffer();

	            while ((inputLine = in.readLine()) != null) {
	                response.append(inputLine);
	            }
	            in.close();

	            // Validate HTTP response
	            String responseBody = response.toString();
	            System.out.println("Response body: " + responseBody);
	            // Perform validation on response body here
	        } else {
	            System.out.println("HTTP error code: " + responseCode);
	        }

	        // Disconnect HTTP connection
	        connection.disconnect();
	    }

}
