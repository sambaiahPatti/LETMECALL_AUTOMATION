package test_pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import test_Base.TestBase;

public class RestarentPage extends TestBase {

	public RestarentPage(WebDriver driver) {
		this.driver = driver;
		PageFactory.initElements(driver, this);
	}

	@FindBy(xpath = "html/body/div[1]/div/div[2]/div[3]/div[3]/div[1]/a/img")
	public static WebElement abhiRestaurant;

	@FindBy(xpath = "html/body/div[1]/div/div[2]/div[3]/div[4]/div[1]/a/img")
	public static WebElement banyanTree;

	@FindBy(xpath = "html/body/div[1]/div/div[2]/div[3]/div[5]/div[1]/a/img")
	public static WebElement gravityGrand;

	@FindBy(xpath = "html/body/div[1]/div/div[2]/div[3]/div[6]/div[1]/a/img")
	public static WebElement ks_Bakers;

	@FindBy(xpath = "html/body/div[1]/div/div[2]/div[3]/div[7]/div[1]/a/img")
	public static WebElement lucky;

	@FindBy(xpath = "html/body/div[1]/div/div[2]/div[3]/div[8]/div[1]/a/img")
	public static WebElement baharBiryaniCafe;

	@FindBy(xpath = "html/body/div[1]/div/div[2]/div[3]/div[9]/div[1]/a/img")
	public static WebElement abinandGrand;

	@FindBy(xpath = "html/body/div[1]/div/div[2]/div[3]/div[10]/div[1]/a/img")
	public static WebElement bawarchi;

	public void abhiRestrent() {
		abhiRestaurant.click();

	}

	public void banyanTree() {
		banyanTree.click();
	}

	public void gravityGrand() {
		gravityGrand.click();
	}

	public void ksBakers() {
		ks_Bakers.click();
	}

	public void lucky() {
		lucky.click();
	}

	public void baharbiryani() {
		baharBiryaniCafe.click();
	}

	public void abinand() {
		abinandGrand.click();
	}

	public void bawarchi() {
		bawarchi.click();
	}
}
