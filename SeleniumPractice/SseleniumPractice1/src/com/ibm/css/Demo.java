package com.ibm.css;

import java.util.Iterator;
import java.util.Set;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Demo {

	public static void main(String[] args) 
	{
		System.setProperty("webdriver.chrome.driver", "./drivers2/chromedriver.exe");
		
		WebDriver driver=new ChromeDriver();
		
		driver.manage().window().maximize();
		
		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		
		driver.get("https://www.naukri.com/");
		
		String parentwindow=driver.getWindowHandle();
		String childwindow=driver.getWindowHandle();
		
		Set<String> windowcount=driver.getWindowHandles();
		
		System.out.println(windowcount.size());
	
		Iterator<String> itr=windowcount.iterator();
		
		while(itr.hasNext())
		{
			String windowid=itr.next();
			System.out.println(windowid);
		}
		
		if(!parentwindow.equalsIgnoreCase(parentwindow))
		{
			driver.close();
		}
		

	}

}
