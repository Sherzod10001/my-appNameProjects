package test2;



import org.openqa.selenium.By;
import org.testng.annotations.Test;


import utilities.Base;


public class TestB extends Base {
	
	@Test 
	public void testB1() {
		driver.get("https://www.cheapoair.com/flights/");
		driver.findElement(By.xpath("//a[@id='travellerButton']")).click();
	}
		
		
	}
	


