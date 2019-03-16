package com.cg.insurance.UI;

import java.util.Scanner;

import com.cg.insurance.beans.Vehicle;
import com.cg.insurance.service.*;

public class App {
	public static void main(String[] args) throws Exception {
		while(true)
		select();
	}

	static Scanner sc = new Scanner(System.in);
	static VehicleInsuranceApplicationService service = new VehicleInsuranceApplicationServiceImpl();
	static VehicleInsuranceApplicationServiceImpl valid=new VehicleInsuranceApplicationServiceImpl();
	static void select() throws Exception {
		System.out.println("1)Vehicle Insurance Registration\r\n" + "2)Insurance Validity Check\r\n" + "3)Exit");
		int choice = sc.nextInt();
		switch (choice) {
		case 1:setInfo();
			break;
		case 2:System.out.println("Vehicle No :");
			String vehicleNo=sc.next();
			System.out.println("Your insurance expires on " + service.insuranceCheck(vehicleNo)+"");
			break;
		case 3:
			System.exit(0);
			break;
		default:
			System.exit(0);
		}
	}

	 static void setInfo() throws Exception {
		 Vehicle vehicle=new Vehicle();
		 System.out.println("Enter Vehicle No :");
		 vehicle.setVehicleNo(sc.nextLong());
		 System.out.println("Enter Vehicle Type :");
		 vehicle.setVehicleType(sc.next());
		 System.out.println("Enter Insurance Period :");
		 vehicle.setInsurancePeriod(sc.nextLong());
		 System.out.println("Enter Aadhar No :");
		 String aadhar=sc.next();
		 if(valid.validAadhar(aadhar)) {
			 vehicle.setAadharNo(aadhar);
			 System.out.println("Enter Mobile");
			 String mobile=sc.next();
			 if(valid.validMobile(mobile)) {
				 vehicle.setMobile(mobile);
				 if (service.vehicleRegistration(vehicle))
						System.out.println("Successfully Registered.");
				 else System.out.println("Vehicle Not Registered");
			 }
		 }
	}
}
