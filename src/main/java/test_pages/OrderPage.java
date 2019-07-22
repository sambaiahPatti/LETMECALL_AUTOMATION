package test_pages;

import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import test_Base.TestBase;
import test_util.TestUtil;

public class OrderPage extends TestBase {
	public OrderPage(WebDriver driver) {
		this.driver = driver;
		PageFactory.initElements(driver, this);
	}

	@FindBy(xpath = ".//*[@id='horizontalTab']/div/div[2]/div/table/tbody/tr/td/div/div[1]/div[1]/div/label[2]/input")
	WebElement deliveredRadioBtn;

	@FindBy(xpath = ".//*[@id='horizontalTab']/div/div[2]/div/table/tbody/tr/td/div/div[1]/div[1]/div/label[3]/input")
	WebElement cancelOrderRadioBtn;

	@FindBy(xpath = ".//*[@id='horizontalTab']/div/div[2]/div/table/tbody/tr/td/div/div[1]/div[1]/div/label[4]/input")
	WebElement allRadioBtn;

	@FindBy(xpath = ".//*[@id='horizontalTab']/div/div[2]/div/table/tbody/tr/td/div/div[1]/div[1]/div/label[1]/input")
	WebElement nonOrderRadioBtn;

	@FindBy(xpath = "//*[@id='fromDate']")
	WebElement itemFromDate;

	@FindBy(xpath = ".//*[@id='toDate']")
	WebElement itemToDate;

	@FindBy(xpath = ".//*[@id='horizontalTab']/div/div[2]/div/table/tbody/tr/td/div/div[4]/button")
	WebElement SearchBtn;

	@FindBy(xpath = ".//*[@id='15532btn']")
	WebElement deliverOrderMoreBtn;

	@FindBy(xpath = ".//*[@id='15553btn']")
	WebElement nonDeliverOrderMoreBtn;

	@FindBy(xpath = ".//*[@id='15479btn']")
	WebElement cancelOrderMoreBtn;

	@FindBy(xpath = ".//*[@id='15555btn']")
	WebElement allorderMoreBtn;
	
	@FindBy(xpath="html/body/div[8]/div[1]/table/tbody/tr[1]/td[1]")
	WebElement particulardate;

	public void deliverItems() throws Exception {
		Thread.sleep(1000);
		deliveredRadioBtn.click();
	    Thread.sleep(2000);
		deliverOrderMoreBtn.click();
		Thread.sleep(3000);
		deliverOrderMoreBtn.click();
	}

	public void cancelItems() throws Exception {
		cancelOrderRadioBtn.click();
		Thread.sleep(1000);
		itemFromDate.click();
		Thread.sleep(1000);
		itemToDate.sendKeys(prop.getProperty("Tdate"));
		Thread.sleep(1000);
		SearchBtn.click();
		cancelOrderMoreBtn.click();
		Thread.sleep(3000);
		cancelOrderMoreBtn.click();

	}

	public void allOrderItems() throws Exception {
		allRadioBtn.click();
		Thread.sleep(1000);
		itemFromDate.sendKeys(prop.getProperty("Fdate"), Keys.ENTER);
		Thread.sleep(1000);
		itemToDate.sendKeys(prop.getProperty("Tdate"), Keys.ENTER);
		Thread.sleep(1000);
		SearchBtn.click();
		allorderMoreBtn.click();
		Thread.sleep(1000);
		allorderMoreBtn.click();
	}

	public void nondeliverOrderItems() throws Exception {
		nonOrderRadioBtn.click();
		Thread.sleep(1000);
		itemFromDate.sendKeys(prop.getProperty("Fdate"), Keys.ENTER);
		Thread.sleep(1000);
		itemToDate.sendKeys(prop.getProperty("Tdate"), Keys.ENTER);
		Thread.sleep(1000);
		SearchBtn.click();
		nonDeliverOrderMoreBtn.click();
		Thread.sleep(1000);
		nonDeliverOrderMoreBtn.click();

	}
}