package tests;

import org.testng.Assert;
import org.testng.annotations.Test;

import base.BaseClass;
import pages.LoginPage;
import pages.LogoutPage;

public class LogoutTest extends BaseClass {

	
	 @Test
	    public void verifyLogoutFunctionality() {
//		 //Step 1 : Login
		 
		 LoginPage loginpage = new LoginPage(driver);
		 loginpage.enterUsername(config.getProperty("username"));
		 loginpage.enterPassword(config.getProperty("password"));
		 loginpage.clickLogin();
//		 
		 //Step 2 : logout
		 
		 LogoutPage logoutpage = new LogoutPage(driver);
		 logoutpage.clickProfileicon();
		 logoutpage.clickLogout();
		 
		 Assert.assertTrue(logoutpage.isLoginButtonDisplayed(), "Logout is failed");
		 
		 
	 }

}
