package com.mu.testcases;

import java.lang.reflect.Method;
import java.util.List;

import org.testng.Assert;
import org.testng.Reporter;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import com.mu.pageobjects.CapiData;
import com.mu.setup.CustomVerify;
import com.mu.setup.ReadJsonData;
import com.mu.setup.ReadPropertiesFile;
import com.mu.setup.ReadTestData;
import com.mu.setup.ValidateData;

public class WebRegiINYTBAU {

	@BeforeMethod
	public void setUpBeforeMethod(Method method) {
		CustomVerify.ERROR_STATUS = false;
		System.out.println("Currently run method Start " + method.getName());
	}

	@AfterMethod
	public void tearDownAfterMethod(Method method) {
		System.out.println("Currently run method End " + method.getName());
	}

	@Test
	public void verifyINYTBAU_AUS() {

		/****** Read Expected Json CAPI data from excel ********/
		List<CapiData> expListData = ReadTestData.readExpData(this.getClass().getSimpleName(), ReadJsonData.CONFIG_ROW_FIRST,
				ReadJsonData.CONFIG_COL);

		/****** Read Actual Json CAPI data from URL ********/
		String jsonURL = ReadPropertiesFile.validateAndReadCAPIURL(this.getClass().getSimpleName() + ReadJsonData.CONFIG_SEG_1);
		List<CapiData> actCapiData = ReadJsonData.readJsonData(jsonURL);

		/****** validate actual and expected data *********/
		ValidateData.validateCAPIData(expListData, actCapiData);
		
		/****** validate Gateway targetingInfo data *********/
		ValidateData.validateGatewayCAPIData(actCapiData, this.getClass().getSimpleName(), ReadJsonData.MAG_TYPE_OF_SALE, ReadJsonData.LOCATION_AUS);


		if (CustomVerify.ERROR_STATUS == true) {
			Assert.fail();
		}

	}
	
	@Test
	public void verifyINYTBAU_CAN() {

		/****** Read Expected Json CAPI data from excel ********/
		List<CapiData> expListData = ReadTestData.readExpData(this.getClass().getSimpleName(), ReadJsonData.CONFIG_ROW_FIRST,
				ReadJsonData.CONFIG_COL);

		/****** Read Actual Json CAPI data from URL ********/
		String jsonURL = ReadPropertiesFile.validateAndReadCAPIURL(this.getClass().getSimpleName() + ReadJsonData.CONFIG_SEG_2);
		List<CapiData> actCapiData = ReadJsonData.readJsonData(jsonURL);

		/****** validate actual and expected data *********/
		ValidateData.validateCAPIData(expListData, actCapiData);
		
		/****** validate Gateway targetingInfo data *********/
		ValidateData.validateGatewayCAPIData(actCapiData, this.getClass().getSimpleName(), ReadJsonData.MAG_TYPE_OF_SALE, ReadJsonData.LOCATION_CAN);


		if (CustomVerify.ERROR_STATUS == true) {
			Assert.fail();
		}

	}
	
	@Test
	public void verifyINYTBAU_EUR() {

		/****** Read Expected Json CAPI data from excel ********/
		List<CapiData> expListData = ReadTestData.readExpData(this.getClass().getSimpleName(), ReadJsonData.CONFIG_ROW_FIRST,
				ReadJsonData.CONFIG_COL);

		/****** Read Actual Json CAPI data from URL ********/
		String jsonURL = ReadPropertiesFile.validateAndReadCAPIURL(this.getClass().getSimpleName() + ReadJsonData.CONFIG_SEG_3);
		List<CapiData> actCapiData = ReadJsonData.readJsonData(jsonURL);

		/****** validate actual and expected data *********/
		ValidateData.validateCAPIData(expListData, actCapiData);
		
		/****** validate Gateway targetingInfo data *********/
		ValidateData.validateGatewayCAPIData(actCapiData, this.getClass().getSimpleName(), ReadJsonData.MAG_TYPE_OF_SALE, ReadJsonData.LOCATION_EUR);


		if (CustomVerify.ERROR_STATUS == true) {
			Assert.fail();
		}

	}
	
