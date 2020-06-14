package test2;


import org.openqa.selenium.By;
import org.testng.annotations.Test;


import utilities.Base;


public class TestA  extends Base {
	
	
	@Test
	public void selectGoods() {
		driver.get("https://www.amazon.com/");
		driver.findElement(By.xpath("//input[@id='twotabsearchtextbox']")).sendKeys("TV");
		driver.findElement(By.xpath("//input[@type='submit']")).click();
		driver.close();	
	}
	

		

		
}
