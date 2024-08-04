package com.interlinking.testCases;

import org.junit.AfterClass;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.testng.annotations.BeforeClass;

public class BaseClass11 {

		
		public String baseURL="https://customer.albertapayments.com/";
		public String username="jagdeesh@albertapayments.com";
		public String password= "123456";
		public static WebDriver driver;
		@BeforeClass
		public void setup()
		{
			  ChromeOptions options = new ChromeOptions();
			  driver = new ChromeDriver();

				driver.manage().window().maximize();
		}
		@AfterClass
		public void tearDown()
		{
			driver.quit();
		}

}
