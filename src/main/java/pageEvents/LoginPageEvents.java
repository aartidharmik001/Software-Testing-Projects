package pageEvents;
import org.testng.Assert;

import Utils.ElementFetch;
import pageObject.LoginPageElements;

public class LoginPageEvents {
	
	ElementFetch ele=new ElementFetch();
	public void verifyIfLoginPageIsLoaded()
	{
		Assert.assertTrue(ele.getWebElements("XPATH", LoginPageElements.LoginText).size()>0,"Element not found");
		
	}
	public void enterCredentials()
	{
		ele.getWebElement("XPATH", LoginPageElements.emailAddress).sendKeys("aarti@123gmail.com");
		ele.getWebElement("XPATH", LoginPageElements.passwordField).sendKeys("123456");
		
		
	}
}
