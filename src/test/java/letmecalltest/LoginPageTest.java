package letmecalltest;

import org.testng.Reporter;
import org.testng.annotations.AfterTest;
import org.testng.annotations.Test;

import test_Base.TestBase;
import test_pages.LoginPage;

public class LoginPageTest extends TestBase {

	@Test
	public void loginTest() throws Exception {
		try {
			initialization();
			launch_browser(prop.getProperty("loginUrl"));
			LoginPage login = new LoginPage(driver);
			login.loginClick();
			Reporter.log("login link click", true);
			login.Username();
			Reporter.log("Enter User name", true);
			Thread.sleep(3000);
			login.PWD();
			Reporter.log("Enter password", true);
			login.Login();
			Reporter.log("login click", true);
			//login.Teardown();
		} catch (Exception e1) {
			System.out.println("login error");
			e1.printStackTrace();
		}
	}


}
