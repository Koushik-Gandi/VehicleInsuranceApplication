package com.cg.insurance.service;


import com.cg.insurance.beans.Vehicle;

public interface VehicleInsuranceApplicationService {

	boolean vehicleRegistration(Vehicle vehicle);

	String insuranceCheck(String vehicleNo);

}
