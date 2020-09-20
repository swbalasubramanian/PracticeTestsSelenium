package pages.Amazon;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class SearchResultsPage {

	WebDriver driver;
	
	public void clickResult(int number) {
		WebElement searchResult = driver.findElement(By.xpath("//*[@data-cel-widget=\"search_result_" + number +"\"]//a"));
		searchResult.click();	
	}
	
	public SearchResultsPage(WebDriver driver)
	{
		this.driver = driver;
	}
}
