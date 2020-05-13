package test;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class config {
	
	WebDriver driver;
	public void setup(String browser){
		if(browser == "chrome") {
		
		System.setProperty("webdriver.chrome.driver", "chromedriver.exe");
		driver = new ChromeDriver();
		driver.manage().window().maximize();
		}
		else if(browser == "firefox") {
			System.setProperty("webdriver.gecko.driver", "geckodriver.exe");
	        driver = new FirefoxDriver();
		}
		
	    }

}
