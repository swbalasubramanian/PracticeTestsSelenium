package pages.Amazon;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class CartPage {

	WebDriver driver;
	
	public String getAmount() {
		WebElement AmountElement = driver.findElement(By.xpath("//*[@id=\"hlb-subcart\"]/div[1]/span/span[2]"));

		return AmountElement.getAttribute("textContent");
	}
		
	public CartPage(WebDriver driver)
	{
		this.driver = driver;
	}
}
