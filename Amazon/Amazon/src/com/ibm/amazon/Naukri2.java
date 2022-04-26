package com.ibm.amazon;

import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Naukri2 {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", "./drivers2/chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		
		driver.manage().window().maximize();
		
		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		
		driver.get("https://www.amazon.in/");
		
		driver.findElement(By.xpath("//span[text()=\"Hello, Sign in\"]"));
		
		driver.findElement(By.xpath("//span[text()=\"Prime\"]")).click();
		
		driver.findElement(By.xpath("//img[@id=\"multiasins-img-link\"]")).click();
		
		List<WebElement> linksize=driver.findElements(By.tagName("a"));
		
		System.out.println(linksize.size());
	}

}
