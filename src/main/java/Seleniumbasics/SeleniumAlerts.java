package Seleniumbasics;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;

public class SeleniumAlerts {
	
	@Test
	public void test1() throws InterruptedException
	{
		WebDriverManager.chromedriver().setup();
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(1000, TimeUnit.SECONDS);
		driver.get("http://demo.automationtalks.com/SE-ESY/www.AutomationTalks.com/test/window-popup-modal-demo.html");
		driver.findElement(By.xpath("//a[text()=' Follow On Twitter ']")).click();
		//Alert al = driver.switchTo().alert();
		//String wind = al.getText();
		//System.out.println("Alert window name is " +wind);
		//Assert.assertEquals(al, "www.window");
		//Thread.sleep(2000);
		//al.accept();
		driver.close();
		
	}
}