package com.ibm.css;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class OmayaJS {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		 System.setProperty("webdriver.chrome.driver", "./drivers/chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		
		driver.manage().window().maximize();
		
		driver.get("http://omayo.blogspot.com/");
		
		JavascriptExecutor js= (JavascriptExecutor)driver;
		
//	WebElement click=	driver.findElement(By.xpath("//a[text()=\"compendiumdev\"]"));
//	
//	js.executeScript("arguments[0].click();", click);
	
	WebElement click1=	driver.findElement(By.xpath("//a[text()=\"testwisely\"]"));
	
	js.executeScript("arguments[0].click();", click1);

	}

}
