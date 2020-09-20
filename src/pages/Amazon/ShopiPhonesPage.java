package pages.Amazon;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class ShopiPhonesPage {

	WebDriver driver;
	

	public ShopiPhonesPage(WebDriver driver)
	{
		this.driver = driver;
	}
	
	public void clickiPhone11Pro() {
		driver.findElement(By.xpath("//*[@id=\"x4ch4f2ob1\"]/div/div/a")).click();
	}
	
}
