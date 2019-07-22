package letmecalltest;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.testng.Assert;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import test_Base.TestBase;
import test_pages.RegisterPage;

public class RegisterPageTest extends TestBase {
	// public WebDriver driver;
	RegisterPage register;
	@Test
	public void registerAccount() throws Exception {
		try {
			initialization();
			launch_browser(prop.getProperty("loginUrl"));
			register = new RegisterPage(driver);
			register.SIGNUPCLICK();
			register.FIRSTNAME();
			register.EMAIl();
			register.PHONE();
			register.CREATEPASSWORD();
			register.ZIPCODE();
			register.REGISTERBTN();
			register.tooltip();
			String t = register.title();
			Assert.assertEquals(t, "LetMeCall");
			Thread.sleep(5000);
			/*WebElement orderapp = driver
					.findElement(By.xpath("(//h2[text()='Ordering App'])[2]"));
			Actions act=new Actions(driver);
			act.moveToElement(orderapp);
			orderapp.click();*/
			driver.close();
		} catch (Exception e1) {
			System.out.println("credintial error");
			e1.printStackTrace();
			throw (e1);
		}
	}

}