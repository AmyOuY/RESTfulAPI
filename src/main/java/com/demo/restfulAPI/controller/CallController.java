package com.demo.restfulAPI.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.demo.restfulAPI.model.CallInfo;
import com.demo.restfulAPI.service.CallService;

@RestController
public class CallController {

	@Autowired
	private CallService service;
	
	
	@PostMapping(path="/addAPICallInfo", consumes={"application/json"})
	public CallInfo addCallInfo(@RequestBody CallInfo info) {
		
		service.addCallInfo(info);
		
		return info;
		
	}
}
