package com.demo.restfulAPI.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.demo.restfulAPI.model.MemoryInfo;

public interface MemoryRepository extends JpaRepository<MemoryInfo, Integer>{

	MemoryInfo findByWorkerId(int workerId);

}
