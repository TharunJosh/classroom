package base;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;

public class SuperSpecificMethods {
	
	public static ChromeDriver driver;
	
	@BeforeMethod
	public void LaunchBrowser(){
	System.setProperty("webdriver.chrome.driver", "./drivers/chromedriver.exe");
	new ChromeDriver();
	driver.manage().window().maximize();
	driver.get("http://leaftaps.com/opentaps/");
	driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
	}
	
	@AfterMethod
	private void closeBroswer() {
		driver.close();

	}
		
	
}
