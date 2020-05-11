package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
public class loginPage {
	
	String loginPageURL = "http://automationpractice.com/index.php?controller=authentication&back=my-account";

	WebDriver driver;
	public loginPage() {
		this.driver = driver;
	}
	
	public void loginExistingAccount(String email, String password) {
		
		// assert existance of page fields (email, password)
		
		// enter valid account credentials to login 
		driver.findElement(By.id("email")).sendKeys(email);
		driver.findElement(By.id("passwd")).sendKeys(password);
		driver.findElement(By.id("SubmitLogin")).click();
		
		// assert logging in successfully 

	}
	
	public void createNewAccount(String email) {
		// enter a new email and press create an account button to start creating a new account 
		driver.findElement(By.id("email_create")).sendKeys(email);
		driver.findElement(By.id("SubmitCreate")).click();
		
		// assert going to the register page succesfully 
	}
	

}
