package com.mu.setup;

import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

import org.apache.poi.ss.usermodel.Sheet;

import com.mu.pageobjects.CapiData;

public class ReadTestData {

	private static final String MU_CAPI_EXCEL_FILE = "MU's Capi Response_V1.1.xlsx";

	public static void readMagData(String sheetName) {

		// Create an object of ReadExcelFile class

		ReadExcelFile objExcelFile = new ReadExcelFile();

		// Prepare the path of excel file

		String filePath = System.getProperty("user.dir") + "\\src\\test\\resources";

		// Call read file method of the class to read data

		try {

			String excelSheetName = ReadPropertiesFile.readProperty(sheetName);

			Sheet sheet = objExcelFile.readExcel(filePath, MU_CAPI_EXCEL_FILE, excelSheetName);

			System.out.println("read excel file is done");

			System.out.println(sheet.getRow(3).getCell(4).getStringCellValue());

			String welcomeAdStatus = sheet.getRow(3).getCell(4).getStringCellValue();
			String baroneStatus = sheet.getRow(4).getCell(4).getStringCellValue();
			String dockStatus = sheet.getRow(5).getCell(4).getStringCellValue();
			String inlineStatus = sheet.getRow(6).getCell(4).getStringCellValue();
			String gatewayStatus = sheet.getRow(7).getCell(4).getStringCellValue();

			CapiData magWelcomeAd = new CapiData();
			CapiData magBarone = new CapiData();
			CapiData magDock = new CapiData();
			CapiData magInline = new CapiData();
			CapiData magGateway = new CapiData();

			String magCampaignName = ReadPropertiesFile.readProperty(sheetName + "_MAG_CampaignName");

			magWelcomeAd.setActive(welcomeAdStatus);
			magWelcomeAd.setAssetType(ReadJsonData.WELCOMEAD);
			magWelcomeAd.setCampaignName(magCampaignName);

			magBarone.setActive(baroneStatus);
			magBarone.setAssetType(ReadJsonData.BARONE);
			magBarone.setCampaignName(magCampaignName);

			magDock.setActive(dockStatus);
			magDock.setAssetType(ReadJsonData.DOCK);
			magDock.setCampaignName(magCampaignName);

			magInline.setActive(inlineStatus);
			magInline.setAssetType(ReadJsonData.INLINEUNIT);
			magInline.setCampaignName(magCampaignName);

			magGateway.setActive(gatewayStatus);
			magGateway.setAssetType(ReadJsonData.GATEWAY);
			magGateway.setCampaignName(magCampaignName);

			int expUrlsCnt = Integer.parseInt(ReadPropertiesFile.readProperty(sheetName + "_URL"));

		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
			System.out.println(e);
		}
	}

	public static List<CapiData> readExpData(String sheetName, int row, int col) {

		// Create an object of ReadExcelFile class

		ReadExcelFile objExcelFile = new ReadExcelFile();

		// Prepare the path of excel file

		String filePath = System.getProperty("user.dir") + "\\src\\test\\resources";

		// Call read file method of the class to read data

		try {

			Sheet sheet = objExcelFile.readExcel(filePath, MU_CAPI_EXCEL_FILE, sheetName);

			System.out.println("####### Reading test data from sheet " + sheetName + " is completed.####### ");

			String cWelcomeAdCMP = sheet.getRow(row).getCell(col).getStringCellValue();
			String cBaroneCMP = sheet.getRow(row + 1).getCell(col).getStringCellValue();
			String cDockCMP = sheet.getRow(row + 2).getCell(col).getStringCellValue();
			String cInlineCMP = sheet.getRow(row + 3).getCell(col).getStringCellValue();
			String cGatewayCMP = sheet.getRow(row + 4).getCell(col).getStringCellValue();

			String cWelcomeAdStatus = sheet.getRow(row).getCell(col + 1).getStringCellValue();
			String cBaroneStatus = sheet.getRow(row + 1).getCell(col + 1).getStringCellValue();
			String cDockStatus = sheet.getRow(row + 2).getCell(col + 1).getStringCellValue();
			String cInlineStatus = sheet.getRow(row + 3).getCell(col + 1).getStringCellValue();
			String cGatewayStatus = sheet.getRow(row + 4).getCell(col + 1).getStringCellValue();

			CapiData cWelcomeAd = new CapiData();
			CapiData cBarone = new CapiData();
			CapiData cDock = new CapiData();
			CapiData cInline = new CapiData();
			CapiData cGateway = new CapiData();

			cWelcomeAd.setActive(cWelcomeAdStatus);
			cWelcomeAd.setAssetType(ReadJsonData.WELCOMEAD);
			cWelcomeAd.setCampaignName(cWelcomeAdCMP);

			cBarone.setActive(cBaroneStatus);
			cBarone.setAssetType(ReadJsonData.BARONE);
			cBarone.setCampaignName(cBaroneCMP);

			cDock.setActive(cDockStatus);
			cDock.setAssetType(ReadJsonData.DOCK);
			cDock.setCampaignName(cDockCMP);

			cInline.setActive(cInlineStatus);
			cInline.setAssetType(ReadJsonData.INLINEUNIT);
			cInline.setCampaignName(cInlineCMP);

			cGateway.setActive(cGatewayStatus);
			cGateway.setAssetType(ReadJsonData.GATEWAY);
			cGateway.setCampaignName(cGatewayCMP);

//			    System.out.println("welcomeAd excel - "+cWelcomeAd.getCampaignName());
//			    System.out.println("barone excel- "+cBarone.getCampaignName());
//			    System.out.println("dock excel - "+cDock.getCampaignName());
//			    System.out.println("inline excel - "+cInline.getCampaignName());
//			    System.out.println("gateway excel - "+cGateway.getCampaignName());

			List<CapiData> expList = new ArrayList<CapiData>();

			expList.add(cWelcomeAd);
			expList.add(cBarone);
			expList.add(cDock);
			expList.add(cInline);
			expList.add(cGateway);

			System.out.println("####### Stored the test data into an List object ####### ");

			return expList;

			// int expUrlsCnt = Integer.parseInt(ReadPropertiesFile.readProperty(sheetName +
			// "_URL"));

		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
			System.out.println(e);

			return null;
		}

	}

	public static void main(String[] args) {
		ReadTestData.readExpData("NonSubsAdblockTest" + "_sheetName", 3, 8);

	}

}
