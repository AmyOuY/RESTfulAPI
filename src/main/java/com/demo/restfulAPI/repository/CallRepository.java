package com.demo.restfulAPI.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.demo.restfulAPI.model.CallInfo;

public interface CallRepository extends JpaRepository<CallInfo, Integer>{

}
