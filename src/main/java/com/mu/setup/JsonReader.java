package com.mu.setup;

import java.io.IOException;
import java.net.MalformedURLException;
import java.net.URL;
import java.nio.charset.Charset;

import org.apache.commons.io.IOUtils;
import org.json.JSONException;
import org.json.JSONObject;

public class JsonReader {

	public static JSONObject readJsonFromUrl(String capiUrl) throws JSONException, IOException {

		URL url = new URL(capiUrl);

		JSONObject json = new JSONObject(IOUtils.toString(url, Charset.forName("UTF-8")));

		return json;

	}

	public static void main(String[] args) throws IOException, JSONException {

		String capiURL = "https://mwcm.nytimes.com/capi/metered_assets?mc=2&mr=0&ma=1&counted=false&granted=true&abra=MC_magnolia_0519%3D1_magnolia&pre_prod=true&areas=barOne&areas=dock&areas=inlineUnit&areas=welcomeAd&areas=truncator&areas=gateway&plat=web&us=anon&adblock=true";
		JSONObject json = readJsonFromUrl(capiURL);
		System.out.println(json.toString());
		// System.out.println(json.get("id"));

		JSONObject myResponse = new JSONObject(json.toString());

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

	}

}
