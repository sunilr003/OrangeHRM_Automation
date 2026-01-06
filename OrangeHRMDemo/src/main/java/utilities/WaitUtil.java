package utilities;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class WaitUtil {

	  WebDriver driver;
	    WebDriverWait wait;

	    public WaitUtil(WebDriver driver) {
	        this.driver = driver;
	        wait = new WebDriverWait(driver, Duration.ofSeconds(10));
	    }

	    public void waitForElementToBeClickable(By locator) {
	        wait.until(ExpectedConditions.elementToBeClickable(locator));
	    }

	    public void waitForElementToBeVisible(By locator) {
	        wait.until(ExpectedConditions.visibilityOfElementLocated(locator));
	    }
}