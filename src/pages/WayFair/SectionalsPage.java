package pages.WayFair;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class SectionalsPage {

	WebDriver driver;
	
	public void clickProduct(int number) {
		driver.findElement(By.cssSelector("a[data-click-location=\"product" + number + "\"]")).click();
	}
	
	public SectionalsPage(WebDriver driver)
	{
		this.driver = driver;
	}
}
