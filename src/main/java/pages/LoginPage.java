package pages;

import base.SuperSpecificMethods;

public class LoginPage extends SuperSpecificMethods {

	public LoginPage enterUserName() {

		driver.findElementById("username").sendKeys("DemoSalesManager");
		return this;
	}

	public LoginPage enterPassword() {		
		driver.findElementById("password").sendKeys("crmsfa");
		return this;
	}

	public HomePage clickLogin() {
		driver.findElementByClassName("decorativeSubmit").click();driver.findElementByClassName("decorativeSubmit").click();
		return new HomePage();
	}

}
