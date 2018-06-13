// Navigate to http://poi.apache.org/download.html
// Download poi-bin-xxxxxxx.zip
// Extract the zip file
// Include the .jar files in to Java Project -> Build Path

package excel;

import java.io.File;
import java.io.FileOutputStream;
import java.util.Hashtable;

import org.apache.poi.xssf.usermodel.XSSFCell;
import org.apache.poi.xssf.usermodel.XSSFRow;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class ExcelWrite {

	public static void main(String[] args) {
		
		// Blank workbook
        XSSFWorkbook workbook = new XSSFWorkbook();
        // XSSFWorkbook class implements Workbook Interface
        
        // Create a blank sheet
        XSSFSheet sheet = workbook.createSheet("Employee Data");
        // XSSFSheet class implements Sheet Interface
        
        // Data to be written
        Hashtable<Integer, Object[]> data = new Hashtable<Integer, Object[]>();
        //Object ob1[] = new Object[] {1, "2"};
        //ht.put("1", ob1);
        data.put(1, new Object[] {"ID", "Name", "Last Name"});
        data.put(2, new Object[] {"1", "Anand", "Kumar"});
        data.put(3, new Object[] {"2", "Bala", "Krishnan"});
        
        //Iterate over data and write to sheet
        int rows = data.size();
        for(int a=1; a<=rows; a++)
        {
        	// Create Row
        	// To start with zeroth index (a-1) is used
        	XSSFRow row = sheet.createRow((a-1));
        	// XSSFRow class implements Row Interface
        	
            Object ob[] = data.get(a);
            int columns = ob.length;
            
            for (int i=0; i<columns; i++)
            {
            	// Create Cell
            	XSSFCell cell = row.createCell(i);
            	// XSSFCell class implements Cell Interface
            	
            	cell.setCellValue((String)ob[i]);
            }
        }
        
        try
        {
            //Write the workbook in file system
            FileOutputStream out = new FileOutputStream(new File("MyBook.xlsx"));
            workbook.write(out);
            workbook.close();
            out.close();
        }
        catch (Exception e)
        {
            e.printStackTrace();
        }   
	}
}