package com.ibm.css;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class CssID {

	public static void main(String[] args) 
	{
		System.setProperty("webdriver.chrome.driver", "./drivers/chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		
//		driver.get("https://www.westernunion.com/in/en/web/user/register");
		driver.get("https://the-internet.herokuapp.com/javascript_alerts");
		
		driver.findElement(By.xpath("//button[text()='Click for JS Alert']")).click();
		
		
	  
		Alert alert=driver.switchTo().alert();
	    alert.accept();
	    System.out.println(alert.getText());
	    
	    driver.findElement(By.xpath("//button[text()='Click for JS Confirm']")).click();
	    
	    Alert alert1 =driver.switchTo().alert();
	   
	   System.out.println(alert1.getText());
	   alert1.dismiss();
	   
	   driver.findElement(By.xpath("//button[text()='Click for JS Prompt']")).click();
	   
       Alert alert2 =driver.switchTo().alert();
	   
	   System.out.println(alert1.getText());
	   alert2.getText();
	   
	  
	  
		
		
		
		/*
		 * driver.findElement(By.cssSelector("#firstName")).sendKeys("heyyyyyy");
		 * 
		 * 
		 * driver.navigate().forward(); driver.navigate().to(
		 * "https://www.amazon.in/s?bbn=1388867031&rh=n%3A976419031%2Cn%3A1388867031&dc&qid=1623468256&ref=lp_1388868031_ex_n_1"
		 * ); driver.navigate().back(); driver.navigate().refresh();
		 * driver.navigate().forward();
		 */
            
	}

}
