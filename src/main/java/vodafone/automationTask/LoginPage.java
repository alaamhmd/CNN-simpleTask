package vodafone.automationTask;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class LoginPage extends PageBase {


	public LoginPage(WebDriver driver) {
		super(driver);

	}

	@FindBy (name = "loginEmail")
	WebElement mailTxtBox; 

	@FindBy (name = "loginPassword")
	WebElement passwordTxtBox;

	@FindBy (id  = "login-form-button")
	WebElement loginBtn;


	public void userLoginSuccessfully(String mail,String password) {
		setTextToWebElement(mailTxtBox, mail);
		setTextToWebElement(passwordTxtBox, password);
		clickBtn(loginBtn);

	}


}


