package pages.Amazon;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class ProductPage {

	WebDriver driver;
	

	public ProductPage(WebDriver driver)
	{
		this.driver = driver;
	}
	
	public boolean isComparisonChartDisplayed() {
		return driver.findElement(By.xpath("//*[@id=\"comparison-chart\"]/div[1]/h1")).isDisplayed();
	}
	
	public String getStarRating() {
		WebElement starRatingElement =	driver.findElement(By.cssSelector("span[class=\"a-icon-alt\"]"));
		
		return starRatingElement.getAttribute("textContent");
	}
	
	public String getAmount() {
		WebElement AmountElement = driver.findElement(By.xpath("//*[@id=\"root\"]/div/div/div/div[3]/div[2]/div[5]/div/div[2]/div/span[1]"));
		
		return AmountElement.getAttribute("textContent");
	}
	
	public void addToCart() {
		WebElement addToCart = driver.findElement(By.id("add-to-cart-button"));	
		addToCart.click();
	}
	
	public void clickSignInToCheckEligibility()
	{
		driver.findElement(By.xpath("//*[@id=\"a-autoid-29-announce\"]")).click();
	}
}
