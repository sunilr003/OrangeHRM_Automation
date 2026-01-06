package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.PageFactory;

import utilities.WaitUtil;

public class LogoutPage {
	
	WebDriver driver;
	WaitUtil wait;

	
	public LogoutPage(WebDriver driver) {
		this.driver = driver;
		PageFactory.initElements(driver, this);	
		wait = new WaitUtil(driver);
	}
	
	By profileDropdown = By.xpath("//span[@class='oxd-userdropdown-tab']");
	By Logoutlink = By.xpath("(//a[@class='oxd-userdropdown-link'])[4]");
	By loginButton   = By.xpath("//button[@type='submit']");
	 
	public void clickProfileicon() {
		wait.waitForElementToBeClickable(profileDropdown);
		driver.findElement(profileDropdown).click();
	}
	
	public void clickLogout() {
		wait.waitForElementToBeClickable(Logoutlink);
		driver.findElement(Logoutlink).click();
		
	}

	public boolean isLoginButtonDisplayed() {
		wait.waitForElementToBeVisible(loginButton);
        return driver.findElement(loginButton).isDisplayed();
    }

}
