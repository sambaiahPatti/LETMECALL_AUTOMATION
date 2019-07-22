package test_pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class banyanTree {

	public WebDriver driver;

	public banyanTree(WebDriver driver) {
		this.driver = driver;
		PageFactory.initElements(driver, this);
	}

	@FindBy(xpath = ".//*[@id='myNavbar']/ul/li[1]/a")
	WebElement rotis;
	@FindBy(xpath = ".//*[@id='myNavbar']/ul/li[2]/a")
	WebElement NONVEGBIRYANI;
	@FindBy(xpath = ".//*[@id='myNavbar']/ul/li[3]/a")
	WebElement NONVEGCURRY;
	@FindBy(xpath = ".//*[@id='myNavbar']/ul/li[4]/a")
	WebElement RICE;
	@FindBy(xpath = ".//*[@id='myNavbar']/ul/li[5]/a")
	WebElement SOUP;
	@FindBy(xpath = ".//*[@id='myNavbar']/ul/li[6]/a")
	WebElement MOREDROPDOWN;
	@FindBy(xpath=".//*[@id='skuitem-main']/div/div[1]/div[2]/div/div/a")
	WebElement JAWARROTI;
	@FindBy(xpath=".//*[@id='skuitem-main']/div/div[2]/div[2]/div/div/a")
	WebElement TANDOORIROTI;
	@FindBy(xpath=".//*[@id='skuitem-main']/div/div[3]/div[2]/div/div/a")
	WebElement RUMALIROTI;
	@FindBy(xpath=".//*[@id='skuitem-main']/div/div[4]/div[2]/div/div/a")
	WebElement BUTTERROTI;
	@FindBy(xpath=".//*[@id='skuitem-main']/div/div[5]/div[2]/div/div/a")
	WebElement BUTTERNAAN;
	@FindBy(xpath=".//*[@id='skuitem-main']/div/div[6]/div[2]/div/div/a")
	WebElement PLAINNAAN;
	@FindBy(xpath=".//*[@id='skuitem-main']/div/div[7]/div[2]/div/div/a")
	WebElement pulka;
	@FindBy(xpath=".//*[@id='skuitem-main']/div/div[8]/div[2]/div/div/a")
	WebElement CHAPATI;
	@FindBy(xpath=".//*[@id='skuitem-main']/div/div[1]/div[2]/div/div/a")
	WebElement MUTTONBIRYANI;
	@FindBy(xpath=".//*[@id='skuitem-main']/div/div[2]/div[2]/div/div/a")
	WebElement SPLMUTTONBIRYANI;
	@FindBy(xpath=".//*[@id='skuitem-main']/div/div[3]/div[2]/div/div/a")
	WebElement CHICKENBIRYANI;
	
	
}
