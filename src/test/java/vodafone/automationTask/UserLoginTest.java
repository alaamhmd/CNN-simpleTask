package vodafone.automationTask;

import org.testng.annotations.Test;

public class UserLoginTest extends TestBase {
	
	RegistrationPage registration;
	LoginPage login;
	@Test
	public void userLoginSuccessfully() {
		registration = new RegistrationPage(driver);
		registration.openLoginPage();
		login = new LoginPage(driver);
		login.userLoginSuccessfully("alaa.m.ebr@gmail.com", "exgX9UB-p-$A#y@");
	}

}
