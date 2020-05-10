package Seleniumbasics;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Seleniumxpath {

	@Test
	public void xpath() 
	{
		WebDriverManager.chromedriver().setup();
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(2000,TimeUnit.SECONDS);
		driver.get("https://www.bjs.com/");
		String appurl = driver.getCurrentUrl();
		System.out.println("The APP url is :" +appurl);
		WebElement login = driver.findElement(By.className("login-state ml-1"));
		login.click();
		
		WebElement login1 = driver.findElement(By.xpath("//button[text()='CREATE A LOGIN']"));
		login1.click();
		
		String url2= driver.getCurrentUrl();
		System.out.println("The URl name is : "+url2);
		driver.close();
		

	}

}
