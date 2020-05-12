package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class MyAccountPage {
	
	WebDriver driver;
	public MyAccountPage(WebDriver driver) {
		this.driver = driver;
	}
	
	public void openCategory(String category) {
		if(category == "women") {
			driver.findElement(By.xpath("//*[@id=\"block_top_menu\"]/ul/li[1]/a")).click();
		}
		else if(category == "dresses") {
			driver.findElement(By.xpath("//*[@id=\"block_top_menu\"]/ul/li[2]/a")).click();
		}
		else if(category == "t-shirts") {
			driver.findElement(By.xpath("//*[@id=\"block_top_menu\"]/ul/li[3]/a")).click();
		}
	}
	
	
	public void womenCategoryPage() {
		// search for blouse and add to cart
		// open product page
		driver.findElement(By.xpath("//*[@id=\"center_column\"]/ul/li[1]/div/div[2]/h5/a")).click();
		// add product to cart
		driver.findElement(By.xpath("//*[@id=\"add_to_cart\"]/button/span")).click();
		// back to products page
		driver.findElement(By.className("continue btn btn-default button exclusive-medium")).click();
		driver.navigate().back();
		// open product page
		driver.findElement(By.xpath("//*[@id=\"center_column\"]/ul/li[3]/div/div[2]/h5/a")).click();
		// add to cart
		driver.findElement(By.xpath("//*[@id=\"add_to_cart\"]/button/span")).click();
		// proceed to checkout
		driver.findElement(By.xpath("//*[@id=\"layer_cart\"]/div[1]/div[2]/div[4]/a/span")).click();
		// delete item from cart
		driver.findElement(By.id("1_1_0_318257")).click();
		// complete checkout process
		driver.findElement(By.xpath("//*[@id=\"center_column\"]/p[2]/a[1]/span")).click();
		
		driver.findElement(By.className("button btn btn-default button-medium")).click();
	}
	
	
	

}
