package library;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class HomePageFactory2 {
	WebDriver driver;
	
	 //Objects
	
	@FindBy(xpath ="//input[@type='email']")
	WebElement searchBox;
	
	
	@FindBy(xpath = "//input[@id='pass']") 
	WebElement searchBtn;
	
	
	@FindBy(xpath = "//input[@id='u_0_b']")
	WebElement searchResultOpt1;
	
	
	 //Constructor
	public HomePageFactory2(WebDriver driver) {
		this.driver = driver; 
		PageFactory.initElements(driver, this);
		
	}
	
	public void searchBox() {
	searchBox.sendKeys("email@gmail.com");
}
	public void clickSrchBtn() {
		searchBtn.sendKeys("Password");
	}
	public void chooseFirstOption() {
		searchResultOpt1.click();
	}
}
