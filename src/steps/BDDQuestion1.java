package steps;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import pages.Amazon.*;

public class BDDQuestion1 {

	WebDriver driver;
	
	@Given("^User is on the Amazon website$")
	public void User_is_on_the_Amazon_website() {
		String browserType = "Chrome";
		driver = utilities.DriverFactory.open(browserType);
		driver.get("https://www.amazon.com/");	
	}
	
	@When ("^User searches for Appium Book$")
	public void User_searches_for_Appium_Book() {
		HomePage homepage = new HomePage(driver);
		
		String bookName = "appium book";
		homepage.search(bookName);
		
		// Wait for results
		driver.manage().timeouts().implicitlyWait(7, TimeUnit.SECONDS);
	}
 
	@And ("^User selects the tenth book$")
	public void User_select_the_tenth_book() {
		SearchResultsPage searchresultspage = new SearchResultsPage(driver);
		searchresultspage.clickResult(10);
	}
  
    @Then ("^User prints rating$")
    public void User_prints_rating() {
		ProductPage productpage = new ProductPage(driver);
		String Stars=productpage.getStarRating();
	    System.out.println("Star Rating: " + Stars);
    }
    
    @And ("^User adds book to cart$")
    public void User_adds_book_to_cart() {
    	ProductPage productpage = new ProductPage(driver);
		productpage.addToCart();
    }
    
    @And ("^User prints amount of book$")
    public void User_prints_amount_of_book() {
		CartPage cartpage = new CartPage(driver);
		String Amount =  cartpage.getAmount();
		System.out.println("Amount of the book: " + Amount);
		driver.quit();
    }
}
