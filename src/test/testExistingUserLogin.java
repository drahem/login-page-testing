package test;


import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.Assert;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import pages.MyAccountPage;
import pages.loginPage;

public class testExistingUserLogin{
	
	/*  senario 1 
	   in this senario ther's an existing account 
	 at first login with valid account then,
	 got to products and buy a t-shirt, dress, and blouse then,
	 go to shopping carte and delete one item then,
	 complete the buying process and confirm
	 * */

	String loginPageURL = "http://automationpractice.com/index.php?controller=authentication&back=my-account";
	String user = "user1@test.eg";
	String pass = "password";
	WebDriver driver;
	loginPage lp;
	MyAccountPage myacc;
	
	


	@BeforeTest
	public void setup(){
		//System.setProperty("webdriver.chrome.driver", "chromedriver.exe");
		System.setProperty("webdriver.firefox.friver", "geckodriver.exe");
		//driver = new ChromeDriver();
		driver = new FirefoxDriver();
		//driver.manage().window().maximize();
	    driver.get(loginPageURL);
	    }
	
	@Test(priority=0)
	public void testUserLoginCorrect() {
		
		// create login page object
		lp = new loginPage(driver);
		// login with valid cerdentials 
		lp.loginExistingAccount(user, pass);
		
		// assert login successfully 		
		try {
			Assert.assertTrue(driver.findElement(By.className("page-heading")).getText().contains("MY ACCOUNT"));
			}
		catch (Exception e) {
			e.printStackTrace();
			}
	}
	
	@Test(priority = 1)
	public void buyProducts() {
		myacc = new MyAccountPage(driver);
		myacc.openCategory("women");
		myacc.womenCategoryPage();
	}
	

	

}
