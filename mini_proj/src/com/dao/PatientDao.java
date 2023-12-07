package com.dao;

//import java.sql.Connection;
//import java.sql.DriverManager;
//import java.sql.PreparedStatement;
//import java.sql.ResultSet;
//import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

import com.entity.Patient;

public class PatientDao {
	
	private List<Patient> patients = new ArrayList<>();

    // Constructor
    public PatientDao() {
        // Initialize with some dummy data for demonstration
        patients.add(new Patient(1, "Hritik ", "New Delhi", "1234", 500));
        patients.add(new Patient(2, "Ramanujan", "Vishakhapattnam", "5678", 1000));
    }

    // Methods
    public void addPatient(Patient patient) {
        patients.add(patient);
    }

    public Patient getPatientById(int patientId) {
        for (Patient patient : patients) {
            if (patient.getPatientId() == patientId) {
                return patient;
            }
        }
        return null; // Patient not found
    }

    public List<Patient> getAllPatients() {
        return patients;
    }

    // Other methods for data access can be added here
}
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
/*	public ArrayList<Patient> fetchPatient() throws SQLException {
		String query = "Select * from Student";
		ArrayList<Patient> list = new ArrayList<>();
		try {
			Class.forName("com.mysql.cj.jdbc.Driver");
		} catch (ClassNotFoundException e) {
			e.printStackTrace();
		}
		String userName = "root";
		String password = "root";
		String url = "jdbc:mysql://localhost:3306/db1";

		Connection con = null;
		PreparedStatement pst = null;
		ResultSet rst = null;
		try {
			con = DriverManager.getConnection(url, userName, password);
			pst = con.prepareStatement(query);
			rst = pst.executeQuery();
			while (rst.next()) {
				Integer pId = rst.getInt("patientId");
				String pName = rst.getString("patientName");
				String pAddress = rst.getString("patientAddress");
				String pPhone = rst.getString("patientPhone");
				double pBill = rst.getDouble("patientBill");

				
				Patient s1 = new Patient(pId, pName, pAddress, pPhone, pBill);
				list.add(s1);
			}
		} catch (SQLException e) {
			e.printStackTrace();
		} finally {
			rst.close();
			pst.close();
			con.close();
		}
		return list;

	}*/


