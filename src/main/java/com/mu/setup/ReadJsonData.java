package com.mu.setup;

import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

import org.json.JSONException;
import org.json.JSONObject;

import com.mu.pageobjects.CapiData;

public class ReadJsonData {
	
	public static final String WELCOMEAD = "welcomeAd";
	
	public static final String BARONE = "barOne";
	
	public static final String DOCK = "dock";
	
	public static final String INLINEUNIT = "inlineUnit";
	
	public static final String GATEWAY = "gateway";
	
	public static final String TRUNCATOR = "truncator";
	
	public static final String MOBILE_TRUNCATOR = "mobiletruncator";
	
	public static final String ACTIVE = "active";
	
	public static final String CAMPAIGN_NAME = "campaignName";
	
	public static final String CONFIG_SHEETNAME = "_SheetName";
	
	public static final String CONFIG_SEG_1 = "_SEG_1";
	
	public static final String CONFIG_SEG_2 = "_SEG_2";
	
	public static final String CONFIG_SEG_3 = "_SEG_3";
	
	public static final String CONFIG_SEG_4 = "_SEG_4";
	
	public static final String CONFIG_SEG_5 = "_SEG_5";
	
	public static final String CONFIG_SEG_6 = "_SEG_6";
	
	public static final String CONFIG_SEG_7 = "_SEG_7";
	
	public static final String CONFIG_SEG_8 = "_SEG_8";
	

	
	
	public static final String MAG_ENV_PRD = "prod";
	
	public static final String MAG_ENV_STG = "stage";
	
	public static final String MAG_PROD_PREFIX = "MAG_PROD_PREFIX";
	
	public static final String MAG_STAGE_PREFIX = "MAG_STAGE_PREFIX";
	
	public static final String MAG_CAPI_URL = "MAG_CAPI_URL";
	
	public static final String MAG_PRE_PROD = "MAG_PRE_PROD";
	
	public static final String MAG_PUBLISHED = "published";
	
	public static final String MAG_NOTPUBLISHED = "notpublished";
	
	public static final int CONFIG_ROW_FIRST = 3 ;
	
	public static final int CONFIG_ROW_SECOND = 11 ;
	
	public static final int CONFIG_COL = 8 ;
	
	public static String MAG_ENV = "";
	
	public static String MAG_PUBLISH = "false";
	
	
	
	
	
	public static List<CapiData> readJsonData(String url)  {
		
		try {
			
		JSONObject json = JsonReader.readJsonFromUrl(url);
		
		JSONObject myResponse = new JSONObject(json.toString());
	    
	    JSONObject jWelcomeAdObj = new JSONObject(myResponse.getJSONObject(WELCOMEAD).toString());
	    
	    JSONObject jBarOneObj = new JSONObject(myResponse.getJSONObject(BARONE).toString());
	    
	    JSONObject jDockObj = new JSONObject(myResponse.getJSONObject(DOCK).toString());
	    
	    JSONObject jInlineObj = new JSONObject(myResponse.getJSONObject(INLINEUNIT).toString());
	    
	    JSONObject JGatewayObj = new JSONObject(myResponse.getJSONObject(GATEWAY).toString());
	    
	    CapiData cWelcomeAdData= new CapiData();
	    
	    cWelcomeAdData.setAssetType(WELCOMEAD);
	    cWelcomeAdData.setActive(jWelcomeAdObj.get(ACTIVE).toString());
	    cWelcomeAdData.setCampaignName(jWelcomeAdObj.get(CAMPAIGN_NAME).toString());
	    
	    CapiData cBarOneData= new CapiData();
	    
	    cBarOneData.setAssetType(BARONE);
	    cBarOneData.setActive(jBarOneObj.get(ACTIVE).toString());
	    cBarOneData.setCampaignName(jBarOneObj.get(CAMPAIGN_NAME).toString());
	    
	    CapiData cDockData= new CapiData();
	    
	    cDockData.setAssetType(DOCK);
	    cDockData.setActive(jDockObj.get(ACTIVE).toString());
	    cDockData.setCampaignName(jDockObj.get(CAMPAIGN_NAME).toString());
	    
	    CapiData cInlineData= new CapiData();
	    
	    cInlineData.setAssetType(INLINEUNIT);
	    cInlineData.setActive(jInlineObj.get(ACTIVE).toString());
	    cInlineData.setCampaignName(jInlineObj.get(CAMPAIGN_NAME).toString());
	    
	    CapiData cGatewayData= new CapiData();
	    
	    cGatewayData.setAssetType(GATEWAY);
	    cGatewayData.setActive(JGatewayObj.get(ACTIVE).toString());
	    cGatewayData.setCampaignName(JGatewayObj.get(CAMPAIGN_NAME).toString());
	    
//	    System.out.println("welcomeAd - "+cWelcomeAdData.getCampaignName());
//	    System.out.println("barone- "+cBarOneData.getCampaignName());
//	    System.out.println("dock- "+cDockData.getCampaignName());
//	    System.out.println("inline- "+cInlineData.getCampaignName());
//	    System.out.println("gateway- "+cGatewayData.getCampaignName());
	    
	    List<CapiData> capiDataList = new ArrayList<CapiData>();
	    
	    capiDataList.add(cWelcomeAdData);
	    capiDataList.add(cBarOneData);
	    capiDataList.add(cDockData);
	    capiDataList.add(cInlineData);
	    capiDataList.add(cGatewayData);
	    
	    return capiDataList;
	    
		}
		catch(Exception e){
			e.printStackTrace();
			System.out.println(e);
			
			return null;
		}

	
	}
}
