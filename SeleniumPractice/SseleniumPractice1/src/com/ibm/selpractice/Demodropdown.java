package com.ibm.selpractice;

import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class Demodropdown {

	public static void main(String[] args) throws InterruptedException 
	{
		System.setProperty("webdriver.chrome.driver", "./drivers2/chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		
		driver.manage().window().maximize();
		
		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		
		driver.get("https://www.westernunion.com/in/en/web/user/register");
		
     WebElement dropdown  =driver.findElement(By.xpath("//select[@name=\"selectedPrimaryPhoneTypes\"]"));
     
     Select dropdown1=new Select(dropdown);
     
     dropdown1.selectByIndex(1);
     Thread.sleep(3000);
     
     dropdown1.selectByValue("Mobile");
     Thread.sleep(3000);
     
   List<WebElement> mobile =dropdown1.getOptions();
   
   for (WebElement webElement : mobile) 
   {
	System.out.println(webElement.getText());
}
	}

}
