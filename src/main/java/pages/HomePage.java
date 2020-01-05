package pages;

import base.SuperSpecificMethods;

public class HomePage extends SuperSpecificMethods {

	public MyHomePage clickLogo() {

		driver.findElementByLinkText("CRM/SFA").click();
		return new MyHomePage();
	}

}
