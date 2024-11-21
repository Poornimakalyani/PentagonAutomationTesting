package Datadriven_Testing;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.ss.usermodel.WorkbookFactory;

public class ExcelFile {

	public static void main(String[] args) throws IOException {

		// Copy and paste excelfile in testdata folder

		// Path of the file
		FileInputStream fis = new FileInputStream(".\\Testdata\\AutomationBatch.xlsx");
		Workbook workbook = WorkbookFactory.create(fis);
		String value1 = workbook.getSheet("Batch").getRow(1).getCell(1).getStringCellValue();
		// String value = workbook.getSheet("Batch").getRow(1).getCell(1).toString();
		String value2 = workbook.getSheet("Batch").getRow(2).getCell(1).getStringCellValue();
		String value3 = workbook.getSheet("Batch").getRow(3).getCell(1).getStringCellValue();
		String value4 = workbook.getSheet("Batch").getRow(4).getCell(1).getStringCellValue();
		String value5 = workbook.getSheet("Batch").getRow(5).getCell(1).getStringCellValue();
		String value6 = workbook.getSheet("Batch").getRow(6).getCell(1).getStringCellValue();
		System.out.println(value1);
		System.out.println(value2);
		System.out.println(value3);
		System.out.println(value4);
		System.out.println(value5);
		System.out.println(value6);
		// modify file in mainfile and copypaste, in java if u modify it will throw error
		//String value7 = workbook.getSheet("Batch").getRow(7).getCell(1).getStringCellValue();
		// System.out.println(value7);

	}

}
