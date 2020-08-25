package vodafone.automationTask;

import static org.testng.Assert.assertEquals;

import org.testng.annotations.Test;

public class UserRegistrationTest extends TestBase {

	RegistrationPage registration;


	@Test public void userRegisterSuccessfully () { 
		registration = new RegistrationPage(driver); 
		registration.userRegisterSuccessfully("a11@a.com","gj.FAz.TEFBx6#D");
		assertEquals(registration.successfullMsg.getText(),"Click the link in the email we have sent to your inbox.");

	}

	@Test
	public void userFailToRegister() {
		registration = new RegistrationPage(driver);
		registration.userRegisterSuccessfully("a1a.com", "gj.FAz.TEFBx6#D");

		assertEquals(registration.emailInvalidMsg.getText(), "Please enter a valid email address");

	}

}
