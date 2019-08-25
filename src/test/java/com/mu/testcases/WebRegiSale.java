package com.mu.testcases;

import java.lang.reflect.Method;
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

public class WebRegiSale {

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
	public void verifySaleUSGM() {
		
		System.out.println("******* "+ this.getClass().getEnclosingMethod() + " *******");

		/****** Read Expected Json CAPI data from excel ********/
		List<CapiData> expListData = ReadTestData.readExpData(this.getClass().getSimpleName(), ReadJsonData.CONFIG_ROW_SECOND,
				ReadJsonData.CONFIG_COL);

		/****** Read Actual Json CAPI data from URL ********/
		String jsonURL = ReadPropertiesFile.validateAndReadCAPIURL(this.getClass().getSimpleName() + ReadJsonData.CONFIG_SEG_1);
		List<CapiData> actCapiData = ReadJsonData.readJsonData(jsonURL);

		/****** validate actual and expected data *********/
		ValidateData.validateCAPIData(expListData, actCapiData);
		
		
		/****** validate Gateway targetingInfo data *********/
		ValidateData.validateGatewayCAPIData(actCapiData, this.getClass().getSimpleName(), ReadJsonData.MAG_TYPE_OF_SALE, ReadJsonData.LOCATION_USA);

		if (CustomVerify.ERROR_STATUS == true) {
			Assert.fail();
		}

	}
	
	@Test
	public void verifySaleINYT_AUS() {
		
		//System.out.println("******* "+ this.getClass().getEnclosingMethod().getName().toString() + " *******");

		/****** Read Expected Json CAPI data from excel ********/
		List<CapiData> expListData = ReadTestData.readExpData(this.getClass().getSimpleName(), ReadJsonData.CONFIG_ROW_FIRST,
				ReadJsonData.CONFIG_COL);

		/****** Read Actual Json CAPI data from URL ********/
		String jsonURL = ReadPropertiesFile.validateAndReadCAPIURL(this.getClass().getSimpleName() + ReadJsonData.CONFIG_SEG_2);
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
	public void verifySaleINYT_CAN() {
		
		//System.out.println("******* "+ this.getClass().getEnclosingMethod().getName() + " *******");

		/****** Read Expected Json CAPI data from excel ********/
		List<CapiData> expListData = ReadTestData.readExpData(this.getClass().getSimpleName(), ReadJsonData.CONFIG_ROW_FIRST,
				ReadJsonData.CONFIG_COL);

		/****** Read Actual Json CAPI data from URL ********/
		String jsonURL = ReadPropertiesFile.validateAndReadCAPIURL(this.getClass().getSimpleName() + ReadJsonData.CONFIG_SEG_3);
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
	public void verifySaleINYT_EUR() {
		
		//System.out.println("******* "+ this.getClass().getEnclosingMethod().getName() + " *******");

		/****** Read Expected Json CAPI data from excel ********/
		List<CapiData> expListData = ReadTestData.readExpData(this.getClass().getSimpleName(), ReadJsonData.CONFIG_ROW_FIRST,
				ReadJsonData.CONFIG_COL);

		/****** Read Actual Json CAPI data from URL ********/
		String jsonURL = ReadPropertiesFile.validateAndReadCAPIURL(this.getClass().getSimpleName() + ReadJsonData.CONFIG_SEG_4);
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
	public void verifySaleINYT_UK() {
		
		//System.out.println("******* "+ this.getClass().getEnclosingMethod().getName() + " *******");

		/****** Read Expected Json CAPI data from excel ********/
		List<CapiData> expListData = ReadTestData.readExpData(this.getClass().getSimpleName(), ReadJsonData.CONFIG_ROW_FIRST,
				ReadJsonData.CONFIG_COL);

		/****** Read Actual Json CAPI data from URL ********/
		String jsonURL = ReadPropertiesFile.validateAndReadCAPIURL(this.getClass().getSimpleName() + ReadJsonData.CONFIG_SEG_5);
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
	public void verifySaleINYT_IND() {
		
		//System.out.println(new Method().getName());

		/****** Read Expected Json CAPI data from excel ********/
		List<CapiData> expListData = ReadTestData.readExpData(this.getClass().getSimpleName(), ReadJsonData.CONFIG_ROW_FIRST,
				ReadJsonData.CONFIG_COL);

		/****** Read Actual Json CAPI data from URL ********/
		String jsonURL = ReadPropertiesFile.validateAndReadCAPIURL(this.getClass().getSimpleName() + ReadJsonData.CONFIG_SEG_6);
		List<CapiData> actCapiData = ReadJsonData.readJsonData(jsonURL);

		/****** validate actual and expected data *********/
		ValidateData.validateCAPIData(expListData, actCapiData);
		
		/****** validate Gateway targetingInfo data *********/
		ValidateData.validateGatewayCAPIData(actCapiData, this.getClass().getSimpleName(), ReadJsonData.MAG_TYPE_OF_SALE, ReadJsonData.LOCATION_IND);


		if (CustomVerify.ERROR_STATUS == true) {
			Assert.fail();
		}

	}
	
	@Test
	public void verifySaleINYT_Asia_Singapore() {
		
		//System.out.println("******* "+ this.getClass().getEnclosingMethod().getName() + " *******");

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
	public void verifySaleINYT_ROW_Mexico() {
		
		//System.out.println("******* "+ this.getClass().getEnclosingMethod().getName() + " *******");

		/****** Read Expected Json CAPI data from excel ********/
		List<CapiData> expListData = ReadTestData.readExpData(this.getClass().getSimpleName(), ReadJsonData.CONFIG_ROW_FIRST,
				ReadJsonData.CONFIG_COL);

		/****** Read Actual Json CAPI data from URL ********/
		String jsonURL = ReadPropertiesFile.validateAndReadCAPIURL(this.getClass().getSimpleName() + ReadJsonData.CONFIG_SEG_8);
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
