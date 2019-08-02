package com.mu.setup;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.net.HttpURLConnection;
import java.net.URL;
import org.json.JSONObject;

public class Send_HTTP_Request2 {
	public static void main(String[] args) {
		try {
			Send_HTTP_Request2.call_me();
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

	public static void call_me() throws Exception {
		String url = "https://mwcm.nytimes.com/capi/metered_assets?mc=1&mr=0&ma=1&counted=false&granted=true&abra=MC_magnolia_0519%3D1_magnolia&pre_prod=true&plat=web&areas=barOne&areas=dock&areas=inlineUnit&areas=welcomeAd&areas=truncator&areas=gateway";
		URL obj = new URL(url);

		HttpURLConnection con = (HttpURLConnection) obj.openConnection();

		// optional default is GET
		con.setRequestMethod("GET");
		// add request header
		con.setRequestProperty("User-Agent", "Chrome/75.0.3770.142");
		int responseCode = con.getResponseCode();
		System.out.println("\nSending 'GET' request to URL : " + url);
		System.out.println("Response Code : " + responseCode);
		BufferedReader in = new BufferedReader(new InputStreamReader(con.getInputStream()));
		String inputLine;
		StringBuffer response = new StringBuffer();
		while ((inputLine = in.readLine()) != null) {
			response.append(inputLine);
		}
		in.close();
		// print in String
		// System.out.println(response.toString());
		// Read JSON response and print
		JSONObject myResponse = new JSONObject(response.toString());

		System.out.println("result after Reading JSON Response");
		// System.out.println(myResponse.toString());

		JSONObject welcomeAdObj = new JSONObject(myResponse.getJSONObject("welcomeAd").toString());

		JSONObject baroneObj = new JSONObject(myResponse.getJSONObject("barOne").toString());

		JSONObject dockObj = new JSONObject(myResponse.getJSONObject("dock").toString());

		JSONObject inlineObj = new JSONObject(myResponse.getJSONObject("inlineUnit").toString());

		JSONObject gatewayObj = new JSONObject(myResponse.getJSONObject("gateway").toString());

		// System.out.println(welcomeAdObj);

		System.out.println("welcomeAdObj- " + welcomeAdObj.get("active").toString() + ", "
				+ welcomeAdObj.get("campaignName").toString());

		System.out.println(
				"baroneObj- " + baroneObj.get("active").toString() + ", " + baroneObj.get("campaignName").toString());
		System.out.println(
				"dockObj- " + dockObj.get("active").toString() + ", " + dockObj.get("campaignName").toString());
		System.out.println(
				"inlineObj- " + inlineObj.get("active").toString() + ", " + inlineObj.get("campaignName").toString());
		System.out.println("gatewayObj- " + gatewayObj.get("active").toString() + ", "
				+ gatewayObj.get("campaignName").toString());

		// System.out.println("welcomeAdObj(status, cmpgn : " +
		// welcomeAdObj.getString("active") + ", " +
		// welcomeAdObj.getString("campaignName"));

//     System.out.println("statusCode- "+myResponse.getString("welcomeAd"));
//     System.out.println("statusMessage- "+myResponse.getString("barone"));
//     System.out.println("ipAddress- "+myResponse.getString("dock"));
//     System.out.println("countryCode- "+myResponse.getString("inlineunit"));
//     System.out.println("countryName- "+myResponse.getString("gateway"));
//     System.out.println("regionName- "+myResponse.getString("regionName"));
//     System.out.println("cityName- "+myResponse.getString("cityName"));
//     System.out.println("zipCode- "+myResponse.getString("zipCode"));
//     System.out.println("latitude- "+myResponse.getString("latitude"));
//     System.out.println("longitude- "+myResponse.getString("longitude"));
//     System.out.println("timeZone- "+myResponse.getString("timeZone"));  
	}
}