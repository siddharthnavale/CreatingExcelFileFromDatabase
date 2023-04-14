package com.example.demo.Helper;

import java.io.ByteArrayInputStream;
import java.io.ByteArrayOutputStream;
import java.io.IOException;
import java.util.List;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import org.springframework.stereotype.Component;

import com.example.demo.Entity.Mobile;

@Component
public class Helper {
	
	public static String[] header= {"mobile_id",
			"hard_disk","mobile_model","mobile_model","ram"};

	public static String sheetName="Mobile_Data";
	
	
	public  ByteArrayInputStream dataBaseToExcel(List<Mobile>mobileList) throws IOException {
	
		Workbook workBook = new XSSFWorkbook();
		
	    ByteArrayOutputStream byteArrayOutputStream=new ByteArrayOutputStream();
	    
		try {	
		Sheet sheet = workBook.createSheet();
		Row Row1 = sheet.createRow(0);
		
		//created Header row
		for(int i=0; i<header.length; i++) {
			Row1.createCell(i).setCellValue(header[i]);
			}
		// assigning values to rows excluding Header row
		 int RowIndex=1;
		for(Mobile m:mobileList) {
			Row row = sheet.createRow(RowIndex);
			RowIndex++;
			row.createCell(0).setCellValue(m.getMobileId());
			row.createCell(1).setCellValue(m.getHardDisk());
			row.createCell(2).setCellValue(m.getMobileModel());
			row.createCell(3).setCellValue(m.getPrice());
			row.createCell(4).setCellValue(m.getRam());
			}
			workBook.write(byteArrayOutputStream);
			
			return new ByteArrayInputStream(byteArrayOutputStream.toByteArray());
		
	
	} catch (IOException e) {
			e.printStackTrace();
			return null;
		}
		finally {
			workBook.close();
			byteArrayOutputStream.close();
			
		}
		
	
	}
	
}
