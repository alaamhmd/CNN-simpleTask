package vodafone.automationTask;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.Optional;
import org.testng.annotations.Parameters;


public class TestBase {
	public static WebDriver driver;
	public static String downloadPath = System.getProperty("user.dir")+"\\"+"downloads";




	@BeforeSuite
	@Parameters({"browser"})
	public void startDriver(@Optional ("chrome") String browserName) {

		if (browserName.equalsIgnoreCase("chrome")) {
			String chromePath = System.getProperty("user.dir")+"\\drivers\\chromedriver.exe";
			System.setProperty("webdriver.chrome.driver", chromePath);
			driver = new ChromeDriver();
		}
		else if (browserName.equalsIgnoreCase("firefox")) {
			String firefoxPath = System.getProperty("user.dir")+"\\drivers\\geckodriver.exe";
			System.setProperty("webdriver.gecko.driver", firefoxPath);
			driver = new FirefoxDriver();
		}
	
		driver.manage().window().maximize();
		driver.navigate().to("https://edition.cnn.com/account/register");
		driver.manage().timeouts().implicitlyWait(100,TimeUnit.SECONDS);

	}

	@AfterSuite
	public void closeDriver() {
		driver.quit();
	}


	}




