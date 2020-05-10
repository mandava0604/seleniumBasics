package Seleniumbasics;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;

public class TestNGBrowserparameter {
	WebDriver driver = null;
	@BeforeMethod
	@Parameters("browser")
	public void beforesetup(String browser)
	{
		if(browser.equalsIgnoreCase("chrome")) 
		{
		WebDriverManager.chromedriver().setup();
	    driver = new ChromeDriver();
		}else if(browser.equalsIgnoreCase("firefox"))
		{
			WebDriverManager.firefoxdriver().setup();
			driver = new FirefoxDriver();
		}
		driver.navigate().to("http://demowebshop.tricentis.com/");
	
	}
	
	@Test
	public void test2() {
		System.out.println("The URL is :" +driver.getTitle());
	}
	
	@AfterMethod
	public void tearoff()
	{
		driver.close();
	}

}
