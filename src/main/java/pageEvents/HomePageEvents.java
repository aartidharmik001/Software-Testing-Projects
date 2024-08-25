package pageEvents;

import Utils.ElementFetch;
import pageObject.HomePageElements;

public class HomePageEvents
{
	ElementFetch ele=new ElementFetch();
	public void signInButton()
	{
		ele.getWebElement("XPATH",HomePageElements.signInButtonText).click();
	}
	
}
