package com.cicd.tests;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;

public class CICDDemoClassTest {
	WebDriver driver =null;
	@BeforeMethod
	public void launch() {
		WebDriverManager.chromedriver().setup();
		driver = new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(10,TimeUnit.SECONDS);
		
		
	}
	@Test
	public void test1() {
		driver.get("http://www.google.com");
		System.out.println("First Test"+driver.getTitle());
	}
	@Test
	public void test2() {
		driver.get("http://www.google.com");
		System.out.println("2 Test"+driver.getTitle());
	}
	@Test
	public void test3() {
		driver.get("http://www.google.com");
		System.out.println("3 Test"+driver.getTitle());
	}
	@Test
	public void test4() {
		driver.get("http://www.google.com");
		System.out.println("4 Test"+driver.getTitle());
	}
	
	
	@AfterMethod
	public void tearDown(){
		driver.quit();
	}

}
