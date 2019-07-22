package test_pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import test_Base.TestBase;
import test_util.TestUtil;

public class Abhi extends TestBase {
	public Abhi(WebDriver driver) {
		this.driver = driver;
		PageFactory.initElements(driver, this);
	}

	@FindBy(xpath = "//*[contains(@id,'datedropdown-sku')]")
	WebElement PREORDERSKU;
	@FindBy(xpath = "html/body/div[1]/div/div[1]/div[1]/div[3]/div/input[2]")
	WebElement SEARCHITEM;

	@FindBy(xpath = "html/body/div[1]/div/div[1]/div[2]/nav/div/div[2]/div/ul/li[1]/a")
public static WebElement ROTIS;
	@FindBy(xpath = "html/body/div[1]/div/div[1]/div[2]/nav/div/div[2]/div/ul/li[2]/a")
	WebElement NONVEGBIRYANI;
	@FindBy(xpath = "html/body/div[1]/div/div[1]/div[2]/nav/div/div[2]/div/ul/li[3]/a")
	WebElement NONVEGCURRY;
	@FindBy(xpath = "html/body/div[1]/div/div[1]/div[2]/nav/div/div[2]/div/ul/li[4]/a")
	WebElement SOUP;
	@FindBy(xpath = "html/body/div[1]/div/div[1]/div[2]/nav/div/div[2]/div/ul/li[5]/a")
	WebElement VEGCURRY;

	@FindBy(xpath = "html/body/div[1]/div/main/section[1]/div/div/div[1]/div[2]/div/div/a")
	public static WebElement JAWARROTI;
	@FindBy(xpath = ".//*[@id='skuitem-main']/div/div[2]/div[2]/div/div/a")
	WebElement BUTTERROTI;
	@FindBy(xpath = ".//*[@id='skuitem-main']/div/div[3]/div[2]/div/div/a")
	WebElement PLAINROTI;

	@FindBy(xpath = ".//*[@id='skuitem-main']/div/div[1]/div[2]/div/div/a")
	WebElement CHICKENBIRYANI;
	@FindBy(xpath = ".//*[@id='skuitem-main']/div/div[2]/div[2]/div/div/a")
	WebElement EGG_BIRYANI;
	@FindBy(xpath = ".//*[@id='skuitem-main']/div/div[3]/div[2]/div/div/a")
	WebElement FISH_BIRYANI;
	@FindBy(xpath = ".//*[@id='skuitem-main']/div/div[4]/div[2]/div/div/a")
	WebElement CHICKEN_CLEAR_SOUP;
	@FindBy(xpath = ".//*[@id='skuitem-main']/div/div[5]/div[2]/div/div/a")
	WebElement MUTTON_BIRYANI;
	@FindBy(xpath = ".//*[@id='skuitem-main']/div/div[1]/div[2]/div/div/a")
	WebElement MUTTONKHEEMAFRY;
	@FindBy(xpath = ".//*[@id='skuitem-main']/div/div[2]/div[2]/div/div/a")
	WebElement KADAICHICKEN;
	@FindBy(xpath = ".//*[@id='skuitem-main']/div/div[3]/div[2]/div/div/a")
	WebElement METHICHICKEN;
	@FindBy(xpath = ".//*[@id='skuitem-main']/div/div[4]/div[2]/div/div/a")
	WebElement MUTTONCURRY;

	@FindBy(xpath = ".//*[@id='skuitem-main']/div/div[1]/div[2]/div/div/a")
	WebElement CORNSOUP;
	@FindBy(xpath = ".//*[@id='skuitem-main']/div/div[2]/div[2]/div/div/a")
	WebElement CHICKENHOTNSOURSOUP;
	@FindBy(xpath = ".//*[@id='skuitem-main']/div/div[3]/div[2]/div/div/a")
	WebElement CHICKENCLEARSOUP;
	@FindBy(xpath = ".//*[@id='skuitem-main']/div/div[4]/div[2]/div/div/a")
	WebElement CHICKENCORNSOUP;
	@FindBy(xpath = ".//*[@id='skuitem-main']/div/div[1]/div[2]/div/div/a")
	WebElement PALAKPANEER;
	@FindBy(xpath = ".//*[@id='skuitem-main']/div/div[2]/div[2]/div/div/a")
	WebElement PANEERTIKKAMASALA;
	@FindBy(xpath = ".//*[@id='skuitem-main']/div/div[3]/div[2]/div/div/a")
	WebElement KADAIPANEER;

