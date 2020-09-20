package pages.WayFair;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class ProductPage {

	WebDriver driver;
	
	public String getStarRating() {
		WebElement starRatingElement = driver.findElement(By.cssSelector("span[class='ProductRatingNumberWithCount-rating']"));
		
		return starRatingElement.getAttribute("textContent");
	}
	
	public void addToCart() {
		driver.findElement(By.id("btn-add-to-cart")).click();
	}

	public void continueToCart() {
		driver.findElement(By.xpath("/html/body/div[8]/div/section/div/div/div[2]/a")).click();
	}

	public ProductPage(WebDriver driver)
	{
		this.driver = driver;
	}
}
