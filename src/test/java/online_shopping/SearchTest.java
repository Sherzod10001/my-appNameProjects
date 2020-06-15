package online_shopping;


import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Properties;

import org.testng.annotations.Test;

import library.HomePageFactory;
import library.HomePageObjs4;
import utilities.Base;

public class SearchTest extends Base{
	
	//String url ="http://automationpractice.com/index.php";
	
	
	//@Test
	public void testSearch() throws IOException {
		//opening the url
		//opening the url
		
		driver.get(prop.getProperty("url")); //1

		HomePageObjs4 homePageObjs = new HomePageObjs4(driver); //10
		homePageObjs.insertSearchStr("shirt");
		//search box insert "blouse"
		//driver.findElement().sendKeys("blouse"); //2
	
		homePageObjs.clickSrchBtn();//17
		//click on search button
		//driver.findElement().click();//3
		
		homePageObjs.chooseFirstOption();//18
		//clicking on the first option 
		//driver.findElement().click(); //4
		
	
	}
	//@Test
	public void testSearchWithnumber()  {
		driver.get(""); 
	
		HomePageFactory homePageFactory = new HomePageFactory(driver); 
		
		homePageFactory.insertSearchStr("shirt");
	
		homePageFactory.clickSrchBtn();
		
		
		homePageFactory.chooseFirstOption();
	}

	//@Test
	public void testProperties() throws IOException {
		Properties prop = new Properties();
		FileInputStream fis = new FileInputStream("src\\main\\java\\properties\\app.properties");
		prop.load(fis);
		//opening the url
		System.out.println(prop.getProperty("url"));
	}
	//@Test
	public void testFacebook() {
		driver.get(prop.getProperty("url"));
	}
}
