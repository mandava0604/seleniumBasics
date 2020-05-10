package Seleniumbasics;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Seleniumcommands {

	public static void main(String[] args) 
	{
		WebDriverManager.chromedriver().setup();
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(2000,TimeUnit.SECONDS);
		driver.get("https://www.bjs.com/");
		String appurl = driver.getCurrentUrl();
		System.out.println("The APP url is :" +appurl);
		
		//WebElement login = driver.findElement(By.xpath("/html/body/app-root/div/div[1]/header/app-header-template/div[3]/ul/li[3]/a[1]"));
		//login.click();
		
		WebElement signin = driver.findElement(By.xpath("/html/body/app-root/div/div[1]/header/app-header-template/div[2]/ul/li[5]/div[1]/app-header-my-account/div/div/span/a/span"));
		signin.click();
		String appur2 = driver.getCurrentUrl();
		System.out.println("The APP url is :" +appur2);
		
	    //String emaillogin = driver.findElement(By.xpath//input[@id='emailLogin']));
	    
	    		
				

	}

}
