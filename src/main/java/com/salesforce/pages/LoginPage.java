package com.salesforce.pages;

import com.framework.selenium.api.design.Locators;
import com.framework.testng.api.base.ProjectSpecificMethods;

public class LoginPage extends ProjectSpecificMethods{
	
	public LoginPage clickLoginURL() {
		click(locateElement(Locators.CLASS_NAME, "ico-login"));
		return this;
	}
	
	//updated comment
	
	public LoginPage enterUsername(String data) {
		clearAndType(locateElement(Locators.ID, "Email"), data);
		reportStep(data+" entered successfully","pass");
		return this;
	}
	
	public LoginPage enterPassword(String data) {
		clearAndType(locateElement(Locators.ID, "Password"), data);
		reportStep(data+" entered successfully","pass");
		return this;
	}
	
	public LoginPage clickLogin() {
		click(locateElement(Locators.XPATH, "//*[@value='Log in']"));
		reportStep("Login button clicked successfully", "pass");
		return this;
	}

}
