package TestCases;

import java.io.IOException;
import java.time.Duration;

import org.testng.annotations.Test;
import PageObjectModel.homePageObjects;
import PageObjectModel.loginPageObjects;
import Resources.baseClass;
import Resources.commonMethods;

public class loginTestCases extends baseClass {

	@Test
	public void verifyLoginWithValidData() throws IOException {

		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));

		// Optional: Maximize window

		homePageObjects hpo = new homePageObjects(driver);

		hpo.clickOnMyAccount().click();

		hpo.ClickOnLogin().click();

		loginPageObjects lpo = new loginPageObjects(driver);

		lpo.EnterEmailAdress().sendKeys(EmailAddress);
		lpo.EnterPassWord().sendKeys("123456789");
		lpo.ClickOnLogin().click();

		String ExpectedResult = "Account";
		String ActualResult = lpo.loginSuccess().getText();

		commonMethods.handleAssertion(ActualResult, ExpectedResult);

	}

}
