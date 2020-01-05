package testcases;

import org.testng.annotations.Test;

import base.SuperSpecificMethods;
import pages.LoginPage;


public class TC_02_CreateLead extends SuperSpecificMethods{

	@Test
	public void tc_02_createlead() {

		new LoginPage()


		.enterUserName()
		.enterPassword()
		.clickLogin()

		.clickLogo()

		.clickLeads()

		.clickCreateLead()


		.enterCompanyName()
		.enterFirstName()
		.enterLastName()
		.clickCreateLeadButton()

		.verifyName();



	}
}
