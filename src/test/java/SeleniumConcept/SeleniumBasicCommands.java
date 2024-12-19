package SeleniumConcept;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class SeleniumBasicCommands {
	
	public static void main(String[] args) throws InterruptedException {
		
		WebDriver driver=new ChromeDriver();
		
		driver.get("https://www.amazon.in");
		System.out.println(driver.getCurrentUrl());
		System.out.println(driver.getTitle());
		
		//Back
		driver.navigate().back();
		Thread.sleep(2000);	
		//Forward
		driver.navigate().forward();
		
		//Reload
		driver.navigate().refresh();
		
		//Close 
		driver.close(); // Will close current open window  
		driver.get("https://www.amazon.in"); // No such session exception, invalid session id
		driver.quit();  // Will close all opened windows
		driver.get("https://www.amazon.in"); // No such session exception, session id is null 
		
	}

}
