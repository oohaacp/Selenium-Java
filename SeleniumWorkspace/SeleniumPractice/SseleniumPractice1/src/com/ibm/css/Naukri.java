package com.ibm.css;

import java.util.Iterator;
import java.util.Set;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Naukri {

	public static void main(String[] args) 
	{
		System.setProperty("webdriver.chrome.driver", "./drivers/chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		
		driver.manage().window().maximize();
		
		String Parentwindow=driver.getWindowHandle();
		String Childwindow=driver.getWindowHandle();
		
		driver.get("https://www.naukri.com/");
		
		Set<String> windows=driver.getWindowHandles();
		System.out.println("no of windows:"+windows.size());
		
		Iterator itr=windows.iterator();
		while (itr.hasNext()) 
		{
			String windowid = (String) itr.next();
			System.out.println(windowid);
			
			driver.switchTo().window(windowid);//windows opening u want in same windowso using switch to based on child id we can switch
//			System.out.println(driver.getTitle());
//			System.out.println(driver.getClass());
//			System.out.println(driver.getCurrentUrl());
//			
//			if(!Parentwindow.equalsIgnoreCase(windowid))
//			{
//				driver.close();
//			}
			
//			if(!driver.getTitle().contentEquals("JP Morgan"));
//			{
//				driver.close();
//			}
			
//			if(driver.getCurrentUrl().equalsIgnoreCase("https://www.naukri.com/"));
//			{
//				driver.close();
//			}
//			
//			if(!Childwindow.equalsIgnoreCase(windowid)) {
//				driver.close();
//			}
			
			if(!Parentwindow.equalsIgnoreCase(Parentwindow))
			{
				driver.close();
			}
		}

	}

}
