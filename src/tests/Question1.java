package tests;

import java.util.concurrent.TimeUnit;

import org.junit.*;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import pages.Amazon.*; 

public class Question1 {
	WebDriver driver;
	
	@Before
	public void Before() {
		// Initialize Driver
		String browserType = "Chrome";
		driver = utilities.DriverFactory.open(browserType);
	}
	
	@After
	public void After()	{		
		// Close Driver
		driver.quit();
	}
	
	@Test
	public void Question1Test() {
		
		// Search for appium Book on amazon.com
		driver.get("https://www.amazon.com/");	
		
		HomePage homepage = new HomePage(driver);
		
		String bookName = "appium book";
		homepage.search(bookName);
		
		// Wait for results
		driver.manage().timeouts().implicitlyWait(7, TimeUnit.SECONDS);
		
		// Select 10th Book
		SearchResultsPage searchresultspage = new SearchResultsPage(driver);
		searchresultspage.clickResult(10);
		
		// Print the rating of the book
		ProductPage productpage = new ProductPage(driver);
		String Stars=productpage.getStarRating();
	    System.out.println("Star Rating: " + Stars);
	    
	    // Add book in the cart 
		productpage.addToCart();

		// Wait for cart page to load
		driver.manage().timeouts().implicitlyWait(7, TimeUnit.SECONDS);
		
		// Print the total amount of the book
		CartPage cartpage = new CartPage(driver);
		String Amount =  cartpage.getAmount();
		System.out.println("Amount of the book: " + Amount);
	}
}
