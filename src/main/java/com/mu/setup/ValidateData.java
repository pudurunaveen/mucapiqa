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
							System.err.println("Test Campaign : " + ReadJsonData.MAG_TESTCAMPAIGN);
							// System.err.println(expCampaign);
							System.err.println("For the asset: " + expAssetType);
							System.err.println("Status not matched i.e. exp. status " + expStatus
									+ " and actual status is : " + actStatus);
							// For testNg report
							Reporter.log("Test Campaign : " + ReadJsonData.MAG_TESTCAMPAIGN);
							Reporter.log("For the asset: " + expAssetType);
							CustomVerify.verifyEquals(actStatus, expStatus);
						}
					} else {
						System.err.println("Test Campaign : " + ReadJsonData.MAG_TESTCAMPAIGN);
						// System.err.println(expCampaign);
						System.err.println("For the asset: " + expAssetType);
						System.err.println("Campaign name is not matched i.e. exp. campaign " + expCampaign
								+ " and actual campaign is : " + actCampaign);
						// For testNg report
						Reporter.log("Test Campaign : " + ReadJsonData.MAG_TESTCAMPAIGN);
						Reporter.log("For the asset: " + expAssetType);
						CustomVerify.verifyEquals(actCampaign, expCampaign);
					}

				}

			}
		}
	}

	public static void validateGatewayCAPIData(List<CapiData> actList, String className, String typeOfSale,
			String location) {

		String subsPath = "";
		String subsAudienceName = "";
		String creativePath = "";

		if ("Sale".equalsIgnoreCase(typeOfSale) || "BAU".equalsIgnoreCase(typeOfSale)) {
			subsPath = ReadPropertiesFile.readProperty(typeOfSale + "_" + location + "_Subs_Path");
			//subsAudienceName = ReadPropertiesFile.readProperty(typeOfSale + "_" + location + "_Subs_Audience");
			creativePath = ReadPropertiesFile.readProperty(typeOfSale + "_" + location + "_Creative_Path");

		} else {

		}

		for (int i = 0; i < actList.size(); i++) {

			CapiData actData = actList.get(i);

			String actAssetType = actData.getAssetType();

			if (actAssetType.equalsIgnoreCase(ReadJsonData.GATEWAY)) {

				String gwSubsPath = actData.getGwSubsPath();
				//String gwSubsAudienceName = actData.getGwSubsAudienceName();

				String gwCreativePath = actData.getGwCreativePath();

				if (subsPath.equalsIgnoreCase(gwSubsPath)) {

				} else {
					System.err.println(ReadJsonData.GATEWAY + " targetingInfo for Test Campaign : " + ReadJsonData.MAG_TESTCAMPAIGN);
					System.err.println("Subscription path is not matched i.e. exp. path " + subsPath
							+ " and actual path is : " + gwSubsPath);
					// For testNg report
					Reporter.log(ReadJsonData.GATEWAY + " targetingInfo for Test Campaign : " + ReadJsonData.MAG_TESTCAMPAIGN);
					CustomVerify.verifyEquals(gwSubsPath, subsPath);

				}

//				if (!subsAudienceName.equalsIgnoreCase(gwSubsAudienceName)) {
//
//					System.err.println(ReadJsonData.GATEWAY + " targetingInfo for Test Campaign : " + ReadJsonData.MAG_TESTCAMPAIGN);
//					System.err.println("Subscription audienceName is not matched i.e. exp. audienceName "
//							+ subsAudienceName + " and actual audienceName is : " + gwSubsAudienceName);
//					// For testNg report
//					Reporter.log(ReadJsonData.GATEWAY + " targetingInfo for Test Campaign : " + ReadJsonData.MAG_TESTCAMPAIGN);
//					CustomVerify.verifyEquals(gwSubsAudienceName, subsAudienceName);
//
//				}

				if (!creativePath.equalsIgnoreCase(gwCreativePath)) {
					System.err.println(ReadJsonData.GATEWAY + " targetingInfo for Test Campaign : " + ReadJsonData.MAG_TESTCAMPAIGN);
					System.err.println("Creative path is not matched i.e. exp. path " + creativePath
							+ " and actual path is : " + gwCreativePath);
					// For testNg report
					Reporter.log(ReadJsonData.GATEWAY + " targetingInfo for Test Campaign : " + ReadJsonData.MAG_TESTCAMPAIGN);
					CustomVerify.verifyEquals(gwCreativePath, creativePath);

				}

			}
		}
	}

}
