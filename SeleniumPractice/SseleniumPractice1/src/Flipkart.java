import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

import com.sun.corba.se.spi.orbutil.fsm.Action;

public class Flipkart {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", "./drivers1/chromedriver.exe");

		WebDriver driver = new ChromeDriver();
		
		driver.manage().window().maximize();
		
		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		
		driver.get("https://www.flipkart.com/");
		
		WebElement more=driver.findElement(By.xpath("//div[@class=\"exehdJ\"]"));
		
		Actions act=new Actions(driver);
		
		act.moveToElement(more);
		
		act.build().perform();
		
		driver.findElement(By.xpath("//div[text()=\"Sell on Flipkart\"]")).click();
	}

}
