package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.PageFactory;

public class LoginPage {

    WebDriver driver;
	
	public LoginPage(WebDriver driver) {
		this.driver = driver;
		PageFactory.initElements(driver, this);
	}
	
	By usernameField = By.name("username");
    By passwordField = By.name("password");
    By loginButton   = By.xpath("//button[@type='submit']");
    By dashboardText = By.xpath("//h6[normalize-space()='Dashboard']");
	
    public void enterUsername(String username) {
        driver.findElement(usernameField).sendKeys(username);
    }

    public void enterPassword(String password) {
        driver.findElement(passwordField).sendKeys(password);
    }

    public void clickLogin() {
        driver.findElement(loginButton).click();
    }

    public boolean isDashboardDisplayed() {
        return driver.findElement(dashboardText).isDisplayed();
    }
}
