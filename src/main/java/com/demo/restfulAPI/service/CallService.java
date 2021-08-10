package com.demo.restfulAPI.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.demo.restfulAPI.model.CallInfo;
import com.demo.restfulAPI.repository.CallRepository;

@Service
public class CallService {

	@Autowired
	private CallRepository repo;
	
	
	public CallInfo addCallInfo(CallInfo info) {
		
		return repo.save(info);
	}
}
