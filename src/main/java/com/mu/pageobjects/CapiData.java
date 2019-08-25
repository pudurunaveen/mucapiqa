package com.mu.pageobjects;

import java.util.List;

public class CapiData {

	private String active;

	private String campaignName;

	private String assetType;
	
	private String gwSubsPath;
	
	private String gwSubsAudienceName;
	
	private String gwCreativePath;

	private List<CapiData> capiData;

	public String getActive() {
		return active;
	}

	public void setActive(String active) {
		this.active = active;
	}

	public String getCampaignName() {
		return campaignName;
	}

	public void setCampaignName(String campaignName) {
		this.campaignName = campaignName;
	}

	public String getAssetType() {
		return assetType;
	}

	public void setAssetType(String assetType) {
		this.assetType = assetType;
	}

	public String getGwSubsPath() {
		return gwSubsPath;
	}

	public void setGwSubsPath(String gwSubsPath) {
		this.gwSubsPath = gwSubsPath;
	}

	public String getGwSubsAudienceName() {
		return gwSubsAudienceName;
	}

	public void setGwSubsAudienceName(String gwSubsAudienceName) {
		this.gwSubsAudienceName = gwSubsAudienceName;
	}

	public String getGwCreativePath() {
		return gwCreativePath;
	}

	public void setGwCreativePath(String gwCreativePath) {
		this.gwCreativePath = gwCreativePath;
	}

}
