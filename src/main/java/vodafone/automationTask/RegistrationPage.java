package vodafone.automationTask;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class RegistrationPage extends PageBase{

	public RegistrationPage(WebDriver driver) {
		super(driver);
	}


	@FindBy(name =  "registrationEmail")
	 WebElement emailTxtBox;
	
	@FindBy (name ="registrationPassword")
	WebElement passwordTxtBox;
	
	@FindBy (id = "registration-button")
	WebElement registerBtn;
	
	@FindBy (id = "unverified-modal-body")
	public WebElement successfullMsg;
	
	@FindBy (css = "div.Box-sc-1fet97o-0.indexes__HelperText-sc-30af8a-11.cNzHcA")
	public WebElement emailInvalidMsg;
	
	@FindBy (id = "account-icon-button")
	WebElement loginBtn;
	
	
	
	public void userRegisterSuccessfully(String email ,String password) {
		
		setTextToWebElement(emailTxtBox, email);
		setTextToWebElement(passwordTxtBox, password);
		clickBtn(registerBtn);
		
		
	}
	
	public void openLoginPage() {
		clickBtn(loginBtn);
		
	}
	
	

}
