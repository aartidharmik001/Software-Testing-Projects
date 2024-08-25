package qa.tests;

import org.testng.annotations.Test;
import Utils.ElementFetch;
import basetest.BaseTest;
import pageEvents.HomePageEvents;
import pageEvents.LoginPageEvents;

public class Testcases1 extends BaseTest{
	
	ElementFetch ele=new ElementFetch();
	HomePageEvents homepage=new HomePageEvents();
	LoginPageEvents loginPage=new LoginPageEvents();
	
  @Test
  public void sampleMethodForEnteringCredentials() {
	  logger.info("SignIn into LoginPage");
	  homepage.signInButton();
	  
	  logger.info("Verifying if Login text is present or not");
	  loginPage.verifyIfLoginPageIsLoaded();
	  
	  logger.info("Enter the Credentials");
	  loginPage.enterCredentials();
  }
  
}
