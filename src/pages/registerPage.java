package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;

public class registerPage {

String baseURL = "http://automationpractice.com/index.php";
	
WebDriver driver;
public registerPage(WebDriver driver) {
	this.driver = driver;
}
	
public void chooseTitle(String title) {
	if(title == "mr") {
		driver.findElement(By.id("id_gender1")).click();
	}
	else if(title == "mrs") {
		driver.findElement(By.xpath("//*[@id=\"uniform-id_gender2\"]")).click();
		//*[@id="uniform-id_gender2"]
	}
	else {
			System.out.println("worng title choice...");
	}
}

public void setName(String firstName, String lastName) {
	//driver.findElement(By.id("customer_firstname")).sendKeys(firstName);
	driver.findElement(By.cssSelector("#customer_firstname")).sendKeys(firstName);
	driver.findElement(By.id("customer_lastname")).sendKeys(lastName);
}

public void setEmailandPassword(String email, String password) {
	driver.findElement(By.id("email")).sendKeys(email);
	driver.findElement(By.id("passwd")).sendKeys(password);
}

public void setBirthDate(int day, int month, int year) {

	driver.findElement(By.id("uniform-days")).sendKeys(String.valueOf(day));

	//String monthName = "//*[@id=\"months\"]/option["+month+"]";
	
	WebElement element = driver.findElement(By.id("uniform-months"));
	
	//Create an object of Select class and pass drop down element as a parameter
	Select select = new Select(element); 
	select.selectByIndex(month);
	
	// driver.findElement(By.xpath(monthName)).click();
	driver.findElement(By.id("uniform-years")).sendKeys(String.valueOf(year));
}

public void setAdress(String company, String address, String city, String state, int postalCode) {
	driver.findElement(By.id("company")).sendKeys(company);
	driver.findElement(By.id("address1")).sendKeys(address);
	driver.findElement(By.id("city")).sendKeys(city);
	// select state 
	driver.findElement(By.id("uniform-id_state")).click();
	WebElement statesList = driver.findElement(By.id("id_state"));
	Select select = new Select(statesList); 
	select.selectByVisibleText(state);
	driver.findElement(By.id("postcode")).sendKeys(String.valueOf(postalCode));
	
}

public void setPhone(int homePhone, int mobilePhone) {
	driver.findElement(By.id("phone")).sendKeys(String.valueOf(homePhone));
	driver.findElement(By.id("phone_mobile")).sendKeys(String.valueOf(mobilePhone));
}

}
