package Seleniumbasics;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;

public class SeleniumAlllinksinpage {

	@Test
	public void xpath() 
	{
		WebDriverManager.chromedriver().setup();
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(2000,TimeUnit.SECONDS);
		//driver.get("http://demo.automationtalks.com/");
		
		//String righthand = "N";
		//WebElement Righthanddrive = driver.findElement(By.xpath("//input[@name='Right Hand Drive']/parent::label[text()='" +righthand+ "']"));
		//Righthanddrive.click();
		
		driver.get("http://demowebshop.tricentis.com/register");
		
		String rightgensel = "Female";
		WebElement Righthanddrive = driver.findElement(By.xpath("//input[@name='Gender']/following-sibling::label[text()='" +rightgensel+ "']"));
		Righthanddrive.click();
	}

}
