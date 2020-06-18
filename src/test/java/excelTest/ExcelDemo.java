package excelTest;

import java.io.FileInputStream;


import org.apache.poi.xssf.usermodel.XSSFCell;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

import utilities.Constants;

public class ExcelDemo {
	
	
	public static void main(String[] args ) {
		XSSFWorkbook excelWbook; //1
		XSSFSheet excelSheet;//2
		XSSFCell cell;//3
		
		//String excelPath = Constants.excelPath;//4
		String sheetName = "test1";//5
		
		
		try {
			FileInputStream fis = new FileInputStream(Constants.excelPath);
			excelWbook = new XSSFWorkbook(fis);
			excelSheet= excelWbook.getSheet(sheetName);
			
			
			cell = excelSheet.getRow(0).getCell(0);//founded
			String cellData = cell.getStringCellValue();
			System.out.println(cellData);
			
			
		} catch (Exception e) {
			
			e.printStackTrace();
		} 
		
	}

}
