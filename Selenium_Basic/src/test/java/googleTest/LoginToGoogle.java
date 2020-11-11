package googleTest;

import org.testng.annotations.Test;

import pageFactory.gmailHomePage;

public class LoginToGoogle extends setUp{
	static gmailHomePage objGmailHome;
	@Test
	public void loginwithValidCreds() {
		driver.navigate().to("https://www.google.com/intl/en-GB/gmail/about/#");	
		objGmailHome = new gmailHomePage();
		objGmailHome.clickLoginButton();
		
	}
}
