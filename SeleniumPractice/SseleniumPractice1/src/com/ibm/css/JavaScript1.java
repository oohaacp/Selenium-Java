e345Zpackage com.ibm.css;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class JavaScript1 {
	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", "./drivers/chromedriver.exe");
		WebDriver driver = new ChromeDriver();

		driver.manage().window().maximize();

		driver.get("https://www.westernunion.com/in/en/web/user/register");

		JavascriptExecutor je = (JavascriptExecutor) driver;

//	System.out.println(je.executeScript("return document.title"));

		// if u arenot enter return it will not displayed

		String title = je.executeScript("return document.title").toString();
		System.out.println(title);

		je.executeScript("window.scrollBy(0,500)");
		
		
		 WebElement ele=
		 driver.findElement(By.xpath("//div[@id=\"address-register-container\"]")); //
		je.executeScript("arguments[0].scrollIntoView(true);", ele);
		
		 WebElement
			 click=driver.findElement(By.xpath("//button[@id=\"button-continue\"]"));
//	
//	je.executeScript("arguments[0].click();", click);
//	
//	je.executeScript("document.getElementById('firstName').value='ooha' ");

	}

}
