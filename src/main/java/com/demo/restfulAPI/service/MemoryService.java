package com.demo.restfulAPI.service;

import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.demo.restfulAPI.model.MemoryInfo;
import com.demo.restfulAPI.repository.MemoryRepository;
import com.opencsv.CSVWriter;

@Service
public class MemoryService {

	@Autowired
	private MemoryRepository repo;
	
	
	public MemoryInfo getMemoryInfoByWorkerId(int workerId) {
		
		return repo.findByWorkerId(workerId);
	}
	
	
	public List<MemoryInfo> getAllMemoryInfo(){
		
		List<MemoryInfo> output = new ArrayList<>();
		
		output = repo.findAll();
		
		output.sort((m1, m2) -> m1.getWorkerId() - m2.getWorkerId());
		
		return output;
	}
	
	
	public void SAVE2CSV(String path, String API_CALL_DATA, String API_KEY, String API_VALUE) {
		
		try {
			
			CSVWriter writer = new CSVWriter(new FileWriter(path, true));
			String[] log = {API_CALL_DATA, API_KEY, API_VALUE};			
			writer.writeNext(log);
			writer.close();
			
		} catch (IOException e) {
			
			e.printStackTrace();
		}
	}
	
	
	
	
	
}
