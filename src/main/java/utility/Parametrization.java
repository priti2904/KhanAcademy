package utility;

import java.io.FileInputStream;
import java.io.IOException;

import org.apache.poi.EncryptedDocumentException;
import org.apache.poi.ss.usermodel.WorkbookFactory;

public class Parametrization {
	public static String getExcelData(String sheetName,int row,int cell) throws EncryptedDocumentException, IOException {
		FileInputStream file=new FileInputStream("E:\\velocity\\KhanAcademy\\src\\main\\resources\\priti.xlsx");
		String value=WorkbookFactory.create(file).getSheet("Credentials").getRow(row).getCell(cell).getStringCellValue();
		//System.out.println(value);
		
		return value;
	
}
}
