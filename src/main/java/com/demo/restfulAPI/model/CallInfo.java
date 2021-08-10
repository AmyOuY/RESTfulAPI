package com.demo.restfulAPI.model;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.LocalTime;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Table;
import javax.persistence.Transient;

@Entity
@Table(name = "callInfo")
public class CallInfo {

	@Id
	@GeneratedValue
	private int id;
	
	private int adminId;
	
	@Transient
	private LocalDateTime localDateTime = LocalDateTime.now();
	
	@Column(name = "call_date")
	private LocalDate callDate = localDateTime.toLocalDate();
	
	@Column(name = "call_time")
	private LocalTime callTime = localDateTime.toLocalTime();
	
	private boolean result;
	private int error_counts;
	
	public CallInfo() {
		super();
	}

	public CallInfo(int adminId, boolean result, int error_counts) {
		super();
		this.adminId = adminId;
		this.result = result;
		this.error_counts = error_counts;
	}

	public int getId() {
		return id;
	}
	
	public void setId(int id) {
		this.id = id;
	}
	
	public int getAdminId() {
		return adminId;
	}
	
	public void setAdminId(int adminId) {
		this.adminId = adminId;
	}
	
	public LocalDate getCallDate() {
		return callDate;
	}
	
	public void setCallDate(LocalDate callDate) {
		this.callDate = callDate;
	}
	
	public LocalTime getCallTime() {
		return callTime;
	}
	
	public void setCallTime(LocalTime callTime) {
		this.callTime = callTime;
	}
	
	public boolean isResult() {
		return result;
	}
	
	public void setResult(boolean result) {
		this.result = result;
	}
	
	public int getError_counts() {
		return error_counts;
	}
	
	public void setError_counts(int error_counts) {
		this.error_counts = error_counts;
	}
	
	
	
}
