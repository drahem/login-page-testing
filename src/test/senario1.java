package test;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import pages.loginPage;
import pages.loginPage;
import pages.registerPage;

public class senario1 {
	
	/*  senario 1 
	   in this senario ther's an existing account 
	 at first login with valid account then,
	 got to products and buy a t-shirt, dress, and blouse then,
	 go to shopping carte and delete one item then,
	 complete the buying process and confirm
	 * */
	
	loginPage lp;
	String loginPageURL = "http://automationpractice.com/index.php?controller=authentication&back=my-account";

	@BeforeTest
	public void setup(){
		System.setProperty("webdriver.chrome.driver", "chromedriver.exe");
		WebDriver driver = new ChromeDriver();
	    driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
	    driver.get(loginPageURL);
	    }
	
	@Test(priority = 0)
	public void test_login_func_correct() {
		
		// login with valid cerdentials 
		lp.loginExistingAccount("user1@test.eg", "password");
		
	}
	
	@Test(priority = 1)
	public void buyProducts() {
		// choose items and add them to shopping cart
		
		// goto shopping cart
		
		// delete one item
		
		// confirm buying process 
	}
	

	

}
