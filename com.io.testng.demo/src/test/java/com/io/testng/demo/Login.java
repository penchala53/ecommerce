package com.io.testng.demo;

import java.io.FileInputStream;
import java.util.Properties;

import org.openqa.selenium.By;
import org.testng.annotations.Test;

public class Login extends BaseClass {
	@Test(description="This TC will perform valid login")
	public void loginToApplications() throws Throwable
	{
		Properties prop = new Properties();
		FileInputStream io=new FileInputStream("C:\\Users\\Admin\\eclipse-workspace\\MyWs\\com.io.testng.demo\\src\\test\\java\\com\\io\\testng\\demo\\pagefactory");
		prop.load(io);
		driver.findElement(By.id(prop.getProperty("loginusername.id"))).sendKeys("standard_user");
		driver.findElement(By.id(prop.getProperty("loginpassword.id"))).sendKeys("secret_sauce");
		driver.findElement(By.id(prop.getProperty("loginbutton.id"))).click();
		
		Thread.sleep(5000);
	}
}
