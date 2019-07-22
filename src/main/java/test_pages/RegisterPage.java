package test_pages;

import java.io.IOException;
import java.util.Properties;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import jxl.Sheet;
import jxl.Workbook;
import jxl.read.biff.BiffException;
import test_Base.TestBase;

public class RegisterPage extends TestBase {

	public RegisterPage(WebDriver driver) {
		this.driver = driver;
		PageFactory.initElements(driver, this);
	}

	@FindBy(id = "signup-btn")
	public static WebElement signup;

	@FindBy(xpath = "//input[@class='firstnametxt']")
	public static WebElement fst_name;

	@FindBy(xpath = "//*[contains(@id,'emailAddress')]")
	public static WebElement email;

	@FindBy(xpath = "//*[@id='phoneNo']")
	public static WebElement pne;

	@FindBy(xpath = "//*[contains(@data-toggle,'password')][1]")
	public static WebElement register_pwd;

	@FindBy(xpath = "//input[contains(@id,'zipcode')]")
	public static WebElement zipcode;

	@FindBy(xpath = "//input[contains(@id,'bt_signup')]")
	public static WebElement reg_btn;

	@FindBy(xpath = "//*[contains(@src,'https://www.letmecall.com/resources/v2/images/new-logo.png')]")
	public static WebElement logo;

	public void regCredintials() throws BiffException, IOException {
		/*
		 * fst_name.sendKeys("samba"); email.sendKeys("samba@letmecall.com");
		 * pne.sendKeys("7661057418"); register_pwd.sendKeys("Samba@123");
		 * zipcode.sendKeys("516101"); File fo=new File(prop.getProperty("excelpath"));
		 * Workbook wb=Workbook.getWorkbook(fo); Sheet st=wb.getSheet(0); for(int
		 * i=1;i<st.getRows();i++) { fst_name.sendKeys(st.getCell(1,i).getContents());
		 * email.sendKeys(st.getCell(2,i).getContents());
		 * pne.sendKeys(st.getCell(3,i).getContents());
		 * register_pwd.sendKeys(st.getCell(4,i).getContents());
		 * zipcode.sendKeys(st.getCell(5,i).getContents()); reg_btn.click();
		 */

	}

	public void SIGNUPCLICK() {
		signup.click();
	}

	public void FIRSTNAME() {
		fst_name.sendKeys(prop.getProperty("first"));
	}

	public void EMAIl() {
		email.sendKeys(prop.getProperty("log_Email"));
	}

	public void PHONE() {
		pne.sendKeys(prop.getProperty("ph"));
	}

	public void CREATEPASSWORD() {
		register_pwd.sendKeys(prop.getProperty("reg_pwd"));
	}

	public void ZIPCODE() {
		zipcode.sendKeys(prop.getProperty("zip"));
	}

	public void REGISTERBTN() {
		reg_btn.click();
	}

	public boolean logo() {
		return logo.isDisplayed();
	}

	public String title() {
		return driver.getTitle();
	}

	public void tooltip() throws Exception {
		try {
			LoginPage login = new LoginPage(driver);
			Actions build = new Actions(driver);
			build.clickAndHold().moveToElement(email);
			build.moveToElement(email).build().perform();
			Thread.sleep(1000);
			WebElement element = driver.findElement(By.xpath("//*[@class='tooltip fade top in']"));
			String actualtooltip = element.getText();
			System.out.println(actualtooltip);
			String tooltipdata = "Your details are existing with us. Please login to search.";
			Thread.sleep(2000);
			if (actualtooltip.equals(tooltipdata)) {
				login.loginClick();
				Thread.sleep(2000);
				login.Username();
				Thread.sleep(2000);
				login.PWD();
				login.Register_Login();
			}
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
	}

}
