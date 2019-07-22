package letmecalltest;

import java.io.IOException;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.testng.Reporter;
import org.testng.annotations.Test;

import test_Base.TestBase;
import test_pages.LocationPage;
import test_pages.LoginPage;


public class LocationPageTest extends TestBase {
	

	@Test()
	public void loginPage() throws IOException {
		try {
LoginPage login= new LoginPage(driver);
			LocationPage locate = new LocationPage(driver);
			initialization();
			Thread.sleep(3000);
			launch_browser(prop.getProperty("loginUrl"));
			login.loginClick();
			Reporter.log("login link click", true);
			login.Username();
			Reporter.log("Enter User name", true);
			Thread.sleep(3000);
			login.PWD();
			Reporter.log("Enter password", true);
			login.Login();
			Reporter.log("login click", true);
			Thread.sleep(2000);
			/*WebElement location=driver.findElement(By.xpath("//*[contains(@id,'searchbox')]"));
			location.sendKeys("LB Nagar, Sai Sadan");
			Thread.sleep(3000);
			location.sendKeys(Keys.ARROW_DOWN);
			Thread.sleep(3000);
			location.sendKeys(Keys.ENTER);
			Thread.sleep(3000);
			locate.search();*/
	locate.locationLink();
	locate.clickprofilePage();
			driver.close();
		} catch (Exception e) {
			e.printStackTrace();
			System.out.println("profilepageError");
		}

	}
}
