// Navigate to http://poi.apache.org/download.html
// Download poi-bin-xxxxxxx.zip
// Extract the zip file
// Include the .jar files in to Java Project -> Build Path

package excel;

import java.io.File;
import java.io.FileInputStream;

import org.apache.poi.xssf.usermodel.XSSFRow;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class ExcelRead {

	public static void main(String[] args) {
		
		try
		{
			FileInputStream file = new FileInputStream(new File("MyBook.xlsx"));
			
			//Create Workbook instance holding reference to .xlsx file
	        XSSFWorkbook workbook = new XSSFWorkbook(file);
	        
	        //Get first/desired sheet from the workbook
            XSSFSheet sheet = workbook.getSheetAt(0);
            
            int lastRowNumber = sheet.getLastRowNum();
            for(int i=0; i<=lastRowNumber; i++)
            {
            	XSSFRow row = sheet.getRow(i);
            	int lastCellNumber = row.getLastCellNum();
            	for(int j=0; j<lastCellNumber; j++)
            	{
            		System.out.println(row.getCell(j).getStringCellValue());
            	}
            }
            
            workbook.close();
		}
		catch (Exception e)
		{
			e.printStackTrace();
		}
	}
}