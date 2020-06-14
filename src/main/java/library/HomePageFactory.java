package library;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class HomePageFactory {
	WebDriver driver;
	/*
	 * 
	 * Objects
	 * 
	*/
	By searchBox = By.xpath("//input[@id='search_query_top']"); //5
	By searchBtn = By.xpath("//button[@name='submit_search']"); //6
	By searchResultOpt1 = By.xpath("//div[@id='best-sellers_block_right']//li[1]/a"); //7
	
	// Constructor
	
	public HomePageFactory(WebDriver driver) {//11
		this.driver = driver; //12
	}

	/*
	 * Actions on objects
	 * 
		*/
	//this is the search box on top of the window
	public void insertSearchStr(String searchKey) { //8
		driver.findElement(searchBox).sendKeys(searchKey);//9
	}
	public void clickSrchBtn() {//13
		driver.findElement(searchBtn).click();//14
	}
	public void chooseFirstOption() {//15
		driver.findElement(searchResultOpt1).click();//16
	}
}
