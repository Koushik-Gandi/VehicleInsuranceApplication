package com.cg.insurance.beans;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;

public class Vehicle {
	DateTimeFormatter dtf = DateTimeFormatter.ofPattern("dd/MM/yyyy ");  
    LocalDateTime now = LocalDateTime.now();  
	private String aadharNo,mobile,vehicleType;
	private long vehicleNo,insurancePeriod;
	private LocalDate date;
	public LocalDate getDate() {
		return date;
	}
	public void setDate(LocalDate date) {
		this.date = date;
	}
	public Vehicle(String vehicleType, long insurancePeriod, String aadharNo, String mobile,LocalDate date) {
		this.vehicleType=vehicleType;
		this.insurancePeriod=insurancePeriod;
		this.aadharNo=aadharNo;
		this.mobile=mobile;
		this.date=date;
	}
	public Vehicle() {
		
	}
	
	public String getAadharNo() {
		return aadharNo;
	}
	public void setAadharNo(String aadharNo) {
		this.aadharNo = aadharNo;
	}
	public String getMobile() {
		return mobile;
	}
	public void setMobile(String mobile) {
		this.mobile = mobile;
	}
	public String getVehicleType() {
		return vehicleType;
	}
	public void setVehicleType(String vehicleType) {
		this.vehicleType = vehicleType;
	}
	public long getVehicleNo() {
		return vehicleNo;
	}
	public void setVehicleNo(long vehicleNo) {
		this.vehicleNo = vehicleNo;
	}
	public long getInsurancePeriod() {
		return insurancePeriod;
	}
	public void setInsurancePeriod(long insurancePeriod) {
		this.insurancePeriod = insurancePeriod;
	}
	
}
