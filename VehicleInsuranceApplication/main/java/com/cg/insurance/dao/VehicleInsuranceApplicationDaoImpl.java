package com.cg.insurance.dao;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.util.Date;
import java.util.HashMap;
import java.util.Map;

import com.cg.insurance.beans.Vehicle;
public class VehicleInsuranceApplicationDaoImpl implements VehicleInsuranceApplicationDao{
	Vehicle set=new Vehicle();
	public boolean vehicleRegistration(Vehicle vehicle) {
		Map<Long, Vehicle> InsuranceEntry  = new HashMap<Long, Vehicle>();
		InsuranceEntry .put(set.getVehicleNo(), new Vehicle(set.getVehicleType(),set.getInsurancePeriod(),set.getAadharNo(),set.getMobile(), null ));
		return (InsuranceEntry !=null);
	}

	public String insuranceCheck(String vehicleNo) {
		DateTimeFormatter dtf = DateTimeFormatter.ofPattern("dd/MM/yyyy");  
	    LocalDate now = LocalDate.now();
	    LocalDate then=now.plusMonths(12).minusDays(1);
		return dtf.format(then);
	}

}
