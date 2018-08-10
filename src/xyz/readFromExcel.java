package xyz;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

import org.apache.poi.hssf.usermodel.HSSFCell;
import org.apache.poi.hssf.usermodel.HSSFRow;
import org.apache.poi.hssf.usermodel.HSSFSheet;
import org.apache.poi.hssf.usermodel.HSSFWorkbook;
import org.apache.poi.xssf.usermodel.XSSFCell;
import org.apache.poi.xssf.usermodel.XSSFRow;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class readFromExcel {
	public static void main(String[] args) throws IOException {
		
	
	FileInputStream f=new FileInputStream("/home/ttuser10/Desktop/test data.xlsx");
	XSSFWorkbook h=new XSSFWorkbook(f);
	XSSFSheet sheet=h.getSheet("Sheet1");
	XSSFRow row1= sheet.getRow(0);
	XSSFCell cell1=row1.getCell(1);
	String a = cell1.getStringCellValue();
	System.out.println(a);
}
}
