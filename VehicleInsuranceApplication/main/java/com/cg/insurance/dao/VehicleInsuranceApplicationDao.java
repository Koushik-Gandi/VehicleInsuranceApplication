package com.cg.insurance.dao;

import com.cg.insurance.beans.Vehicle;

public interface VehicleInsuranceApplicationDao {

	boolean vehicleRegistration(Vehicle vehicle);
	String insuranceCheck(String vehicleNo);
	
}
