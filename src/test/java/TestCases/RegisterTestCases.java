package TestCases;

import java.io.IOException;
import java.time.Duration;

import org.testng.annotations.Test;
import PageObjectModel.homePageObjects;
import PageObjectModel.registerPageObjects;
import Resources.baseClass;
import Resources.commonMethods;
import Resources.constants;

public class RegisterTestCases extends baseClass {
	@Test
	public void VerifyRegistrationWithValidData() throws IOException {

		driver.manage().window().maximize();

		homePageObjects hpo = new homePageObjects(driver);

		hpo.clickOnMyAccount().click();
		hpo.clickOnMyResgister().click();

		registerPageObjects rpo = new registerPageObjects(driver);

		commonMethods.handlExplictWait(driver, 10, rpo.EnterFirstName());
		rpo.EnterFirstName().sendKeys(constants.FirstName); // 10
		rpo.EnterLastName().sendKeys(constants.LastName);
		rpo.EnterEmail().sendKeys(EmailAddress);

		commonMethods.handlExplictWait(driver, 15, rpo.EnterTelephone());
		rpo.EnterTelephone().sendKeys(constants.Telephone); // 15
		rpo.EnterPassword().sendKeys(constants.Password);
		rpo.EnterConfirmPassword().sendKeys(constants.ConfirmPassword);
		rpo.CheckCheckbox().click();
		rpo.ClickContinue().click();
		rpo.LogoutButton().click();

//		String ExpectedResult = constants.RegistrationExpectedResult;
//		String ActualResult = rpo.RegisteredSuccessfullyMessage().getText();

//		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
//
//		commonMethods.handleAssertion(ActualResult, ExpectedResult);

	}

	@Test(enabled = false)
	public void VerifyRegistrationWithBlankData() {

		homePageObjects hpo = new homePageObjects(driver);

		hpo.clickOnMyAccount().click();
		hpo.clickOnMyResgister().click();

		registerPageObjects rpo = new registerPageObjects(driver);

		rpo.ClickContinue().click();

		String FirstNameExpectedResult = constants.FirstNameRegistrationErrorMessage;
		String FirstNameActualResult = rpo.FirstNameErrorMessage().getText();

		commonMethods.handleAssertion(FirstNameActualResult, FirstNameExpectedResult);

		String LastNameExpectedResult = constants.LastNameRegistrationErrorMessage;
		String LastNameActualResult = rpo.LastNameErrorMessage().getText();

		commonMethods.handleAssertion(LastNameActualResult, LastNameExpectedResult);

		String EmailExpectedResult = constants.EmailRegistrationErrorMessage;
		String EmailActualResult = rpo.EmailErrorMessage().getText();

		commonMethods.handleAssertion(EmailActualResult, EmailExpectedResult);

		String TelePhoneExpectedResult = constants.TelephoneRegistrationErrorMessage;
		String TelePhoneActualResult = rpo.TelePhoneErrorMessage().getText();

		commonMethods.handleAssertion(TelePhoneActualResult, TelePhoneExpectedResult);

		String PasswordExpectedResult = constants.PasswordRegistrationErrorMessage;
		String PasswordActualResult = rpo.PasswordErrorMessage().getText();

		commonMethods.handleAssertion(PasswordActualResult, PasswordExpectedResult);

		String CheckBoxExpectedResult = constants.CheckBoxRegistrationErrorMessage;
		String CheckBoxActualResult = rpo.CheckBoxErrorMessage().getText();

		commonMethods.handleAssertion(CheckBoxActualResult, CheckBoxExpectedResult);

	}
}
