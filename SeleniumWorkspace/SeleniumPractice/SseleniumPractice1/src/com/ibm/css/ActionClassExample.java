package com.ibm.css;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class ActionClassExample {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver", "./drivers/chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		
//		driver.get("https://the-internet.herokuapp.com/hovers");
//		
//		Actions action =new Actions(driver);
//		
//	WebElement ele=	driver.findElement(By.xpath("//div[@class=\"figure\"]"));
//	
//	action.moveToElement(ele);
//	
//	action.build().perform();
		
		driver.get("http://demo.guru99.com/test/drag_drop.html");
		
		Actions act=new Actions(driver);
		
		WebElement source=driver.findElement(By.xpath("//a[@class=\"button button-orange\"]"));
		WebElement target= driver.findElement(By.xpath("//ol[@id=\"amt8\"]"));
		act.dragAndDrop(source, target);
	
	

	}

}
