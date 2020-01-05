package pages;

import base.SuperSpecificMethods;

public class CreateLeadPage extends SuperSpecificMethods {


	public CreateLeadPage enterFirstName() {

		driver.findElementById("createLeadForm_firstName").sendKeys("Gopi");
		return this;
	}
	
	public CreateLeadPage enterCompanyName() {

		driver.findElementById("createLeadForm_companyName").sendKeys("TestLeaf");
		return this;
	}
	
	public CreateLeadPage enterLastName() {

		driver.findElementById("createLeadForm_lastName").sendKeys("J");
		return this;
	}
	
	public ViewLeadPage clickCreateLeadButton() {

		driver.findElementByName("submitButton").click();
		return new ViewLeadPage();
	}


}
