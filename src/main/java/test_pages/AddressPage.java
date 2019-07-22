package test_pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import test_Base.TestBase;

public class AddressPage extends TestBase {
	public  AddressPage(WebDriver driver) {
	this.driver=driver;
		PageFactory.initElements(driver, this);
	}
@FindBy(xpath=".//*[@id='customerName']")
WebElement DELIVERYCUSTOMERNAME;
@FindBy(xpath=".//*[@id='customerLastName']")
WebElement DELIVERYCUSTOMERLASTNAME;
@FindBy(xpath=".//*[@id='Email']")
WebElement DELIVERYMAIL;
@FindBy(xpath=".//*[@id='phonenumber']")
WebElement DELIVERYPHONENUMBER;
@FindBy(xpath=".//*[@id='addressLine1']")
WebElement ADDRESSLINE1;
@FindBy(xpath=".//*[@id='entireaddress']")
WebElement APTMNTOPTIONAL;
@FindBy(xpath=".//*[@id='hdeliveryInstructions']")
WebElement DRIVERINSTRUCTIONS;
@FindBy(xpath=".//*[@id='addressNext']")
WebElement CONTINUETOORDERSUMMERY;

public void deliveryCustomerNameText() {
	DELIVERYCUSTOMERNAME.clear();
	DELIVERYCUSTOMERNAME.sendKeys(prop.getProperty("customerName"));
	DELIVERYCUSTOMERLASTNAME.clear();
	DELIVERYCUSTOMERLASTNAME.sendKeys(prop.getProperty("lastName"));
	DELIVERYMAIL.clear();
	DELIVERYMAIL.sendKeys(prop.getProperty("deliverymail"));
	DELIVERYPHONENUMBER.clear();
	DELIVERYPHONENUMBER.sendKeys(prop.getProperty("deliveryphone"));
	DRIVERINSTRUCTIONS.clear();
	DRIVERINSTRUCTIONS.sendKeys(prop.getProperty("driverInstructions"));	
}
public void continueToOrderSummery() {
	CONTINUETOORDERSUMMERY.click();
}
}
