package com.io.testng.demo;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Properties;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.testng.annotations.Test;

public class checkout extends gotocart{
	
	@Test
	public void checkout() throws IOException
	{
	Properties prop = new Properties();
	FileInputStream io=new FileInputStream("C:\\Users\\Admin\\eclipse-workspace\\MyWs\\com.io.testng.demo\\src\\test\\java\\com\\io\\testng\\demo\\pagefactory");
	prop.load(io);
	driver.manage().timeouts().implicitlyWait(10,TimeUnit.SECONDS);
	driver.findElement(By.xpath(prop.getProperty("checkout.xpath"))).click();
	}
}




