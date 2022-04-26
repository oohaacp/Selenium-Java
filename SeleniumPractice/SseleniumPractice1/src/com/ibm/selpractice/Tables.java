package com.ibm.selpractice;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Tables {

	public static void main(String[] args) 
	{
		System.setProperty("webdriver.chrome.driver", "./drivers/chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		
		driver.manage().window().maximize();
		
		driver.get("https://the-internet.herokuapp.com/tables");
		
		List <WebElement> allrows=driver.findElements(By.xpath("//table[@id='table1']/tbody/tr"));
		
           System.out.println("all rows are:"+allrows.size());
           
           List <WebElement> columns = driver.findElements(By.xpath("//table[@id='table1']/tbody/tr[1]/td"));
           
           System.out.println("no fo coulums:"+columns.size());
	}

}
