package api.data.gov.test;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.math.BigDecimal;
import java.net.URL;
import org.json.JSONArray;
import org.json.JSONObject;

public class chargePointNetwork {

	public static void main(String[] args) throws IOException, InterruptedException {
		
		// Enter your personal data key here
		String dataKey = "  ";
		
		// Other variables
		BigDecimal hyattAustinStationID = null;
		
		// Create URL
		URL baseURL = new URL("https://api.data.gov/nrel/alt-fuel-stations/v1/nearest.json?ev_network=ChargePoint+Network&location=Austin+TX&api_key=");
		URL keyedURL = new URL(baseURL + dataKey);
		
		StringBuilder inBuilder = new StringBuilder();
		String line;

		BufferedReader in = new BufferedReader(
		new InputStreamReader(keyedURL.openStream()));
		
		//br = new BufferedReader(new InputStreamReader(is));
		while ((line = in.readLine())!= null) { 
			inBuilder.append(line);
		}
				
		JSONObject obj = new JSONObject(inBuilder.toString());
		

		JSONArray arr = obj.getJSONArray("fuel_stations");
		for (int i = 0; i < arr.length(); i++)
		{
			
			String station_name = arr.getJSONObject(i).getString("station_name");
		    
			if (station_name.equals("HYATT AUSTIN")) {
			
		    hyattAustinStationID = arr.getJSONObject(i).getBigDecimal("id");
			}
			
		}
		
		if (hyattAustinStationID != null) {
			System.out.println("Hyatt Austin's Station ID is " + hyattAustinStationID);
		}
		else {
			System.out.println("Hyatt Austin not in search results");
		}
		
		in.close();
	
	}

}
