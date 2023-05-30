package ExcelSheet;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

import org.apache.poi.EncryptedDocumentException;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.WorkbookFactory;

public class Example_getalldata 
{
	public static void main(String[] args) throws EncryptedDocumentException, IOException
	{
		FileInputStream file = new FileInputStream("C:\\Users\\GOVIND\\Desktop\\Nikita testing material\\Book1.xlsx");
		
		Sheet sh = WorkbookFactory.create(file).getSheet("Sheet1");
		
		
		int lastindex =sh.getLastRowNum();
		
		System.out.println(lastindex);
		
		for(int i=0; i<=lastindex; i++)
		{
			for(int j = 0; j<=1  ; j++)
			{
				
				String value = sh.getRow(i).getCell(j).getStringCellValue();
				System.out.print(value+" ");
					
			}
			System.out.println();
			
		}
		
	}

}
