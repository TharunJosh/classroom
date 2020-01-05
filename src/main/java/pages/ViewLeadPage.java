package pages;

import base.SuperSpecificMethods;

public class ViewLeadPage extends SuperSpecificMethods {


	public ViewLeadPage verifyName() {

		String fname = driver.findElementById("viewLead_firstName_sp").getText();
		
		if(fname.contains("Gopi")) {
			System.out.println("Verified FirstName Successfully");
		}
		else {
			System.out.println("Verification Unsuccessfull ");
		}
		return this;
	}
	


}
