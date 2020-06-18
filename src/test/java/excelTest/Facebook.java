package excelTest;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.support.ui.Select;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

import utilities.Base;


public class Facebook extends Base {
	

	
	
	@Test
	public void registrationForm() {
		driver.get(prop.getProperty("url"));
		driver.findElement(By.xpath("//input[@name='firstname']")).sendKeys("Maria");
		driver.findElement(By.xpath("//input[@name='lastname']")).sendKeys("Anderson");
		driver.findElement(By.xpath("//input[@name='reg_email__']")).sendKeys("Maria@gmail.com");
		driver.findElement(By.xpath("//input[@name='reg_email_confirmation__']")).sendKeys("Maria@gmail.com");
		driver.findElement(By.xpath("//input[@name='reg_passwd__']")).sendKeys("absckdjf");
		
		Select sel1 = new Select(driver.findElement(By.xpath("//*[@id='month']")));
		sel1.selectByValue("1");
		Select sel2 = new Select(driver.findElement(By.xpath("//*[@id='day']")));
		sel2.selectByValue("18");
		
		Select sel3 = new Select(driver.findElement(By.xpath("//*[@id='year']")));
		sel3.selectByValue("1990");
		driver.findElement(By.xpath("//*[@id='u_0_6']")).click();
		driver.findElement(By.xpath("//*[@id='u_0_13']")).click();
		//driver.navigate().back();
	}
	//@AfterClass
	public void afterClass() {
		driver.close();
	}
	/*
	 * @Test (dataProvider = "users" ) public void printExcelData(String
	 * FirstName,String LastName, String MobileNumberOrEmail, String NewPassword,
	 * String birhday,String Gender) { System.out.println(FirstName+ " " + LastName
	 * + "" + MobileNumberOrEmail + "" +NewPassword+ ""+ birhday+ "" +Gender+""); }
	 */
}
	

