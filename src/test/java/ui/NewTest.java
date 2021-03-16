package ui;

import org.testng.annotations.Test;

import pageEvents.HomePageEvents;
import pageEvents.LoginPageEvents;

public class NewTest extends BaseTest {
  @Test
  public void emailEnteringTest() {
	  HomePageEvents homepageevents = new HomePageEvents();
	  homepageevents.clickOnSigninButton();
	  
	  LoginPageEvents loginpageevents = new LoginPageEvents();
	  loginpageevents.verifyingLoginPageOpened();
	  loginpageevents.enterEmailID();
	  
  }
}
