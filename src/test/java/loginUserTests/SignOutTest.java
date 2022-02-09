package loginUserTests;

import org.testng.annotations.Test;

import pages.SignOutPage;

public class SignOutTest extends TestBase {

	SignOutPage signOutPageObject;
	
	@Test
	public void userCanSignOut() throws InterruptedException {
		signOutPageObject = new SignOutPage(driver);
		signOutPageObject.userCanSignOut();
	}
}
