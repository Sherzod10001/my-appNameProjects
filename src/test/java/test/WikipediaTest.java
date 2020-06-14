package test;



import java.util.Set;

import org.openqa.selenium.By;
import org.testng.annotations.Test;

import utilities.Base;


public class WikipediaTest extends Base {
	
	@Test   
	public void selectTest() throws InterruptedException  {
		driver.get("https://www.wikipedia.org/");
		System.out.println("Parent win: " + driver.getTitle());
		String parentWinId = driver.getWindowHandle(); //7
		
		driver.findElement(By.xpath("//a[@id='js-link-box-en'] ")).click();
		Thread.sleep(3000);
		
		Set<String> winIds = driver.getWindowHandles(); //8
		String childWinId = "";
		
		for(String id : winIds) {
			if(!id.equals(parentWinId)) {
				childWinId = id;
			}
		}
		
		driver.switchTo().window(childWinId);
		System.out.println("Child win: " + driver.getTitle());
		
		driver.findElement(By.xpath("//input[@id='searchInput']")).sendKeys("covid19");
		driver.findElement(By.id("searchButton")).click();
		//driver.close();
		
	}
	
	

}
// xpath("//a[@id='js-link-box-en'] "