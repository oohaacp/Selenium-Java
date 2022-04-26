package com.ibm.selpractice;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Iframe {

	public static void main(String[] args) 
	{
		System.setProperty("webdriver.chrome.driver", "./drivers/chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		
		driver.manage().window().maximize();
		
		driver.get("https://the-internet.herokuapp.com/iframe");
		
		driver.switchTo().frame(0);//by frame id also we can switch
		
		
	 WebElement store=driver.findElement(By.xpath("//body[@id='tinymce']/p"));
	
	 store.clear();
	
	 store.sendKeys("ooha");
		

	}

}
