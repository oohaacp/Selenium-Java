package com.ibm.css;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class OmayoRobert {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", "./drivers/chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		
		driver.get("http://omayo.blogspot.com/");
		
		Actions act =new Actions(driver);
		
		WebElement ele=driver.findElement(By.xpath("//span[@id=\"blogsmenu\"]"));
		
		act.moveToElement(ele);
		
		act.build().perform();
		
		WebElement ele1=driver.findElement(By.linkText("Cross-Column 2"));
		
		act.click(ele1);
		
		act.build().perform();

	}

}
