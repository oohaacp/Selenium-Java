package com.testng.practice;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class TestNg1 
{
	
	
WebDriver driver;
	
	@BeforeMethod
	public void setUp()
	{
		System.setProperty("webdriver.chrome.driver", "./drivers/chrome.exe");
		WebDriver driver=new ChromeDriver();
		driver.manage().timeouts().pageLoadTimeout(30, TimeUnit.SECONDS);
		driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
		driver.manage().window().maximize();
		driver.get("https://www.westernunion.com/in/en/web/user/register");
	
	}
	
	@Test
	public void verifyPageTitle()
	{
		String title=driver.getTitle();
		System.out.println("the page title:"+ title);
		
		Assert.assertEquals(title, "Register a profile with Western Union IN");
	}
	
	
	@AfterMethod
	public void tearDown()
	{
		driver.quit();
	}
}
