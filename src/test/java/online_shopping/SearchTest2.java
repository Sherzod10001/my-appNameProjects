package online_shopping;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.testng.annotations.Test;

import library.HomePageFactory;
import library.HomePageFactory2;
import library.HomePageObjs2;
import library.HomePageObjs3;
import utilities.Base;

public class SearchTest2 extends Base{
	
	@Test
	public void orderingGoods() {
		driver.get(prop.getProperty("url"));

		HomePageObjs2 homePageObjs2 = new HomePageObjs2(driver);
		
		homePageObjs2.insertSearchBox();
		homePageObjs2.clicksearchTerm();
		homePageObjs2.clickserchTrm();
		homePageObjs2.clickProduct();
		homePageObjs2.selectSizeNumber();
		homePageObjs2.addToCardToBy();
		homePageObjs2.completePurchase();
		homePageObjs2.complThePurchase();
		homePageObjs2.logIn();
		homePageObjs2.enterPass();		
	
	}
	//@Test
	public void orderLaptop() {
		driver.get(prop.getProperty("url"));
		HomePageObjs3 homePageObjs3 = new HomePageObjs3(driver);
		
		homePageObjs3.insertSearchBox("laptop");
		homePageObjs3.clickClick();
		homePageObjs3.clickButton();
		homePageObjs3.selectItms();
		homePageObjs3.addToCardToBy();
		homePageObjs3.completePurchase();
	
	}
	
	//@Test
	public void logIn() {
		driver.get(prop.getProperty("url"));

		HomePageFactory2 homePageFactory2 = new HomePageFactory2(driver); 
		
		homePageFactory2.searchBox();
	
		homePageFactory2.clickSrchBtn();
		
		
		homePageFactory2.chooseFirstOption();
		
	}
		/*driver.get(prop.getProperty("url"));
		
		driver.findElement(By.xpath("//input[@id='text-input-what']")).sendKeys("QA analyst");
		driver.findElement(By.xpath("//button[@type='submit']")).click();
		driver.findElement(By.xpath("//a[@id='sja0']")).click();
		
		driver.findElement(By.xpath("//button[@class='icl-Button icl-Button--branded icl-Button--block']/div[@class='jobsearch-IndeedApplyButton-contentWrapper']")).click();
}*/
}