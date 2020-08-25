package vodafone.automationTask;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.PageFactory;

public class PageBase {
	protected WebDriver drvier;


	public  PageBase(WebDriver driver) {
		PageFactory.initElements(driver, this);
	}
	protected static void clickBtn(WebElement button) {
		button.click();

	}
	protected static void setTextToWebElement(WebElement textbox ,String value) {
		textbox.sendKeys(value);

	}

	protected static void clearWebElement(WebElement textbox) {
		textbox.clear();

	}


}
