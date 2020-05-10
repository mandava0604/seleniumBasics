package Seleniumbasics;

import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class allpagelinks {

	public static void main(String[] args) {
		WebDriverManager.chromedriver().setup();
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(1000, TimeUnit.SECONDS);
		driver.get("http://demowebshop.tricentis.com/login");
		
		List <WebElement> allthelinks = driver.findElements(By.tagName("a"));
		int linkscount = allthelinks.size();
		System.out.println("Total number of links:" +linkscount);
		
		for(int i=0;i<linkscount;i++) {
			WebElement ele1 = allthelinks.get(i);
			String urllink = ele1.getAttribute("href");
			System.out.println("The url is :" +urllink);
		}
		/*WebElement ele1 = allthelinks.get(0);
		String urllink = ele1.getAttribute("href");
		System.out.println("The url is :" +urllink);*/
		
		driver.close();
	}

}
