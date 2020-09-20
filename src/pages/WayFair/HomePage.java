package pages.WayFair;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class HomePage {

	WebDriver driver;
	
	public void clickFurniture() {
		driver.findElement(By.linkText("Furniture")).click();
	}

	public void clickLivingRoomFurniture() {
		driver.findElement(By.linkText("Living Room Furniture")).click();
	}
	
	public void clickSectionals() {
		driver.findElement(By.linkText("Sectionals")).click();
	}
	
	public HomePage(WebDriver driver)
	{
		this.driver = driver;
	}
}
