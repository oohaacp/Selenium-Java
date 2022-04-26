package com.ibm.css;

import java.time.Duration;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.FluentWait;
import org.openqa.selenium.support.ui.Wait;
import org.openqa.selenium.support.ui.WebDriverWait;

public class StaleException {

	public static void main(String[] args) 
	{
		 System.setProperty("webdriver.chrome.driver", "./drivers/chromedriver.exe");
		
      WebDriver driver=new ChromeDriver();
      driver.manage().window().maximize();
      
      driver.get("https://www.westernunion.com/in/en/web/user/register");
      
//     driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);//implicit wait
     
		/*
		 * WebDriverWait wait=new WebDriverWait(driver, 1);
		 * 
		 * wait.until(ExpectedConditions.visibilityOf(driver.findElement(By.xpath(
		 * "//input[@id=\"address2\"]")))).click();
		 */
      
     Wait <WebDriver> fluentwait=new FluentWait<WebDriver>(driver)
    .withTimeout(Duration.ofSeconds(100))
    .pollingEvery(Duration.ofSeconds(10)).ignoring(Exception.class);
     
     fluentwait.until(ExpectedConditions.visibilityOf(driver.findElement(By.xpath("//input[@id=\"address2\"]"))));
     
     
     Wait<WebDriver> fluentwait1=new FluentWait(driver).withTimeout(Duration.ofSeconds(100))
    		 .pollingEvery(Duration.ofSeconds(10)).ignoring(Exception.class);
     
     fluentwait1.until(ExpectedConditions.visibilityOf(driver.findElement(By.xpath(""))));
	}

}
