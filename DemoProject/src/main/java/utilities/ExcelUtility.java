package utilities;

import java.io.FileInputStream;
import java.io.IOException;

import org.apache.poi.xssf.usermodel.XSSFCell;
import org.apache.poi.xssf.usermodel.XSSFRow;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

import constant.Constant;

public class ExcelUtility {

	static FileInputStream f;
	static XSSFWorkbook wb;
	static XSSFSheet sh;

	public static String getStringData(int a, int b, String Sheet) throws IOException {

		String filepath = Constant.TESTDATAFILE;
		f = new FileInputStream(filepath);
		wb = new XSSFWorkbook(f);
		sh = wb.getSheet(Sheet);
		XSSFRow r = sh.getRow(a);
		XSSFCell c = r.getCell(b);
		return c.getStringCellValue();
	}

	public static String getintegerdata(int a, int b, String Sheet) throws IOException {

		String filepath = Constant.TESTDATAFILE;
		f = new FileInputStream(filepath);

		wb = new XSSFWorkbook(f);
		sh = wb.getSheet(Sheet);
		XSSFRow r = sh.getRow(a);
		XSSFCell c = r.getCell(b);
		int X = (int) c.getNumericCellValue();
		return String.valueOf(X);
	}

	public static String getfloatdata(int a, int b, String Sheet) throws IOException {
		String filepath = Constant.TESTDATAFILE;
		f = new FileInputStream(filepath);

		wb = new XSSFWorkbook(f);
		sh = wb.getSheet(Sheet);
		XSSFRow r = sh.getRow(a);
		XSSFCell c = r.getCell(b);
		float X = (float) c.getNumericCellValue();
		return String.valueOf(X);
	}
}
