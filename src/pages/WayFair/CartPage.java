package pages.WayFair;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class CartPage {

	WebDriver driver;
	
	public String getAmount() {
		WebElement AmountElement = driver.findElement(By.xpath("//*[@id=\"bd\"]/div/div[1]/div[1]/div/div[5]/section/div/div[1]/div/div[5]/span[2]"));

		return AmountElement.getAttribute("textContent");
	}
		
	public CartPage(WebDriver driver)
	{
		this.driver = driver;
	}
}
