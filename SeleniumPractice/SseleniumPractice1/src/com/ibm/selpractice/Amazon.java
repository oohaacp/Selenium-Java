package com.ibm.selpractice;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Amazon {

	public static void main(String[] args) 
	{
		System.setProperty("webdriver.chrome.driver", "./drivers/chrome,exe");
	
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		
		/*
		 * driver.get(
		 * "https://www.amazon.in/s?bbn=1388867031&rh=n%3A976419031%2Cn%3A1388867031&dc&qid=1623468256&ref=lp_1388868031_ex_n_1"
		 * );
		 */
 driver.get("https://www.amazon.in/");
		System.out.println("hey hi Amazon");
//		
//		driver.findElement(By.xpath("//span[text()='Accessories']//parent::span[@class='a-list-item']")).click();
	}

}
