package com.ibm.selpractice;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Practise1 {

	public static void main(String[] args) 
	{
	System.out.println("hey hai sele");
	
	System.setProperty("webdriver.chrome.driver", "./drivers/chromedriver.exe");
	
	WebDriver driver=new ChromeDriver();
	driver.manage().window().maximize();
	
	driver.get("http://omayo.blogspot.com/");
	
	driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
	
	System.out.println(driver.getCurrentUrl());
	System.out.println("Title:"+driver.getTitle());
	
//    driver.findElement(By.tagName("input")).sendKeys("anil");
//    driver.findElement(By.tagName("input")).sendKeys("treddy");//it will display in single field by using tag name
    
		/*
		 * driver.findElement(By.id("firstName")).sendKeys("oohaa");
		 * driver.findElement(By.id("middleName")).sendKeys("reddy");
		 * driver.findElement(By.id("lastName")).sendKeys("chittoor ");
		 * driver.findElement(By.id("dob")).sendKeys("03051996");
		 * 
		 * driver.findElement(By.id("registerTitle")).getText();
		 * 
		 * WebElement text= driver.findElement(By.id("registerTitle"));
		 * 
		 * System.out.println(text.getText());
		 * 
		 * driver.findElement(By.linkText("Online Privacy Statement")).click();
		 * 
		 * driver.findElement(By.partialLinkText("Online Privacy")).click();
		 * 
		 * driver.findElement(By.id("OptimusApp")).click();
		 */
    
//    driver.findElement(By.id("button-continue")).click();
    
    
    


	}

}
