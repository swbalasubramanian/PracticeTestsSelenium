package tests;

import java.util.concurrent.TimeUnit;

import org.junit.*;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import pages.Amazon.*;


public class Question3 {

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
	public void Question3Test() {
		// Load Amazon.com
		driver.get("https://www.amazon.com/");

		// Search for iPhone on amazon.com
		HomePage homepage= new HomePage(driver);
		
		homepage.search("iPhone");
		
		// Go to Shop iPhones page
		homepage.clickShopiPhones();
		
		// Wait for Shop iPhones page to load
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		
		// Select the iPhone 11 pro option 
		ShopiPhonesPage shopiphonespage = new ShopiPhonesPage(driver);
		shopiphonespage.clickiPhone11Pro();

		// Wait for iPhone 11 Pro page to load
		driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
		
		// Validate the comparison chart is displayed
		ProductPage productpage = new ProductPage(driver);
		
		Assert.assertTrue(productpage.isComparisonChartDisplayed()); 

		// Print the rating of the phone 
		String Stars= productpage.getStarRating();
		System.out.println("Star Rating: " + Stars);
		
		// Add Phone in the cart
		// NOTE: Not doing this as this requires sign-in with credentials and check eligibility

		// Print the total amount of the iPhone 
		// NOTE: Printing the product price instead since we are not able to go to the cart
		String Amount =  productpage.getAmount();
		System.out.println("Amount : " + Amount);

		// Sign In
		productpage.clickSignInToCheckEligibility();
	}
}
