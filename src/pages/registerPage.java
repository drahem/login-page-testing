package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;

public class registerPage {

String baseURL = "http://automationpractice.com/index.php";
	
WebDriver driver;
public registerPage(WebDriver driver) {
	this.driver = driver;
}
	
public void chooseTitle(String title) {
	if(title == "mr") {
		driver.findElement(By.xpath("//*[@id=\"account-creation_form\"]/div[1]/div[1]/div[1]/label")).click();
	}
	else if(title == "mrs") {
		driver.findElement(By.xpath("//*[@id=\"account-creation_form\"]/div[1]/div[1]/div[2]/label")).click();
			
	}
	else {
			System.out.println("worng title choice...");
	}
}

public void setName(String firstName, String lastName) {
	driver.findElement(By.id("customer_firstname")).sendKeys(firstName);
	driver.findElement(By.id("customer_lastname")).sendKeys(lastName);
}

public void setEmailandPassword(String email, String password) {
	driver.findElement(By.id("email")).sendKeys(email);
	driver.findElement(By.id("passwd")).sendKeys(password);
}

public void setBirthDate(int day, int month, int year) {
	driver.findElement(By.id("uniform-days")).sendKeys(String.valueOf(day));
	
	
	String monthName = "//*[@id=\"months\"]/option["+month+"]";
	
	driver.findElement(By.id("uniform-months")).click();
	driver.findElement(By.xpath(monthName)).click();
	
	driver.findElement(By.id("uniform-years")).sendKeys(String.valueOf(year));

	
	
}

public void setAdress(String company, String adress, String city, String state, int postalCode) {}

public void setPhone(int homePhone, int mobilePhone) {
	driver.findElement(By.id("phone")).sendKeys(String.valueOf(homePhone));
	driver.findElement(By.id("phone_mobile")).sendKeys(String.valueOf(mobilePhone));
}


}
