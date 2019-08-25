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

public class RegiAdblockTest {
	
	@BeforeMethod
	public void setUpBeforeMethod(Method method) {
		CustomVerify.ERROR_STATUS = false;
		System.out.println("Currently run method Start " + method.getName());
	}

	@AfterMethod
	public void tearDownAfterMethod(Method method) {
		System.out.println("Currently run method End " + method.getName());
	}
	
	
//  @Test
//  public void verifyAdblockAnonMC2() {
//	  
//	 /****** Read Expected Json CAPI data from excel ********/ 
//	 List<CapiData> expListData = ReadTestData.readExpData(this.getClass().getSimpleName(), ReadJsonData.CONFIG_ROW_FIRST, ReadJsonData.CONFIG_COL);
//	 
//	 /****** Read Actual Json CAPI data from URL********/
//	 String jsonURL = ReadPropertiesFile.validateAndReadCAPIURL(this.getClass().getSimpleName() + ReadJsonData.CONFIG_SEG_1 );
//	 List<CapiData> actCapiData = ReadJsonData.readJsonData(jsonURL);
//	 
//	 /****** validate actual and expected data *********/
//	 ValidateData.validateCAPIData(expListData, actCapiData);
//	 
//		if (CustomVerify.ERROR_STATUS == true) {
//			Assert.fail();
//
//		}
//
//	 
//  }
//  
//  @Test
//  public void verifyAdblockAnonMC3() {
//	  
//	 /****** Read Expected Json CAPI data from excel ********/ 
//	 List<CapiData> expListData = ReadTestData.readExpData(this.getClass().getSimpleName(), ReadJsonData.CONFIG_ROW_FIRST, ReadJsonData.CONFIG_COL);
//	 
//	 /****** Read Actual Json CAPI data from URL********/
//	 String jsonURL = ReadPropertiesFile.validateAndReadCAPIURL(this.getClass().getSimpleName() + ReadJsonData.CONFIG_SEG_2 );
//	 List<CapiData> actCapiData = ReadJsonData.readJsonData(jsonURL);
//	 
//	 /****** validate actual and expected data *********/
//	 ValidateData.validateCAPIData(expListData, actCapiData);
//	 
//	 if(CustomVerify.ERROR_STATUS == true) {
//		 	Assert.fail();
//			
//	 }
//	 
//  }
//  
//  @Test
//  public void verifyAdblockAnonMC1() {
//	  
//	 /****** Read Expected Json CAPI data from excel ********/ 
//	 List<CapiData> expListData = ReadTestData.readExpData(this.getClass().getSimpleName(), ReadJsonData.CONFIG_ROW_SECOND, ReadJsonData.CONFIG_COL);
//	 
//	 /****** Read Actual Json CAPI data from URL********/
//	 String jsonURL = ReadPropertiesFile.validateAndReadCAPIURL(this.getClass().getSimpleName() + ReadJsonData.CONFIG_SEG_3 );
//	 List<CapiData> actCapiData = ReadJsonData.readJsonData(jsonURL);
//	 
//	 /****** validate actual and expected data *********/
//	 ValidateData.validateCAPIData(expListData, actCapiData);
//	 
//	 if(CustomVerify.ERROR_STATUS == true) {
//		 	Assert.fail();
//			
//	 }
//	 
//  }
  
  @Test
  public void verifyAdblockRegiMC2() {
	  
	 /****** Read Expected Json CAPI data from excel ********/ 
	 List<CapiData> expListData = ReadTestData.readExpData(this.getClass().getSimpleName(), ReadJsonData.CONFIG_ROW_FIRST, ReadJsonData.CONFIG_COL);
	 
	 /****** Read Actual Json CAPI data from URL********/
	 String jsonURL = ReadPropertiesFile.validateAndReadCAPIURL(this.getClass().getSimpleName() + ReadJsonData.CONFIG_SEG_4 );
	 List<CapiData> actCapiData = ReadJsonData.readJsonData(jsonURL);
	 
	 /****** validate actual and expected data *********/
	 ValidateData.validateCAPIData(expListData, actCapiData);
	 
	 if(CustomVerify.ERROR_STATUS == true) {
		 	Assert.fail();
			
	 }
	 
  }
  
  @Test
  public void verifyAdblockRegiMC3() {
	  
	 /****** Read Expected Json CAPI data from excel ********/ 
	 List<CapiData> expListData = ReadTestData.readExpData(this.getClass().getSimpleName(), ReadJsonData.CONFIG_ROW_FIRST, ReadJsonData.CONFIG_COL);
	 
	 /****** Read Actual Json CAPI data from URL********/
	 String jsonURL = ReadPropertiesFile.validateAndReadCAPIURL(this.getClass().getSimpleName() + ReadJsonData.CONFIG_SEG_5 );
	 List<CapiData> actCapiData = ReadJsonData.readJsonData(jsonURL);
	 
	 /****** validate actual and expected data *********/
	 ValidateData.validateCAPIData(expListData, actCapiData);
	 
	 if(CustomVerify.ERROR_STATUS == true) {
		 	Assert.fail();
			
	 }
	 
  }
  
  @Test
  public void verifyAdblockRegiMC4() {
	  
	 /****** Read Expected Json CAPI data from excel ********/ 
	 List<CapiData> expListData = ReadTestData.readExpData(this.getClass().getSimpleName(), ReadJsonData.CONFIG_ROW_SECOND, ReadJsonData.CONFIG_COL);
	 
	 /****** Read Actual Json CAPI data from URL********/
	 String jsonURL = ReadPropertiesFile.validateAndReadCAPIURL(this.getClass().getSimpleName() + ReadJsonData.CONFIG_SEG_6 );
	 List<CapiData> actCapiData = ReadJsonData.readJsonData(jsonURL);
	 
	 /****** validate actual and expected data *********/
	 ValidateData.validateCAPIData(expListData, actCapiData);
	 
	 if(CustomVerify.ERROR_STATUS == true) {
		 	Assert.fail();
			
	 }
  }
}
