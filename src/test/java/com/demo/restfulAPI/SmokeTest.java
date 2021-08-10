package com.demo.restfulAPI;

import static org.assertj.core.api.Assertions.assertThat;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import com.demo.restfulAPI.controller.MemoryController;

@SpringBootTest
public class SmokeTest {

	@Autowired
	private MemoryController controller;
	
	
	@Test
	void contextLoads() {
		assertThat(controller).isNotNull();
	}
}
