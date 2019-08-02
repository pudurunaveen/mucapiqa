package com.mu.testcases;

import java.util.List;

import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import com.mu.pageobjects.CapiData;
import com.mu.setup.CustomVerify;
import com.mu.setup.ReadJsonData;
import com.mu.setup.ReadPropertiesFile;
import com.mu.setup.ReadTestData;
import com.mu.setup.ValidateData;

public class AndroidIOSNonSub {

	@BeforeMethod
	public void setUpBeforeMethod() {
		CustomVerify.ERROR_STATUS = false;
	}

	@AfterMethod
	public void tearDownAfterMethod() {

	}

	@Test
	public void verifyIOSAnon() {

		/****** Read Expected Json CAPI data from excel ********/
		String className = this.getClass().getName().substring(this.getClass().getName().lastIndexOf(".") + 1);
		String excelSheetName = ReadPropertiesFile.readProperty(className + ReadJsonData.CONFIG_SHEETNAME);
		List<CapiData> expListData = ReadTestData.readExpData(excelSheetName, ReadJsonData.CONFIG_ROW_FIRST,
				ReadJsonData.CONFIG_COL);

		/****** Read Actual Json CAPI data from URL ********/
		String jsonURL = ReadPropertiesFile.validateAndReadCAPIURL(className + ReadJsonData.CONFIG_SEG_1);
		List<CapiData> actCapiData = ReadJsonData.readJsonData(jsonURL);

		/****** validate actual and expected data *********/
		ValidateData.validateCAPIData(expListData, actCapiData);

		if (CustomVerify.ERROR_STATUS == true) {
			Assert.fail();
		}

	}

	@Test
	public void verifyIOSRegi() {
		/****** Read Expected Json CAPI data from excel ********/
		String className = this.getClass().getName().substring(this.getClass().getName().lastIndexOf(".") + 1);
		String excelSheetName = ReadPropertiesFile.readProperty(className + ReadJsonData.CONFIG_SHEETNAME);
		List<CapiData> expListData = ReadTestData.readExpData(excelSheetName, ReadJsonData.CONFIG_ROW_FIRST,
				ReadJsonData.CONFIG_COL);

		/****** Read Actual Json CAPI data from URL ********/
		String jsonURL = ReadPropertiesFile.validateAndReadCAPIURL(className + ReadJsonData.CONFIG_SEG_2);
		List<CapiData> actCapiData = ReadJsonData.readJsonData(jsonURL);

		/****** validate actual and expected data *********/
		ValidateData.validateCAPIData(expListData, actCapiData);

		if (CustomVerify.ERROR_STATUS == true) {
			Assert.fail();
		}

	}

	@Test
	public void verifyAndroidAnon() {
		/****** Read Expected Json CAPI data from excel ********/
		String className = this.getClass().getName().substring(this.getClass().getName().lastIndexOf(".") + 1);
		String excelSheetName = ReadPropertiesFile.readProperty(className + ReadJsonData.CONFIG_SHEETNAME);
		List<CapiData> expListData = ReadTestData.readExpData(excelSheetName, ReadJsonData.CONFIG_ROW_FIRST,
				ReadJsonData.CONFIG_COL);

		/****** Read Actual Json CAPI data from URL ********/
		String jsonURL = ReadPropertiesFile.validateAndReadCAPIURL(className + ReadJsonData.CONFIG_SEG_3);
		List<CapiData> actCapiData = ReadJsonData.readJsonData(jsonURL);

		/****** validate actual and expected data *********/
		ValidateData.validateCAPIData(expListData, actCapiData);

		if (CustomVerify.ERROR_STATUS == true) {
			Assert.fail();
		}

	}

	@Test
	public void verifyAndroidRegi() {
		/****** Read Expected Json CAPI data from excel ********/
		String className = this.getClass().getName().substring(this.getClass().getName().lastIndexOf(".") + 1);
		String excelSheetName = ReadPropertiesFile.readProperty(className + ReadJsonData.CONFIG_SHEETNAME);
		List<CapiData> expListData = ReadTestData.readExpData(excelSheetName, ReadJsonData.CONFIG_ROW_FIRST,
				ReadJsonData.CONFIG_COL);

		/****** Read Actual Json CAPI data from URL ********/
		String jsonURL = ReadPropertiesFile.validateAndReadCAPIURL(className + ReadJsonData.CONFIG_SEG_4);
		List<CapiData> actCapiData = ReadJsonData.readJsonData(jsonURL);

		/****** validate actual and expected data *********/
		ValidateData.validateCAPIData(expListData, actCapiData);

		if (CustomVerify.ERROR_STATUS == true) {
			Assert.fail();
		}

	}
}
