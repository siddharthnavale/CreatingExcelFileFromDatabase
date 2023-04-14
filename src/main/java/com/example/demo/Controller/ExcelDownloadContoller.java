package com.example.demo.Controller;

import java.io.ByteArrayInputStream;
import java.io.IOException;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.core.io.InputStreamResource;
import org.springframework.core.io.Resource;
import org.springframework.http.HttpHeaders;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.demo.Service.ExcelService;

@RestController
public class ExcelDownloadContoller {
	
	@Autowired
	private ExcelService excelService;
	
	@GetMapping("/downloadExcelOfMobile")
	public ResponseEntity<Resource> downloadExcelForMoblie() throws IOException{
		
		 String fileName="mobile.xlsx";
		
		 ByteArrayInputStream allData = excelService.getAllDataIntoExcel();
		InputStreamResource Resource = new InputStreamResource(allData);
	
		return ResponseEntity.ok()
		.header(HttpHeaders.CONTENT_DISPOSITION, "attachment; filename=\"" + fileName + "\"")
		.contentType(MediaType.parseMediaType("application/vnd.ms-excel")).body(Resource);
		
		
	}

}
