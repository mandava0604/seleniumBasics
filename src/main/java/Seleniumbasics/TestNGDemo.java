package Seleniumbasics;

import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class TestNGDemo {
	
	@BeforeClass
	public void launchurl() {
		System.out.println("Open the URL");
	}
	
	@BeforeMethod
	public void intialurls() {
		System.out.println("Intializing the login");
	}
	
	//@Test (priority = 1, enabled=false)
	@Test(priority=1, groups = {"Sanitycheck", "Regressiontest"})
	public void test1() {
		System.out.println("The results of Test1 executed");
	}
	
	@Test (priority = 4, timeOut = 5000,groups = {"Sanitycheck"})
	public void test2() throws InterruptedException {
		System.out.println("The results of Test2 executed");
		Thread.sleep(6000);
	}
	
	@Test (priority=3,groups = {"Sanitycheck", "Regressiontest"},dependsOnMethods = "test2")
	public void test3() {
		System.out.println("The results of Test3 executed");
	}
	
	@Test (priority=2)
	public void test4() {
		System.out.println("The results of Test4 executed");
	}
	
	@AfterMethod
	public void endresults() {
		System.out.println("Close all the browsers after execution");
	}
	
	@AfterClass
	public void close() {
		System.out.println("End the execution");
	}

}
