package test_pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import test_Base.TestBase;

public class LoginPage extends TestBase {

	public LoginPage(WebDriver driver) {
		this.driver = driver;
		PageFactory.initElements(driver, this);
	}

	@FindBy(xpath = "//*[contains(text(),'Log In')]")
	public static WebElement login_link;

	@FindBy(xpath = "//*[contains(@class,'emailtxt')]")
	public static WebElement log_username;

	@FindBy(xpath = "//*[contains(@id,'j_password')][1]")
	public static WebElement log_password;

	@FindBy(xpath = "//*[contains(@class,'btn btn-md btn-success')]")
	public static WebElement log_btn;

	@FindBy(xpath = "(//*[contains(@class,'btn btn-md btn-success')])[2]")
	WebElement register_log_btn;

	@FindBy(xpath = "//u[text()='Read more>>']")
	WebElement ReadMore_link;

	@FindBy(xpath = "//a[text()='Work with us']")
	WebElement WorkWithUs_link;

	@FindBy(xpath = "//a[text()='Deliver with us']")
	WebElement Deliver_With_Us_link;

	@FindBy(xpath = "//a[text()='FAQ']")
	WebElement FAQ_link;

	@FindBy(xpath = "//a[text()='Blog']")
	WebElement Blog_link;

	@FindBy(xpath = "//a[text()='T&C']")
	WebElement TermsAndConditions;

	public void loginClick() throws Exception {
		login_link.click();
	}

	public void Username() throws Exception {
		log_username.sendKeys(prop.getProperty("log_Email"));
	}

	public void PWD() {
		log_password.sendKeys(prop.getProperty("log_Pwd"));
	}

	public void Login() {
		log_btn.click();
	}

	public void Register_Login() {
		register_log_btn.click();
	}

	public void Teardown() {
		driver.close();
	}
}
