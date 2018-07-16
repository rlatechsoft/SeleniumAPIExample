import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class GoogleSearch {
	
	public static String driverpath="D:/SeleniumSetup/Driver/";
	public static WebDriver driver;
	
	public static void main(String[] args) {

		//Set the property for Chrome driver
		System.setProperty("webdriver.chrome.driver", driverpath + "chromedriver.exe");
		
		//Open the browser
		driver = new ChromeDriver();
		
		//Set the URL
		driver.get("http://www.google.co.in");
		
		//Click on gmail link
		WebElement lnkElement = driver.findElement(By.className("gb_P"));
		//click on gmail link
		lnkElement.click();
		
		//close and quit
		driver.quit();
		

	}

}
