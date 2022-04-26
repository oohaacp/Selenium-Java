package com.ibm.css;

import java.awt.AWTException;
import java.awt.Robot;
import java.awt.event.KeyEvent;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class RobotClass {

	

	

	public static void main(String[] args) throws AWTException 
	{
		
		 System.setProperty("webdriver.chrome.driver", "./drivers/chromedriver.exe");
			WebDriver driver=new ChromeDriver();
			driver.manage().window().maximize();
		
			driver.get("https://www.google.com/");
			
		Robot robot=new Robot();
		
		robot.keyPress(KeyEvent.VK_CAPS_LOCK);
		robot.keyRelease(KeyEvent.VK_CAPS_LOCK);
		
		robot.keyPress(KeyEvent.VK_S);
		
		robot.keyRelease(KeyEvent.VK_S);
		
		robot.keyPress(KeyEvent.VK_CAPS_LOCK);
		robot.keyRelease(KeyEvent.VK_CAPS_LOCK);
		
		
		robot.keyPress(KeyEvent.VK_E);
		
		robot.keyRelease(KeyEvent.VK_E);
		
		
       robot.keyPress(KeyEvent.VK_L);
		
		robot.keyRelease(KeyEvent.VK_L);
		
		
		robot.keyPress(KeyEvent.VK_E);
		
		robot.keyRelease(KeyEvent.VK_E);
		
		
		 robot.keyPress(KeyEvent.VK_N);
			
			robot.keyRelease(KeyEvent.VK_N);
			
			
			robot.keyPress(KeyEvent.VK_I);
			
			robot.keyRelease(KeyEvent.VK_I);
			
			
            robot.keyPress(KeyEvent.VK_U);
			
			robot.keyRelease(KeyEvent.VK_U);
			
			
			robot.keyPress(KeyEvent.VK_M);
			
			robot.keyRelease(KeyEvent.VK_M);
			
			robot.keyPress(KeyEvent.VK_ENTER);
			robot.keyRelease(KeyEvent.VK_ENTER);
			
			

	}

}
