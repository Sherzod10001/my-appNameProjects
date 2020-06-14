package library;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;

import utilities.Base;

public class HomePageObjs2 extends Base {
	
	
	WebDriver driver;
	By searchBox = By.xpath("//a[@class='_searchInput search-link']");
	By searchTerm = By.xpath("//input[@id='search-term']");
	By serchTrm2 = By.xpath("//input[@id='search-term']");
	By clickOnProduct = By.id("product-47390015");
	By selectSizeBy = By.xpath("//*[@class='size-name-container'] //*[@title=34]");
	By addToCard = By.xpath("//button[@aria-label='Add']");
	By completeOrder = By.xpath("//a[@class='button button-primaryB button-big buy-button process-order-btn _nav-to-cart-btn']");
	By completeThePurchase = By.xpath("//button[@class='button layout-shop-footer__body-button layout-shop-footer__body-button--expanded']/*[@class='layout-shop-footer-continue-button layout-shop-footer-continue-button-enter-done layout-shop-footer-continue-button-exit-done']");
	By enterlLogIn = By.name("email");
	By enterPass = By.name("password");
	
	
	public HomePageObjs2(WebDriver driver) {
		this.driver = driver;
		
	}
	public void insertSearchBox() {
		driver.findElement(searchBox).click();
	}

	public void clicksearchTerm() {
		driver.findElement(searchTerm).sendKeys("suit");
	}
	public void clickserchTrm() {
		driver.findElement(serchTrm2).sendKeys(Keys.RETURN);
		
	}
	public void clickProduct() {
		driver.findElement(clickOnProduct).click();
	}
	public void selectSizeNumber() {
		driver.findElement(selectSizeBy).click();
	}
	public void addToCardToBy() {
		driver.findElement(addToCard).click();
	}
	public void completePurchase() {
		driver.findElement(completeOrder).click();
	}
	public void complThePurchase() {
		driver.findElement(completeThePurchase).click();
	}
	public void logIn() {
		driver.findElement(enterlLogIn).sendKeys("email_email@gmail.com");
	}
	public void enterPass() {
		driver.findElement(enterPass).sendKeys("Password");
	}
}
