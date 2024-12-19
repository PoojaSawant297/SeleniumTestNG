package TestCases;

import java.io.IOException;

import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;

import PageObjectModel.homePageObjects;
import PageObjectModel.registerPageObjects;
import Resources.baseClass;
import Resources.constants;

public class RegisterTestCases extends baseClass {

	@Test
	public void verifyRegisterationWithValidData() throws IOException {

		homePageObjects hpo = new homePageObjects(driver);

		hpo.clickOnMyAccount().click();
		hpo.clickOnMyResgister().click();

		registerPageObjects rpo = new registerPageObjects(driver);

		rpo.enterFirstName().sendKeys(constants.FirstName);

		rpo.enterLastName().sendKeys(constants.LastName);

		rpo.enterEmail().sendKeys(constants.Telephone);

		rpo.enterTelephone().sendKeys("9897878801");

		rpo.Password().sendKeys("test@123");

		rpo.confirmPassword().sendKeys("test@123");

		rpo.clickCheckbox().click();

		rpo.conntinueButton().click();

		String expectedresult = "Your Account Has Been Created!";

		String actualresult = rpo.registersuccessful().getText();

		SoftAssert sa = new SoftAssert();
		sa.assertEquals(actualresult, expectedresult);

		sa.assertAll();

	}

	@Test
	public void verifyregisterwithblankdata() {

		homePageObjects hpo = new homePageObjects(driver);

		hpo.clickOnMyAccount().click();
		hpo.clickOnMyResgister().click();

		registerPageObjects rpo = new registerPageObjects(driver);

		rpo.conntinueButton().click();
		
		SoftAssert sa = new SoftAssert();
		
		String FirstnameExpected = rpo.enterLastName().getText();
		String FirstNameActual = "";
	
		
		sa.assertEquals(FirstNameActual, FirstnameExpected);
		
		String LastnameExpected = rpo.enterLastName().getText();
		
		String LastNameActual = ""; 
		
		sa.assertEquals(LastNameActual, LastnameExpected);
		
		sa.assertAll();

		

	}

}
