package letmecalltest;

import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import test_Base.TestBase;
import test_pages.LoginPage;
import test_pages.ProfilePage;

public class ProfilePageTest extends TestBase {
	ProfilePage profile;

	@BeforeTest
	public void setup() throws Exception {
		initialization();
		launch_browser(prop.getProperty("loginUrl"));

	}

	@Test(priority = 1)
	public void myprofileTest() {
		LoginPage login = new LoginPage(driver);
		try {
			//login.loginCredintials();
		} catch (Exception e) {
			System.out.println("login error");
			e.printStackTrace();
		}
		//Location_page locate = new Location_page(driver);
		try {
		//	locate.clickprofilePage();
		} catch (Exception e) {
			System.out.println("profile error");
			e.printStackTrace();
		}

	}

	@Test(priority = 2)
	public void accntInformationTest() {
		profile = new ProfilePage(driver);
		try {
			profile.accountInformation();
			profile.personalInformation();
		} catch (Exception e) {
			e.printStackTrace();
		}

	}

	@AfterTest
	public void teardown() {
		driver.close();
	}
}
