package com.mu.setup;

import java.util.List;

import org.testng.Assert;
import org.testng.Reporter;

import com.mu.pageobjects.CapiData;

public class ValidateData {

	public static void validateCAPIData(List<CapiData> expList, List<CapiData> actList) {

		for (int i = 0; i < expList.size(); i++) {

			CapiData expData = expList.get(i);

			String expAssetType = expData.getAssetType();
			String expStatus = expData.getActive();
			String expCampaign = expData.getCampaignName();

			for (int j = 0; j < actList.size(); j++) {

				if (expAssetType.equals(actList.get(j).getAssetType())) {

					String actCampaign = actList.get(j).getCampaignName();
					String actStatus = actList.get(j).getActive();

					if (expCampaign.equalsIgnoreCase(actCampaign)) {
						// System.out.println("Campaign name is matched i.e. " + expCampaign);
						if (expStatus.equalsIgnoreCase(actStatus)) {
							// System.out.println("Status is matched i.e. " + expStatus);
						} else {
							System.err.println(expCampaign);
							System.err.println("For the asset: " + expAssetType);
							System.err.println("Status not matched i.e. exp. status " + expStatus
									+ " and actual status is : " + actStatus);
							// For testNg report
							Reporter.log("For the asset: " + expAssetType);
							CustomVerify.verifyEquals(actStatus, expStatus);
						}
					} else {
						System.err.println(expCampaign);
						System.err.println("For the asset: " + expAssetType);
						System.err.println("Campaign name is not matched i.e. exp. campaign " + expCampaign
								+ " and actual campaign is : " + actCampaign);
						// For testNg report
						Reporter.log("For the asset : " + expAssetType);
						CustomVerify.verifyEquals(actCampaign, expCampaign);
					}


				}

			}
		}
	}

}
