package pages;

import base.SuperSpecificMethods;

public class MyLeadsPage extends SuperSpecificMethods {


	public CreateLeadPage clickCreateLead() {

		driver.findElementByLinkText("Create Lead").click();
		return new CreateLeadPage();
	}


}
