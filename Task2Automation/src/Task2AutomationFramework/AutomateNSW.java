package Task2AutomationFramework;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import dev.failsafe.internal.util.Assert;

public class AutomateNSW {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		

		String driverExecutablePath = "/Users/virendrarawat/Desktop/SeleniumProject/chromedriver";
		System.setProperty("webdriver.chrome.driver", driverExecutablePath);
		
		// Create a new instance of the Chrome driver 
		WebDriver driver = new ChromeDriver(); 
		
		// Storing the Application url in the String variable 
		String url = "https://www.nsw.gov.au/news"; 
		
		//Launch the NSW Govt WebSite 
		driver.get(url); 
		
		driver.manage().window().maximize();
		
		//locate and expand the "Select topics element
		driver.findElement(By.xpath("//fieldset[@id='edit-fieldset-category']")).click();
		
		//locate and select the "Business and Economy" option
		driver.findElement(By.xpath("//label[contains(text(),'Business and Economy')]")).click();
		
		//locate and click the "Applu" Button
		driver.findElement(By.xpath("//input[@id='edit-submit-news']")).click();
		
		
		Thread.sleep(5000);
		
		//locate and click Reset filter link
		driver.findElement(By.cssSelector("[id^='edit-reset']")).click();
		
		
		Thread.sleep(5000);
		
		driver.close();
		
		
		

	}
}


