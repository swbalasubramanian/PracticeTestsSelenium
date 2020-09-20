package utilities;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.ie.InternetExplorerDriver;

public class DriverFactory {
	public static WebDriver open(String browserType) {
		if (browserType.equalsIgnoreCase("firefox")) {
	System.setProperty("webdriver.gecko.driver","C:\\Users\\swbalasubramanian\\Documents\\QELDAcademy\\Software\\geckodriver.exe");
		return new FirefoxDriver();
	}
		else if (browserType.equalsIgnoreCase("IE")) {
			System.setProperty("webdriver.gecko.driver","C:\\Users\\swbalasubramanian\\Documents\\QELDAcademy\\Software\\IEDriverServer.exe");
			return new InternetExplorerDriver();
		}
		else {
	System.setProperty("webdriver.chrome.driver","C:\\Users\\swbalasubramanian\\Documents\\QELDAcademy\\Software\\chromedriver.exe");
	return new ChromeDriver();
 }
}
}
