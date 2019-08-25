package com.mu.testcases;

import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Parameters;

import com.mu.setup.ReadJsonData;

public class TestConfig {

	@BeforeSuite
	public void testBeforeSuite() {
		System.out.println("testBeforeSuite()");
	}

	@AfterSuite
	public void testAfterSuite() {
		System.out.println("testAfterSuite()");
	}

	@BeforeTest
	@Parameters({ "env", "typeOfSale" })
	public void testBeforeTest(String environment, String typeOfSale) {
		System.out.println("testBeforeTest()");

		ReadJsonData.MAG_ENV = environment.split("_")[0];
		
		ReadJsonData.MAG_PUBLISH = environment.split("_")[1];
		
		ReadJsonData.MAG_TYPE_OF_SALE = typeOfSale ;
		
		if (ReadJsonData.MAG_ENV_PRD.equals(ReadJsonData.MAG_ENV)) {
			System.out.println("###################PROD Environment##################");
		} else if (ReadJsonData.MAG_ENV_STG.equals(ReadJsonData.MAG_ENV)) {
			System.out.println("###################STAGE Environment##################");
		} else {
			System.out.println("###################Incorrect Environment attribute##################");
			System.exit(0);
		}

		if (ReadJsonData.MAG_NOTPUBLISHED.equalsIgnoreCase(ReadJsonData.MAG_PUBLISH)) {
			System.out.println("################### NOT PUBLISHED i.e. pre_prod=true##################");
		} else if (ReadJsonData.MAG_PUBLISHED.equalsIgnoreCase(ReadJsonData.MAG_PUBLISH)) {
			System.out.println("################### PUBLISHED  ##################");
		} else {
			System.out.println("###################Incorrect Publish Environment attribute##################");
			System.exit(0);
		}

	}

	@AfterTest
	public void testAfterTest() {
		System.out.println("testAfterTest()");
	}

	@BeforeClass
	public void testBeforeClass() {
		System.out.println("testBeforeClass()");
//		  vData = new ValidateData();
//		  CustomVerify.ERROR_STATUS = false;
	}

	@AfterClass
	public void testAfterClass() {
		System.out.println("testAfterClass()");
//		  vData = new ValidateData();
//		  CustomVerify.ERROR_STATUS = false;
	}

}
