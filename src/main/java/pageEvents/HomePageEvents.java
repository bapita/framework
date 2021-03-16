package pageEvents;

import pageObjects.HomePageElements;
import utils.ElementFetch;

public class HomePageEvents {
	
	public void clickOnSigninButton() {
		ElementFetch elementfetch = new ElementFetch();
		elementfetch.getWebElement("XPATH", HomePageElements.signinButton).click();
	}

}
