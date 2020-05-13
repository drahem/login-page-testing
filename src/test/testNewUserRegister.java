package test;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import pages.loginPage;
import pages.registerPage;
import test.config;


public class testNewUserRegister {
	
	WebDriver driver;
	registerPage rp;
	loginPage lp;
	String loginPageURL = "http://automationpractice.com/index.php?controller=authentication&back=my-account";

	
	@BeforeTest
	public void setup(){
		System.setProperty("webdriver.gecko.driver", "geckodriver.exe");
        driver = new FirefoxDriver();
	    driver.get(loginPageURL);
	    }
	
	@Test(priority = 0)
	private void createAccount() {
		rp = new registerPage(driver);
		lp = new loginPage(driver);
		lp.createNewAccount("first@last.test");
		
		// assert being at register page 
		
		rp.chooseTitle("mrs");
		rp.setName("first", "last");
		rp.setEmailandPassword("first@last.test", "password");
		rp.setBirthDate(10, 8, 1990);
		rp.setAdress("nasa", "first street", "mycity", "florida", 11111);
		rp.setPhone(0123456, 01234567);
		driver.findElement(By.id("submitAccount")).click();
		
		// assert the success of register
		
	}
	
	

	
}
