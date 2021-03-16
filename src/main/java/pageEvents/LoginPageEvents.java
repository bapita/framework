package pageEvents;

import org.testng.Assert;

import pageObjects.LoginPageElements;
import utils.ElementFetch;

public class LoginPageEvents {
	
	public void verifyingLoginPageOpened() {
		ElementFetch elementfetch = new ElementFetch();
		Assert.assertTrue(elementfetch.getWebElements("XPATH", LoginPageElements.loginText).size()>0, "Login page did not open");
	}
	
	public void enterEmailID() {
		ElementFetch elementfetch = new ElementFetch();
		elementfetch.getWebElement("ID", LoginPageElements.emailAddress).sendKeys("bapita@pitangent");
	}

}
