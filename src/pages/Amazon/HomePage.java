package pages.Amazon;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class HomePage {

	WebDriver driver;
	

	public HomePage(WebDriver driver)
	{
		this.driver = driver;
	}

	public void search(String product) {
		driver.findElement(By.id("twotabsearchtextbox")).sendKeys(product);
		driver.findElement(By.cssSelector("input[value=\"Go\"]")).click();
	}
	
	public void clickShopiPhones() {
		driver.findElement(By.cssSelector("span[class='sb_3vapQDdI sb_2Jsx-Yw7']")).click();
	}
	
}
