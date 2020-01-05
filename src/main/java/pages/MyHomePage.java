package pages;

import base.SuperSpecificMethods;

public class MyHomePage extends SuperSpecificMethods {


	public MyLeadsPage clickLeads() {

		driver.findElementByLinkText("Leads").click();
		return new MyLeadsPage();
	}


}