	@FindBy(xpath = ".//*[@id='skuitem-main']/div/div[1]/div[2]/div/div/a")
	WebElement ROTIADDCART;
	

	@FindBy(xpath = "//*[contains(@id,'specialInstructions')]")
	WebElement specialInstruction;
	@FindBy(xpath = "//*[contains(@onclick,'addOrUpdateCartItem()')]")
	WebElement windowAddtoCart;

	@FindBy(xpath = "html/body/div[1]/div/main/section[2]/div/div/div[2]/div[2]/div/div/a")
	WebElement eggBiryaniNonVeg;
	@FindBy(xpath = ".//*[@id='skuitem-main']/div/div[2]/div[2]/div/div/a")
	WebElement eggBiryaniAddToCart;
    @FindBy(xpath=".//*[@id='mCSB_1_container']/div[2]/div[1]/button")
    WebElement addToCart;

  @FindBy(xpath="//*[@class='addItem_btn']")
  WebElement ADDTOORDER;
  @FindBy(xpath=".//*[@id='qtyminusId']")
  WebElement qtyDecBtn;
  @FindBy(xpath=".//*[@id='qtyplusId']")
  WebElement qtyincBtn;
	@FindBy(xpath=".//*[@id='specialInstructions']")
	WebElement specialInstructions;
	@FindBy(xpath = "//img[contains(@id,'cart-btn')]")
	WebElement cartLogoLink;
	@FindBy(xpath=".//*[@id='cart-checkoutbtn']")
	WebElement checkoutBtn;
	

	public void searchBox() {
		SEARCHITEM.sendKeys("Plain Roti");
	}

	public void rotis() {
		ROTIS.click();
	}

	public void jawarroticlick() {
		JAWARROTI.click();
	}

	
public void nonVegBiryaniClick() {
	NONVEGBIRYANI.click();
	}
public void nonvegcurryClick() {
	NONVEGCURRY.click();
}
public void soupClick() {
	SOUP.click();
}
public void vegcurryclick() {
	VEGCURRY.click();
}
public void jawarrotiClick() {
	JAWARROTI.click();
}
public void butterrotiClick() {
	BUTTERROTI.click();
}
public void plainrotiClick() {
	PLAINROTI.click();
}
public void chickenBiryaniClick() {
	CHICKENBIRYANI.click();
}
public void eggBiryaniClick() {
	EGG_BIRYANI.click();
}
public void fishBiryaniClick()
{
	FISH_BIRYANI.click();
}
public void chickenClearSoupClick() {
	CHICKEN_CLEAR_SOUP.click();
}
public void muttonBiryaniClick() {
	MUTTON_BIRYANI.click();
}
public void muttonKheemaFry () {
	MUTTONKHEEMAFRY.click();
}
public void kadaiChickenClick() {
	KADAICHICKEN.click();
}
public void methiChickenClick()
{
	METHICHICKEN.click();
}
public void muttoncurryClick() {
	MUTTONCURRY.click();
}
public void cornsoupClick() {
	CORNSOUP.click();
}
public void chickenhotnsoursoup() {
	CHICKENHOTNSOURSOUP.click();
}
public void chickenclearsoup() {
	CHICKENCLEARSOUP.click();
}
public void ChickenCornSoupClick() {
	CHICKENCORNSOUP.click();
}
public void  palakPaneerClick() {
	PALAKPANEER.click();
}
public void paneerTikkaMasalaClick() {
	PANEERTIKKAMASALA.click();
}
public void kadaiPaneerClick() {
	KADAIPANEER.click();
}
public void qtyincBtnClick() {
	qtyincBtn.click();
}
public void qtyDecBtnClick() {
	qtyDecBtn.click();
}
public void specialInstructionTextField(String instruction) {
	specialInstructions.clear();
	specialInstructions.sendKeys(instruction);
}
public void addToOrderclick() {
//	TestUtil.windowHandle();
	ADDTOORDER.click();
}
}
