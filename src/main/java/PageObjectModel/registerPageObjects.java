package PageObjectModel;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class registerPageObjects {

	public WebDriver driver;
	
	private  By firstname = By.xpath("//input[@name='firstname']");
	
	private  By lastname = By.xpath("//input[@name='lastname']");
	
	private  By email = By.xpath("//input[@name='email']");
	
	private By telephone = By.xpath("//input[@name='telephone']");
	
	private By password = By.xpath("//input[@name='password']");
	
	private By confirmPassword = By.xpath("//input[@name='confirm']");
	
	private By checkbox = By.xpath("//input[@type='checkbox']");
	
	private By continuebutton = By.xpath("//input[@type='submit']");
	
	private By registersuccessfully = By.xpath("//h1[text()='Your Account Has Been Created!']");
	
	

	
	

	
	//Add the remaining xpath
	
	//Add the error message xpath also
	
	
	public registerPageObjects(WebDriver driver) {
		this.driver = driver;
	}


	public WebElement enterFirstName() {
		
		return driver.findElement(firstname);
		
	}
	
	public WebElement enterLastName() {
		
		return driver.findElement(lastname);
		
	}
	
	public WebElement enterEmail() {
		return driver.findElement(email);
		
	}
	
	public WebElement enterTelephone() {
		return driver.findElement(telephone);
		
	}
	 
	public WebElement Password() {
		return driver.findElement(password);
		
	}
	
	public WebElement confirmPassword() {
		return driver.findElement(confirmPassword);
		
	}
	
	public WebElement clickCheckbox() {
		return driver.findElement(checkbox);
		
	}
	
	public WebElement conntinueButton() {
		return driver.findElement(continuebutton);
		
	}
	
	
	public WebElement registersuccessful () {
		return driver.findElement(registersuccessfully);
		
	}
	//Add the reaming methods 
	 
	
}

