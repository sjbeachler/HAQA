package api.data.gov.test;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.math.BigDecimal;
import java.net.URL;


import org.json.JSONArray;
import org.json.JSONObject;



public class hyattStationAddress {

	public static void main(String[] args) throws IOException, InterruptedException {
		
		// Enter your personal data key here
		String dataKey = " ";
		
		// Other variables
		String expectedAddress = "208 Barton Springs, Austin, Texas, USA, 78704";
		String hyattAustinStationStreetAddress = null;
	    String hyattAustinStationCity = null;
	    String hyattAustinStationState = null;
	    String hyattAustinStationCountry = null;
	    String hyattAustinStationZip = null;
	    String fullAddress = null;
		
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
			
			int hyattAustinStationID = arr.getJSONObject(i).getInt("id");
			
			if (hyattAustinStationID == 62029) {
		    hyattAustinStationStreetAddress = arr.getJSONObject(i).getString("street_address");
		    hyattAustinStationCity = arr.getJSONObject(i).getString("city");
		    hyattAustinStationState = arr.getJSONObject(i).getString("state");
		    hyattAustinStationZip = arr.getJSONObject(i).getString("zip");
			
		    /*
		     * Added in case we were expected to extrapolate.
		     * Otherwise, this test fails.
		     * Uncomment to get a pass.
		     *
		     
		    if (hyattAustinStationStreetAddress.equals("208 Barton Springs Rd")) {
		    	hyattAustinStationStreetAddress = "208 Barton Springs";
		    }
		    
		    if (hyattAustinStationState.equals("TX")) {
		    	hyattAustinStationState = "Texas";
		    	hyattAustinStationCountry = "USA";
		    }
		    
		    */
			
			}
		}
		
	    fullAddress = (hyattAustinStationStreetAddress + ", " + hyattAustinStationCity + ", " +
	    		hyattAustinStationState + ", " + hyattAustinStationCountry + ", " + hyattAustinStationZip);
		
		if (fullAddress.equals(expectedAddress)) {
			System.out.println("Hyatt Austin's address is as expected:  " + fullAddress);
		}
		else {
			System.out.println("Hyatt Austin's address does not match the expected address.");
			System.out.println("Expected:  " + expectedAddress);
			System.out.println("Actual:  " + fullAddress);
		}
		
		in.close();
	
	}

}
