package library;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;

import utilities.Base;

public class HomePageObjs3 extends Base {
	
	
	WebDriver driver;
	By searchBox = By.xpath("//input[@id='gh-search-input']");
	By clickclick =By.xpath("//button[@class='c-close-icon  c-modal-close-icon']");
	
	By clickBtn = By.xpath("//button[@class='header-search-button']");
	
	By selectItems = By.xpath("//a[@href='/site/hp-17-3-laptop-intel-core-i5-8gb-memory-256gb-ssd-jet-black/6407696.p?skuId=6407696']");
	
	By addToCard = By.xpath("//button[@class='btn btn-primary btn-lg btn-block btn-leading-ficon add-to-cart-button']");
	
	By completeOrder = By.xpath("//span[@class='cart-nav-text']");
	
	
	
	
	public HomePageObjs3(WebDriver driver) {
		this.driver = driver;
		
	}
	public void insertSearchBox(String product) {
		driver.findElement(searchBox).sendKeys(product);
	}
	public void clickClick() {
		driver.findElement(clickclick).click();
	}

	public void clickButton() {
		driver.findElement(clickBtn).click();
	}
	public void selectItms() {
		driver.findElement(selectItems).click();
		
	}
	public void addToCardToBy() {
		driver.findElement(addToCard).click();
		
	}
	public void completePurchase() {
		driver.findElement(completeOrder).click();
	}
	

}
