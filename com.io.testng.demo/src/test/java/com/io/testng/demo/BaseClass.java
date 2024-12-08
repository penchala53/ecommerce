package com.io.testng.demo;
import org.testng.Reporter;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.AfterClass;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class BaseClass {
	WebDriver driver;
	
	
	@BeforeClass
	public void setupApplication()
	{
		Reporter.log("=====Browser Session Started=====", true);
driver=new ChromeDriver();
		
		driver.manage().window().maximize();
driver.get("https://www.saucedemo.com/v1/");
		
		Reporter.log("=====Application Started=====", true);
	}
	
}
