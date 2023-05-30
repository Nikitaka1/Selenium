package ExcelSheet;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

import org.apache.poi.EncryptedDocumentException;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.WorkbookFactory;

public class Example_getalldatafromexcel 
{
	public static void main(String[] args) throws EncryptedDocumentException, IOException 
	{
		FileInputStream file = new FileInputStream("C:\\Users\\GOVIND\\Desktop\\Nikita testing material\\Book1.xlsx");
		
		Sheet sh =WorkbookFactory.create(file).getSheet("Sheet1");
		
		
		
		int lastrowindex = sh.getLastRowNum();
		
		for(int i=0; i<=lastrowindex; i++)
		{
			int lastcellindex = sh.getRow(i).getLastCellNum()-1;
			for(int j=0; j<=lastcellindex; j++ )
			{
				String value = sh.getRow(i).getCell(j).getStringCellValue();
				System.out.print(value+ " ");
			}
			System.out.println();
		}
	}
	

}
