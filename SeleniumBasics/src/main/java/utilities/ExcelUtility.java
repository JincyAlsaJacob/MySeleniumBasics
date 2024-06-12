package utilities;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class ExcelUtility {
	static FileInputStream f;
	static XSSFWorkbook w;
	static XSSFSheet sh;
	public static String getStringData(int a, int b, String sheet)
	{
		try
		{
		f=new FileInputStream("C:\\Users\\Jincy\\git\\MySeleniumBasics\\SeleniumBasics\\src\\main\\resources\\TestData.xlsx");
		w=new XSSFWorkbook(f);
		sh=w.getSheet(sheet);
		Row r=sh.getRow(a);
		Cell c=r.getCell(b);
		return c.getStringCellValue();
		}
		catch(Exception e)
		{
			throw new RuntimeException("ExcelSheet not found");
		}
	
	}
	public static String getIntegerData(int a,int b, String sheet) 
	{
		try 
		{
		f=new FileInputStream("C:\\Users\\Jincy\\git\\MySeleniumBasics\\SeleniumBasics\\src\\main\\resources\\TestData.xlsx");
		w=new XSSFWorkbook(f);
		sh=w.getSheet(sheet);
		Row r=sh.getRow(a);
		Cell c=r.getCell(b);
		int x=(int) c.getNumericCellValue();         
		return String.valueOf(x);        
		}
		catch(Exception e)
		{
			throw new RuntimeException("ExcelSheet not found");
		}
	}
	
}
