package ExcelSheet;

import java.io.FileInputStream;
import java.io.IOException;

import org.apache.poi.EncryptedDocumentException;
import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.WorkbookFactory;

public class Example_getbooleandata 
{
	public static void main(String[] args) throws EncryptedDocumentException, IOException 
	{
		FileInputStream file= new FileInputStream("C:\\Users\\GOVIND\\Desktop\\Nikita testing material\\Book1.xlsx");
		Cell value = WorkbookFactory.create(file).getSheet("Sheet1").getRow(0).getCell(2);
		System.out.println(value);
	}

}
