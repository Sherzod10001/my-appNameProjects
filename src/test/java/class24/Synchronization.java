package class24;



import org.openqa.selenium.By;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import utilities.Base;

public class Synchronization extends Base {
	
	public void explicitWait() {
	
		WebDriverWait wait15 = new WebDriverWait(driver, 15);
		
		wait15.until(ExpectedConditions.elementToBeClickable(By.xpath("//button[@class = 'cta-1st select__cta'])[1]")));
		driver.findElement(By.xpath("//button[@class = 'cta-1st select__cta'])[1]")).click();
		
		
		WebDriverWait wait30 = new WebDriverWait(driver, 30);
		wait30.until(ExpectedConditions.visibilityOfElementLocated(By.cssSelector("")));
		driver.findElement(By.cssSelector(""));
		wait15.until(ExpectedConditions.elementToBeClickable(By.xpath("")));
	}

}
