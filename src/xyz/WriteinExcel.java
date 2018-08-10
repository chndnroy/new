package xyz;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;

import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.xssf.usermodel.XSSFCell;
import org.apache.poi.xssf.usermodel.XSSFRow;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class WriteinExcel {
	public static void main(String[] args) throws IOException {
		
		
		try {
			FileInputStream file = new FileInputStream(new File("/home/ttuser10/Desktop/test data.xlsx"));

			XSSFWorkbook workbook = new XSSFWorkbook(file);
			XSSFSheet sheet = workbook.getSheet("Sheet3");
			Cell cell = null;

			//Update the value of cell
			cell = sheet.getRow(13).getCell(1);
     		cell.setCellValue("chandan");
     		
//			cell = sheet.getRow(2).getCell(2);
//			cell.setCellValue(cell.getNumericCellValue() * 2);
//			cell = sheet.getRow(3).getCell(2);
//			cell.setCellValue(cell.getNumericCellValue() * 2);
			
			file.close();
			
			FileOutputStream outFile =new FileOutputStream(new File("/home/ttuser10/Desktop/test data.xlsx"));
			workbook.write(outFile);
			System.out.println(cell.getStringCellValue());
			outFile.close();
			
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		}
	

}
}
