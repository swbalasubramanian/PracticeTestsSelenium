package tests;

import java.util.ArrayList;
import java.util.concurrent.TimeUnit;

import org.junit.*;
import org.openqa.selenium.WebDriver;
import pages.WayFair.CartPage;
import pages.WayFair.HomePage;
import pages.WayFair.ProductPage;
import pages.WayFair.SectionalsPage;

public class Question2 {
	
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
	public void Question2Test() {
		// Load homepage and click
		driver.get("https://www.wayfair.com/");
		HomePage homepage= new HomePage(driver);
		
		homepage.clickFurniture();
		homepage.clickLivingRoomFurniture();
		homepage.clickSectionals();

		// Click 12th product in sectionals page
		SectionalsPage sectionalspage = new SectionalsPage(driver);
		
		sectionalspage.clickProduct(12);

		// Wait for page to load
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		
		// Switch window to product page
		ArrayList<String> windows= new ArrayList<String>(driver.getWindowHandles());
		driver.switchTo().window(windows.get(1));
		
		// Print the rating
		ProductPage productpage = new ProductPage(driver);
		
		String stars = productpage.getStarRating();  
		System.out.println("Star Rating: " + stars + " out of 5");

		// Add to Cart and continue
		productpage.addToCart();
		productpage.continueToCart();
		
		// Wait for the cart page to load
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);

		// Print the total
		CartPage cartpage = new CartPage(driver);
				
		String Amount = cartpage.getAmount();
		System.out.println("Amount of the item: " + Amount);
		

	}

}
