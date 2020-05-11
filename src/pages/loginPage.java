package pages;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.testng.Assert;
public class loginPage {
	
	String loginPageURL = "http://automationpractice.com/index.php?controller=authentication&back=my-account";

	WebDriver driver;
	public loginPage(WebDriver driver) {
		this.driver = driver;
	}
	
	public void loginExistingAccount(String email, String password) {
		
		// check the existence of page fields (email, password)
		List<WebElement> mailField = driver.findElements(By.id("email"));
		if (mailField.size()!=0)
		{
			// enter email 
			driver.findElement(By.id("email")).sendKeys(email);
		}
		else{
			 // if size is 0, then element do not exist
			 System.out.println("email field do not exist.");
			}
		
		
		List<WebElement> passwordField = driver.findElements(By.id("passwd"));
		if (passwordField.size()!=0)
		{
			driver.findElement(By.id("passwd")).sendKeys(password);
		}
		else{
			 // if size is 0, then element do not exist
			 System.out.println("password field do not exist.");
			}
		
		
		List<WebElement> submitButtom = driver.findElements(By.id("SubmitLogin"));
		if (submitButtom.size()!=0)
		{
			driver.findElement(By.id("SubmitLogin")).click();
		}
		else{
			 // if size is 0, then element do not exist
			 System.out.println("submit button do not exist.");
			}
		
		// assert logging in successfully 
		String expectedURL = "http://automationpractice.com/index.php?controller=my-account";
		try {
		Assert.assertEquals(driver.getCurrentUrl(), expectedURL);
		}
		catch (Exception e) {
			// TODO: handle exception
			System.out.println("login failed");
			e.printStackTrace();
		}
	}
	
	public void createNewAccount(String email) {
		// enter a new email and press create an account button to start creating a new account 
		driver.findElement(By.id("email_create")).sendKeys(email);
		driver.findElement(By.id("SubmitCreate")).click();
		
		// assert going to the register page succesfully 
	}
	

}
