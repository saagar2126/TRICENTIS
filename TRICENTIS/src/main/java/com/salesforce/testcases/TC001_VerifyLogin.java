package com.salesforce.testcases;

import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import com.framework.testng.api.base.ProjectSpecificMethods;
import com.salesforce.pages.LoginPage;

public class TC001_VerifyLogin extends ProjectSpecificMethods{
	@BeforeTest
	public void setValues() {
		testcaseName = "VerifyLogin";
		testDescription ="Verify Login functionality with positive data";
		authors="saagar";
		category ="Smoke";
		excelFileName="tricentis_data";
	}
	
	@Test(dataProvider = "fetchData")
	public void runLogin(String username, String password) {
		new LoginPage()
		.clickLoginURL()
		.enterUsername(username)
		.enterPassword(password)
		.clickLogin();

	}

}
