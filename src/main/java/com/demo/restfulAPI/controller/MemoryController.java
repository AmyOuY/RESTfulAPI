package com.demo.restfulAPI.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

import com.demo.restfulAPI.model.CallInfo;
import com.demo.restfulAPI.model.MemoryInfo;
import com.demo.restfulAPI.service.CallService;
import com.demo.restfulAPI.service.MemoryService;

@RestController
public class MemoryController {

	@Autowired
	private MemoryService memoryService;
	
	@Autowired
	private CallService callService;
	
	private String filePath = "C:/Users/ouyim/Desktop/APICallLogs.csv";
		
	
	@GetMapping(path="/memoryUsageInfo/getAll", produces= {"application/json"})
	public ResponseEntity<List<MemoryInfo>> getAllMemoryUsageInfo(){
	
		List<MemoryInfo> allInfo = memoryService.getAllMemoryInfo();
		
		// record API_CALL_DATA, API_KEY and API_VALUE to a CSV file 
		memoryService.SAVE2CSV(filePath, "api_call_data", "api_key", "api_value");
		
		boolean result = false;
		int error_counts = 0;
		
		if (allInfo != null) {
			result = true;
			error_counts = 0;		
			
			// hard-code admin_id to 3 here
			CallInfo callInfo = new CallInfo(3, result, error_counts);
			
			// record API call actions and result to MySQL DB
			callService.addCallInfo(callInfo);
			
			return new ResponseEntity<List<MemoryInfo>>(allInfo, HttpStatus.OK);
		}
		else {
			result = false;
			error_counts += 1;		
			
			CallInfo callInfo = new CallInfo(3, result, error_counts);
			
			callService.addCallInfo(callInfo);
			
			return new ResponseEntity<>(HttpStatus.NO_CONTENT);	
		}
	}
	
	
		
	@GetMapping(path="/memoryUsageInfo/get/{workerId}", produces= {"application/json"})
	public ResponseEntity<MemoryInfo> getMemoryInfo(@PathVariable int workerId) {
			
		MemoryInfo info = memoryService.getMemoryInfoByWorkerId(workerId);
		
		// record API_CALL_DATA, API_KEY and API_VALUE to a CSV file 
		memoryService.SAVE2CSV(filePath, "api_call_data", "api_key", "api_value");
				
		boolean result = false;
		int error_counts = 0;
		
		if (info != null) {				
			result = true;
			error_counts = 0;		
			
			// hard-code admin_id to 1 here
			CallInfo callInfo = new CallInfo(1, result, error_counts);
			
			// record API call actions and result to MySQL DB
			callService.addCallInfo(callInfo);
			
			return new ResponseEntity<MemoryInfo>(info, HttpStatus.OK);
		}
		else {			
			result = false;
			error_counts += 1;		
			
			CallInfo callInfo = new CallInfo(1, result, error_counts);
			
			callService.addCallInfo(callInfo);
			
			return new ResponseEntity<>(HttpStatus.NOT_FOUND);
		}				
	}
	
}
