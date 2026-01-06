package base;

import java.time.Duration;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;

import io.github.bonigarcia.wdm.WebDriverManager;
import utilities.ConfigReader;

public class BaseClass {

  protected WebDriver driver;
  protected ConfigReader config;
	 
	@BeforeMethod(alwaysRun = true)
	public void setup() {
		if(driver==null) {
			 config = new ConfigReader();
		        String browser = config.getProperty("browser");

		        if (browser.equalsIgnoreCase("chrome")) {
		            WebDriverManager.chromedriver().setup();
		            driver = new ChromeDriver();
		        }
		        else if (browser.equalsIgnoreCase("firefox")) {
		            WebDriverManager.firefoxdriver().setup();
		            driver = new FirefoxDriver();
		        }
		        else if (browser.equalsIgnoreCase("edge")) {
		            WebDriverManager.edgedriver().setup();
		            driver = new EdgeDriver();
		        }
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
		driver.get(config.getProperty("url"));


	}
	}
	
	 @AfterMethod(alwaysRun = true)
	    public void tearDown() {
	        driver.quit();
	    }
}
