package test_pages;

import java.util.Properties;

import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import test_Base.TestBase;

public class ProfilePage extends TestBase {

	public ProfilePage(WebDriver driver) {
		this.driver = driver;
		PageFactory.initElements(driver, this);
	}

	@FindBy(xpath = "//*[contains(@src,'/resources/v2/images/edit_popup.png')][1]")
	WebElement accountInf;

	@FindBy(xpath = ".//*[@id='horizontalTab']/div/div[1]/div/div[2]/h5/a/img")
	WebElement personalInf;

	@FindBy(xpath = "//*[contains(@name,'oldPassword')]")
	WebElement oldPwd;

	@FindBy(xpath = "//*[contains(@name,'newPassword')]")
	WebElement newPwd;

	@FindBy(xpath = "//*[contains(@name,'reTypePassword')]")
	WebElement reNewPwd;

	@FindBy(xpath = "//*[contains(@onclick,'changeCustPassword(this);')]")
	WebElement saveBtn;

	@FindBy(xpath = "//input[contains(@name,'firstName')][1]")
	WebElement editFname;

	@FindBy(xpath = "//input[contains(@name,'lastName')][1]")
	WebElement editLname;

	@FindBy(xpath = "//input[contains(@name,'dOB')]")
	WebElement editDOB;

	@FindBy(xpath = "//input[contains(@name,'phoneNumber')][1]")
	WebElement editPne;

	@FindBy(xpath = ".//*[@id='receiveSms']")
	WebElement smsCheck;

	@FindBy(xpath = "//*[contains(@id,'updateCustomerDetails')]")
	WebElement personalInfrmationSaveBtn;

	@FindBy(xpath = ".//*[@id='pwdChangeFM']/div[2]/button[1]")
	WebElement acntPwdCancelBtn;

	public void accountInformation() throws Exception {
		Thread.sleep(1000);
		accountInf.click();
		Thread.sleep(1000);
		oldPwd.sendKeys(prop.getProperty("oldpwd"));
		newPwd.sendKeys(prop.getProperty("newpwd"));
		reNewPwd.sendKeys(prop.getProperty("newpwd"));
		// saveBtn.click();
		acntPwdCancelBtn.click();
	}

	public void personalInformation() throws Exception {
		Thread.sleep(2000);
		personalInf.click();

		editFname.sendKeys(prop.getProperty("efname"));
		editLname.clear();
		editLname.sendKeys(prop.getProperty("elname"));
		editDOB.sendKeys(prop.getProperty("dob"), Keys.ENTER);
		editPne.clear();
		editPne.sendKeys(prop.getProperty("editpne"));
		smsCheck.click();
		personalInfrmationSaveBtn.click();
	}

}
