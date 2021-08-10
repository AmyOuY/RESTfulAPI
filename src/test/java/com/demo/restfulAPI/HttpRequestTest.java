package com.demo.restfulAPI;

import static org.assertj.core.api.Assertions.assertThat;
import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.boot.test.context.SpringBootTest.WebEnvironment;
import org.springframework.boot.test.web.client.TestRestTemplate;
import org.springframework.boot.web.server.LocalServerPort;


@SpringBootTest(webEnvironment = WebEnvironment.RANDOM_PORT)
public class HttpRequestTest {

	@LocalServerPort
	private int port;
	
	@Autowired
	private TestRestTemplate restTemplate;
	
	String actual_0 = "{\"id\":1,\"workerId\":0,\"workerName\":\"host p2_pc\",\"usedCPU\":0,\"totalRAM\":125.9,\"usedRAM\":1.726,\"usedRAMPercentage\":0.01,\"totalVMEM\":261.9,\"usedVMEM\":1.726,\"usedVMEMPercentage\":0.0,\"useGPU\":false,\"gpuname\":\"GeForce RTX 2070\"}";
	String actual_1 = "{\"id\":2,\"workerId\":1,\"workerName\":\"host p1_01\",\"usedCPU\":3,\"totalRAM\":996.0,\"usedRAM\":174.3,\"usedRAMPercentage\":0.17,\"totalVMEM\":1473.0,\"usedVMEM\":198.3,\"usedVMEMPercentage\":0.13,\"useGPU\":false,\"gpuname\":\"\"}";
	String actual_2 = "{\"id\":3,\"workerId\":2,\"workerName\":\"host p2_00\",\"usedCPU\":32,\"totalRAM\":1008.0,\"usedRAM\":37.32,\"usedRAMPercentage\":0.03,\"totalVMEM\":1485.0,\"usedVMEM\":157.3,\"usedVMEMPercentage\":0.1,\"useGPU\":false,\"gpuname\":\"GeForce RTX 2080 Ti\"}";
	String actual_3 = "{\"id\":6,\"workerId\":3,\"workerName\":\"host p3_p0\",\"usedCPU\":10,\"totalRAM\":225.9,\"usedRAM\":37.7,\"usedRAMPercentage\":0.17,\"totalVMEM\":461.9,\"usedVMEM\":48.7,\"usedVMEMPercentage\":0.1,\"useGPU\":true,\"gpuname\":\"GeForce GTX 1070\"}";
	String actual_4 = "{\"id\":5,\"workerId\":4,\"workerName\":\"host p1_pc\",\"usedCPU\":4,\"totalRAM\":136.0,\"usedRAM\":20.8,\"usedRAMPercentage\":0.15,\"totalVMEM\":298.0,\"usedVMEM\":15.0,\"usedVMEMPercentage\":0.05,\"useGPU\":true,\"gpuname\":\"GeForce RTX 2060\"}";
	String actual_5 = "{\"id\":4,\"workerId\":5,\"workerName\":\"host filecoin\",\"usedCPU\":48,\"totalRAM\":244.0,\"usedRAM\":32.55,\"usedRAMPercentage\":0.13,\"totalVMEM\":352.0,\"usedVMEM\":152.6,\"usedVMEMPercentage\":0.43,\"useGPU\":false,\"gpuname\":\"GeForce GTX 1080 Ti\"}";
	
	
	@Test
	public void getAllMemoryUsageInfoTest() {
	
		assertThat(this.restTemplate.getForObject("http://localhost:"+port+"/memoryUsageInfo/getAll",
				String.class)).contains(actual_0, actual_1, actual_2, actual_3, actual_4, actual_5);
	}
	
	
	
	@Test
	public void getMemoryInfoTest() {
		
		assertEquals(this.restTemplate.getForObject("http://localhost:"+port+"/memoryUsageInfo/get/0",
				String.class), actual_0);
		
		assertEquals(this.restTemplate.getForObject("http://localhost:"+port+"/memoryUsageInfo/get/1",
				String.class), actual_1);
		
		assertEquals(this.restTemplate.getForObject("http://localhost:"+port+"/memoryUsageInfo/get/2",
				String.class), actual_2);
		
		assertEquals(this.restTemplate.getForObject("http://localhost:"+port+"/memoryUsageInfo/get/3",
				String.class), actual_3);
		
		assertEquals(this.restTemplate.getForObject("http://localhost:"+port+"/memoryUsageInfo/get/4",
				String.class), actual_4);
		
		assertEquals(this.restTemplate.getForObject("http://localhost:"+port+"/memoryUsageInfo/get/5",
				String.class), actual_5);
		
		
	}
	
	
}
