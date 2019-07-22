package letmecalltest;

import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import test_Base.TestBase;
import test_pages.LoginPage;
import test_pages.OrderPage;

public class MyOrderPageTest extends TestBase {
	@BeforeTest
	public void setup() throws Exception {
		initialization();
		launch_browser(prop.getProperty("loginUrl"));

	}
	@Test(priority=1)
	public void login() {
		LoginPage login = new LoginPage(driver);
		try {
			//login.loginCredintials();
		} catch (Exception e) {
			System.out.println("login error");
			e.printStackTrace();
		}
		//Location_page locate = new Location_page(driver);
		try {
		//	locate.clickordersPage();
		} catch (Exception e) {
			System.out.println("profile error");
			e.printStackTrace();
		}
	}
	@Test(priority=2)
	public void deliverOrderItemTest() throws Exception {
		OrderPage order=new OrderPage(driver);
		order.deliverItems();
	//	order.allOrderItems();
		//order.cancelItems();
		//order.allOrderItems();
	}
	@AfterTest
	public void teardown() {
		driver.close();
	}

}
