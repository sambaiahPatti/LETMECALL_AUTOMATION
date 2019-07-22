package test_pages;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import test_Base.TestBase;
import test_util.TestUtil;

public class LocationPage extends TestBase{
	public WebDriver driver;
		public LocationPage(WebDriver driver) {
			this.driver=driver;
			PageFactory.initElements(driver, this);
		}
		@FindBy(xpath="//*[@id='input-restaurantsearch']")
		public static WebElement searchre;
		
		@FindBy(xpath ="//*[contains(@class,'mega dropdown')]")
		public static WebElement account;

		@FindBy(xpath ="//*[contains(@id,'searchbox')]")
		public WebElement searchbox;

		@FindBy(xpath ="//*[@id='menuProfile']/div/div/ul/li[1]/a")
		public static WebElement profile;

		@FindBy(xpath ="//*[@src='/resources/v2/images/profile_dropdown_icon3.png']")
		public static WebElement myOrders;

		@FindBy(xpath ="//*[@src='/resources/v2/images/Wallet_icon.png']")
		public static WebElement myWallet;

		@FindBy(xpath ="//*[@src='/resources/v2/images/profile_dropdown_icon4.png']")
		public static WebElement logout;

		public void locationLink() throws Exception {
			searchbox.sendKeys("LB Nagar");
			Thread.sleep(2000);
			searchbox.sendKeys(Keys.ARROW_DOWN);
			searchbox.sendKeys(Keys.ENTER);
		}

		public void clickprofilePage() throws Exception {

			TestUtil.mouseOver();
			Thread.sleep(2000);
			profile.click();
		}

		public void clickordersPage() throws Exception {

			TestUtil.mouseOver();
			Thread.sleep(2000);
			myOrders.click();
		}

		public void walletPage() {
			TestUtil.mouseOver();
			myWallet.click();
		}

		public void logout() {
			TestUtil.mouseOver();
			logout.click();

		}

		public void teardown() {
			driver.close();
		}
		public void search() {
			searchre.sendKeys("abhi");
		}
	}

