package com.example.demo.Service;

import java.io.ByteArrayInputStream;
import java.io.IOException;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.demo.Entity.Mobile;
import com.example.demo.Helper.Helper;
import com.example.demo.Repositoty.MobileRepository;

@Service
public class ExcelService {
	
	@Autowired
	private MobileRepository MobileRepository;
	
	@Autowired
	private Helper helper;
	
	public ByteArrayInputStream getAllDataIntoExcel() throws IOException{
		
		List<Mobile> mobiles = MobileRepository.findAll();
		return helper.dataBaseToExcel(mobiles);
		
	}

}