	@Test
	public void verifyINYTBAU_UK() {

		/****** Read Expected Json CAPI data from excel ********/
		List<CapiData> expListData = ReadTestData.readExpData(this.getClass().getSimpleName(), ReadJsonData.CONFIG_ROW_FIRST,
				ReadJsonData.CONFIG_COL);

		/****** Read Actual Json CAPI data from URL ********/
		String jsonURL = ReadPropertiesFile.validateAndReadCAPIURL(this.getClass().getSimpleName() + ReadJsonData.CONFIG_SEG_4);
		List<CapiData> actCapiData = ReadJsonData.readJsonData(jsonURL);

		/****** validate actual and expected data *********/
		ValidateData.validateCAPIData(expListData, actCapiData);
		
		/****** validate Gateway targetingInfo data *********/
		ValidateData.validateGatewayCAPIData(actCapiData, this.getClass().getSimpleName(), ReadJsonData.MAG_TYPE_OF_SALE, ReadJsonData.LOCATION_UK);


		if (CustomVerify.ERROR_STATUS == true) {
			Assert.fail();
		}

	}
	
	@Test
	public void verifyINYTBAU_ROW_Mexico() {

		/****** Read Expected Json CAPI data from excel ********/
		List<CapiData> expListData = ReadTestData.readExpData(this.getClass().getSimpleName(), ReadJsonData.CONFIG_ROW_FIRST,
				ReadJsonData.CONFIG_COL);

		/****** Read Actual Json CAPI data from URL ********/
		String jsonURL = ReadPropertiesFile.validateAndReadCAPIURL(this.getClass().getSimpleName() + ReadJsonData.CONFIG_SEG_7);
		List<CapiData> actCapiData = ReadJsonData.readJsonData(jsonURL);

		/****** validate actual and expected data *********/
		ValidateData.validateCAPIData(expListData, actCapiData);
		
		/****** validate Gateway targetingInfo data *********/
		ValidateData.validateGatewayCAPIData(actCapiData, this.getClass().getSimpleName(), ReadJsonData.MAG_TYPE_OF_SALE, ReadJsonData.LOCATION_ROW);

		if (CustomVerify.ERROR_STATUS == true) {
			Assert.fail();
		}

	}
	
	@Test
	public void verifyINYTBAU_LATAM() {

		/****** Read Expected Json CAPI data from excel ********/
		List<CapiData> expListData = ReadTestData.readExpData(this.getClass().getSimpleName(), ReadJsonData.CONFIG_ROW_FIRST,
				ReadJsonData.CONFIG_COL);

		/****** Read Actual Json CAPI data from URL ********/
		String jsonURL = ReadPropertiesFile.validateAndReadCAPIURL(this.getClass().getSimpleName() + ReadJsonData.CONFIG_SEG_5);
		List<CapiData> actCapiData = ReadJsonData.readJsonData(jsonURL);

		/****** validate actual and expected data *********/
		ValidateData.validateCAPIData(expListData, actCapiData);
		
		/****** validate Gateway targetingInfo data *********/
		ValidateData.validateGatewayCAPIData(actCapiData, this.getClass().getSimpleName(), ReadJsonData.MAG_TYPE_OF_SALE, ReadJsonData.LOCATION_ROW);

		if (CustomVerify.ERROR_STATUS == true) {
			Assert.fail();
		}

	}
	
	@Test
	public void verifyINYTBAU_Asia_Singapore() {

		/****** Read Expected Json CAPI data from excel ********/
		List<CapiData> expListData = ReadTestData.readExpData(this.getClass().getSimpleName(), ReadJsonData.CONFIG_ROW_FIRST,
				ReadJsonData.CONFIG_COL);

		/****** Read Actual Json CAPI data from URL ********/
		String jsonURL = ReadPropertiesFile.validateAndReadCAPIURL(this.getClass().getSimpleName() + ReadJsonData.CONFIG_SEG_6);
		List<CapiData> actCapiData = ReadJsonData.readJsonData(jsonURL);

		/****** validate actual and expected data *********/
		ValidateData.validateCAPIData(expListData, actCapiData);
		
		/****** validate Gateway targetingInfo data *********/
		ValidateData.validateGatewayCAPIData(actCapiData, this.getClass().getSimpleName(), ReadJsonData.MAG_TYPE_OF_SALE, ReadJsonData.LOCATION_ROW);

		if (CustomVerify.ERROR_STATUS == true) {
			Assert.fail();
		}

	}
	

	

	
}
