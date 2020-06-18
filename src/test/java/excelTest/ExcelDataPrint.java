package excelTest;

import org.testng.annotations.BeforeClass;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

import utilities.Constants;
import utilities.ExcelGetData;

public class ExcelDataPrint {
	
	@BeforeClass
	public void setUpExcel() {
		ExcelGetData.setExcelFile(Constants.excelPath, "Users");
	}
	
	
	@DataProvider(name = "users")
		public Object [][] dataProvider() {
		Object[][] testData = ExcelGetData.getTestData("Valid_Users");
		
		
		return testData;
	}
	
	@Test (dataProvider = "users" )
	public void printExcelData(String username, String password) {
		System.out.println("Username: " +  username + ", Password: " + password);
		
	}

}
