package com.io.testng.demo;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Properties;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.annotations.Test;

public class gotocart extends addcart {
	@Test
	public void gotocart() throws IOException
	{
		Properties prop = new Properties();
		FileInputStream io=new FileInputStream("C:\\Users\\Admin\\eclipse-workspace\\MyWs\\com.io.testng.demo\\src\\test\\java\\com\\io\\testng\\demo\\pagefactory");
		prop.load(io);
		driver.findElement(By.xpath(prop.getProperty("gotocart.xpath"))).click();
		WebElement prdtqty= driver.findElement(By.xpath("*//div[@class='cart_quantity']"));	
		System.out.println(prdtqty.getText());
		WebElement prdtdesc= driver.findElement(By.xpath("*//div[@class='inventory_item_desc']"));	
		System.out.println(prdtdesc.getText());
	}

}
