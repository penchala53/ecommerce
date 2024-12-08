package com.io.testng.demo;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Properties;

import org.openqa.selenium.By;
import org.openqa.selenium.support.ui.Select;
import org.testng.annotations.Test;

public class addcart extends Login {

@Test
public void addtocart() throws IOException {
	Properties prop = new Properties();
	FileInputStream io=new FileInputStream("C:\\Users\\Admin\\eclipse-workspace\\MyWs\\com.io.testng.demo\\src\\test\\java\\com\\io\\testng\\demo\\pagefactory");
	prop.load(io);driver.findElement(By.xpath(prop.getProperty("addtocart.xpath"))).click();
	
	Select objSelect = new Select(driver.findElement(By.xpath("*//select[@class='product_sort_container']")));
	objSelect.selectByValue("Price (low to high)");

	
	
}
	

}
