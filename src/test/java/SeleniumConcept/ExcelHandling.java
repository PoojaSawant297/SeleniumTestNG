package SeleniumConcept;

	import java.io.FileInputStream;
	import java.io.IOException;

import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.xssf.usermodel.XSSFRow;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

	public class ExcelHandling {
		
		public static void main(String[] args) throws IOException {
			
			// Read data from Excel --
			
			String path = "C:\\Users\\User\\Downloads\\Financial Sample.xlsx";
			
			//This will hep us to read the file
			FileInputStream fis = new  FileInputStream(path);
			
			//This will take the control of workbook
			XSSFWorkbook xf = new XSSFWorkbook(fis);
			
			//This will fetch sheet
			XSSFSheet sheet = xf.getSheet("Sheet1");
			
			//This will fetch row
			XSSFRow row = sheet.getRow(1);
			
			//This will fetch cell
			Cell cell0 = row.getCell(0); 
			
			Cell cell1 = row.getCell(1); 
			
			System.out.println(cell0);
			System.out.println(cell1);
			
			
		//	System.out.println(sheet.getLastRowNum()); //4
		     //for(int i=0;i<sheet.getLastRowNum());
			
		
			
			
		}
		
	}



