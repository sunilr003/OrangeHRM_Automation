package tests;

import org.testng.Assert;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

import base.BaseClass;
import pages.LoginPage;

public class LoginTest extends BaseClass{
	
	LoginPage loginpage;
	
	@BeforeClass
	public void BeforeScenario() {
		setup();
		loginpage = new LoginPage(driver);
	}
	
	 @Test
	    public void verifyLoginWithValidCredentials() {

		 loginpage.enterUsername(config.getProperty("username"));
		 loginpage.enterPassword(config.getProperty("password"));
		 loginpage.clickLogin();

	        Assert.assertTrue(loginpage.isDashboardDisplayed(),"Dashboard is NOT displayed - Login Failed");
	    }

}
