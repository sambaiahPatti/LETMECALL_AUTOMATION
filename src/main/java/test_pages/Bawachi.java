package test_pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import test_Base.TestBase;

public class Bawachi extends TestBase {
	
public  Bawachi(WebDriver driver) {
this.driver=driver;
PageFactory.initElements(driver, this);
}
@FindBy(xpath=".//*[@id='myNavbar']/ul/li[1]/a")
WebElement BEVARAGE;
@FindBy(xpath=".//*[@id='myNavbar']/ul/li[2]/a")
WebElement ICECREAM;
@FindBy(xpath=".//*[@id='myNavbar']/ul/li[3]/a")
WebElement MILKSHAKE;
@FindBy(xpath=".//*[@id='myNavbar']/ul/li[4]/a")
WebElement SALAD;
@FindBy(xpath=".//*[@id='skuitem-main']/div/div[1]/div[2]/div/div/a")
WebElement MIXSODA;
@FindBy(xpath=".//*[@id='skuitem-main']/div/div[2]/div[2]/div/div/a")
WebElement SOFTDRINK;
@FindBy(xpath=".//*[@id='skuitem-main']/div/div[3]/div[2]/div/div/a")
WebElement LASSI;
@FindBy(xpath=".//*[@id='skuitem-main']/div/div[1]/div[2]/div/div/a")
WebElement VANILA;
@FindBy(xpath=".//*[@id='skuitem-main']/div/div[2]/div[2]/div/div/a")
WebElement CHOCOLATE;
@FindBy(xpath=".//*[@id='skuitem-main']/div/div[3]/div[2]/div/div/a")
WebElement STRAWBERRY ;
@FindBy(xpath=".//*[@id='skuitem-main']/div/div[1]/div[2]/div/div/a")
WebElement PISTA ;
@FindBy(xpath=".//*[@id='skuitem-main']/div/div[1]/div[2]/div/div/a")
WebElement GREENSALADS ;
@FindBy(xpath=".//*[@id='skuitem-main']/div/div[2]/div[2]/div/div/a")
WebElement FRUITSALAD;
@FindBy(xpath=".//*[@id='skuitem-main']/div/div[3]/div[2]/div/div/a")
WebElement RUSSIANSALADS;
public void bevarageHead() {
	BEVARAGE.click();
}
public void iceCreamHead() {
	ICECREAM.click();
}
public void milkShakeHead() {
	MILKSHAKE.click();
}
public void saladHead() {
	SALAD.click();
}
public void mixsoda() {
	MIXSODA.click();
}
public void softdrink() {
	SOFTDRINK.click();
}
public void lassi() {
	LASSI.click();
}
public void vanila() {
	VANILA.click();
}
public void chocolate() {
	CHOCOLATE.click();
}
public void strawberry() {
	STRAWBERRY.click();
}
public void pista() {
	PISTA.click();
}
public void greensalads() {
	GREENSALADS.click();
}
public void fruitsalad() {
	FRUITSALAD.click();
}
public void russiansalad() {
	RUSSIANSALADS.click();
}
}
