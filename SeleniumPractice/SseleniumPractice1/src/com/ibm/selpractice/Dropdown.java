package com.ibm.selpractice;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

import com.sun.xml.internal.bind.v2.schemagen.xmlschema.List;

public class Dropdown {
	public static void main(String[] args) throws Exception {

		System.setProperty("webdriver.chrome.driver", "./drivers2/chromedriver.exe");

		WebDriver driver = new ChromeDriver();

		driver.get("http://omayo.blogspot.com/");

		driver.manage().window().maximize();

		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);

		WebElement CourseElement = driver.findElement(By.id("drop1"));

		Select courseNameDropdown = new Select(CourseElement);

		java.util.List<WebElement> courseNameDropdownOptions = courseNameDropdown.getOptions();// display all th
																								// elements

		for (WebElement Option : courseNameDropdownOptions) {
			System.out.println(Option.getText());// python

		}
		courseNameDropdown.selectByIndex(2);
		Thread.sleep(3000);

		courseNameDropdown.selectByValue("def");
		Thread.sleep(3000);

		courseNameDropdown.selectByVisibleText("doc 2");
		Thread.sleep(3000);
		
		courseNameDropdown.selectByVisibleText("doc 3");
		Thread.sleep(3000);

		String selectedtext = courseNameDropdown.getFirstSelectedOption().getText();// by default selected name it will
																					// dispaly
		System.out.println("selected visible text:::" + selectedtext);
	}

}
