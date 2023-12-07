package com.service;

//import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

import com.dao.PatientDao;
import com.entity.Patient;

public class PatientService {
	private PatientDao patientDao = new PatientDao();

	public void newAdmission(Patient patient) {
		// Add business logic for new admission if needed
		patientDao.addPatient(patient);
	}

/*	public void takeTest(int patientId, String testName) {
		// Add business logic for taking a test if needed
		Patient patient = patientDao.getPatientById(patientId);
		if (patient != null) {
			// Update patient information or perform other actions based on test
		} else {
			System.out.println("Patient not found!");
		}
	}

	public void generateReport(int patientId) {
		// Add business logic for report generation if needed
		Patient patient = patientDao.getPatientById(patientId);
		if (patient != null) {
			// Generate and print the patient's report
			System.out.println("Generating report for patient: " + patient.getPatientName());
		} else {
			System.out.println("Patient not found!");
		}
	}*/

	public Patient searchPatientDetails(int patientId) {
		// Retrieve patient details from the DAO
		return patientDao.getPatientById(patientId);
	}

	public void generateBill(int patientId) {
		// Add business logic for generating a bill if needed
		Patient patient = patientDao.getPatientById(patientId);
		if (patient != null) {
			// Calculate the bill amount based on patient information
			double billAmount = calculateBillAmount(patient);
			patient.setPatientBill(billAmount);
			System.out.println("Bill generated for patient: " + patient.getPatientName() + ". Amount: $" + billAmount);
		} else {
			System.out.println("Patient not found!");
		}
	}

	private double calculateBillAmount(Patient patient) {
		// Add logic to calculate the bill amount based on patient information
		// For simplicity, let's assume a fixed amount for demonstration purposes
		return 100.0;
	}

	public List<Patient> getAllPatients() {
		return patientDao.getAllPatients();
	}

}



/*
 * PatientDao pd = new PatientDao();
 * 
 * public void getpatient()throws SQLException { ArrayList<Patient> list =
 * pd.fetchPatient(); list.forEach(p -> System.out.println(p)); }
 */
