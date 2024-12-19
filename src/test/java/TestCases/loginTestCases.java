package TestCases;

import java.io.IOException;

import org.testng.annotations.Test;

import PageObjectModel.homePageObjects;
import Resources.baseClass;

public class loginTestCases extends baseClass {
	
	@Test
	public void verifyLoginWithValidData() throws IOException {

		homePageObjects hpo = new homePageObjects(driver);

		hpo.clickOnMyAccount().click();
		
		//call login method 
		
		
		//create loginpageobjects object
		
		//lpo.enteremailAdess().sendKEys(emailAddress);
		
		
	}

}
