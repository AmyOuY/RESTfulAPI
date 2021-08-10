package com.demo.restfulAPI.model;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "memoryInfo")
public class MemoryInfo {

	@Id
	@GeneratedValue
	private int id;
	
	private int workerId;
	private String workerName;
	private int usedCPU;
	private float totalRAM;
	private float usedRAM;
	private float usedRAMPercentage;	
	private float totalVMEM;
	private float usedVMEM;
	private float usedVMEMPercentage;
	private String GPUName;
	private boolean useGPU;
	
	
	public int getId() {
		return id;
	}
	
	public void setId(int id) {
		this.id = id;
	}
	
	public int getWorkerId() {
		return workerId;
	}
	
	public void setWorkerId(int workerId) {
		this.workerId = workerId;
	}
	
	public String getWorkerName() {
		return workerName;
	}
	
	public void setWorkerName(String workerName) {
		this.workerName = workerName;
	}
	
	
	public int getUsedCPU() {
		return usedCPU;
	}
	
	public void setUsedCPU(int usedCPU) {
		this.usedCPU = usedCPU;
	}
	
	public float getTotalRAM() {
		return totalRAM;
	}
	
	public void setTotalRAM(float totalRAM) {
		this.totalRAM = totalRAM;
	}
	
	public float getUsedRAM() {
		return usedRAM;
	}
	
	public void setUsedRAM(float usedRAM) {
		this.usedRAM = usedRAM;
	}
		
	public float getUsedRAMPercentage() {
		return usedRAMPercentage;
	}

	public void setUsedRAMPercentage(float usedRAMPercentage) {
		this.usedRAMPercentage = usedRAMPercentage;
	}
	
	public float getTotalVMEM() {
		return totalVMEM;
	}
	
	public void setTotalVMEM(float totalVMEM) {
		this.totalVMEM = totalVMEM;
	}
	
	public float getUsedVMEM() {
		return usedVMEM;
	}
	
	public void setUsedVMEM(float usedVMEM) {
		this.usedVMEM = usedVMEM;
	}
	
	public float getUsedVMEMPercentage() {
		return usedVMEMPercentage;
	}

	public void setUsedVMEMPercentage(float usedVMEMPercentage) {
		this.usedVMEMPercentage = usedVMEMPercentage;
	}
	
	public String getGPUName() {
		return GPUName;
	}
	
	public void setGPUName(String gPUName) {
		GPUName = gPUName;
	}
	
	public boolean isUseGPU() {
		return useGPU;
	}
	
	public void setUseGPU(boolean useGPU) {
		this.useGPU = useGPU;
	}	
	
}
