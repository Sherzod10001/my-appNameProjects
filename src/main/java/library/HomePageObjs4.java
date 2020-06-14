package library;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class HomePageObjs4 {
	WebDriver driver;
	
	 //Objects
	
	@FindBy(xpath = "//input[@id='search_query_top']")//19
	WebElement searchBox;
	
	
	@FindBy(xpath = "//button[@name='submit_search']") //20
	WebElement searchBtn;
	
	
	@FindBy(xpath = "//div[@id='best-sellers_block_right']//li[1]/a")//21
	WebElement searchResultOpt1;//22
	
	
	 //Constructor
	public HomePageObjs4(WebDriver driver) {//11
		this.driver = driver; //12
		PageFactory.initElements(driver, this);
	}
	
	  //Actions on objects
	 
	//this is the search box on top of the window
	public void insertSearchStr(String searchKey) { //8
		searchBox.sendKeys(searchKey);//9 //23
	}
	public void clickSrchBtn() {//13
		searchBtn.click();//14 //24
	}
	public void chooseFirstOption() {//15
		searchResultOpt1.click();//16 //25
	}
}
