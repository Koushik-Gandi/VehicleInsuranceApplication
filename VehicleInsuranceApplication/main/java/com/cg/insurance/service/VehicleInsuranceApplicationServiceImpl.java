package com.cg.insurance.service;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.util.Date;

import com.cg.insurance.beans.Vehicle;
import com.cg.insurance.dao.*;
import com.cg.insurance.exceptions.*;

public class VehicleInsuranceApplicationServiceImpl implements VehicleInsuranceApplicationService {

	VehicleInsuranceApplicationDao vehicle1 = new VehicleInsuranceApplicationDaoImpl();

	public boolean vehicleRegistration(Vehicle vehicle) {
		return vehicle1.vehicleRegistration(vehicle);
	}

	public String insuranceCheck(String vehicleNo) {
		return vehicle1.insuranceCheck(vehicleNo);
	}

	public boolean validAadhar(String aadhar) throws Exception {
		int count = 0;
		if (aadhar.length() == 12) {
			char[] ch = aadhar.toCharArray();
			for (int i = 0; i < ch.length; i++) {
				if (ch[i] >= 48 || ch[i] <= 57) {
					count++;
					continue;
				} else
					throw new InvalidAadhar("Invalid Aadhar");
			}
			if (count == 12) {
				return true;
			} else
				return false;
		}
		return false;
	}
	public boolean validMobile(String mobile) throws Exception {
		int count = 0;
		if (mobile.length() == 10) {
			char[] ch = mobile.toCharArray();
			for (int i = 0; i < ch.length; i++) {
				if (ch[i] >= 48 || ch[i] <= 57) {
					count++;
					continue;
				} else
					throw new InvalidMobile("Invalid Mobile number");
			}
			if (count == 10) {
				return true;
			} else
				return false;
		}
		return false;
	}
}
