package com.controller;

import com.entity.Patient;
import com.service.PatientService;

import java.util.List;
import java.util.Scanner;

public class PatientController {

    private PatientService patientService = new PatientService();
    private Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {
        PatientController patientController = new PatientController();
        patientController.run();
    }

    public void run() {
        int choice;
        do {
            printMenu();
            System.out.print("Enter your choice: ");
            choice = scanner.nextInt();
            scanner.nextLine(); // Consume the newline character

            switch (choice) {
                case 1:
                    newAdmission();
                    break;
                case 2:
                    searchPatientDetails();
                    break;
                case 3:
                    generateBill();
                    break;
                case 4:
                    viewAllPatients();
                    break;
                case 0:
                    System.out.println("Exiting the program. Goodbye!");
                    break;
                default:
                    System.out.println("Invalid choice. Please enter a valid option.");
            }
        } while (choice != 0);
    }

    private void printMenu() {
        System.out.println("Diagnostic Management System:");
        System.out.println("----------------------------");
        System.out.println("1. New Admission");
        System.out.println("2. Search Patient Details");
        System.out.println("3. Generate Bill");
        System.out.println("4. View All Patients");
        System.out.println("0. Exit");
    }

    private void newAdmission() {
        System.out.print("Enter patient name: ");
        String name = scanner.nextLine();
        System.out.print("Enter patient address: ");
        String address = scanner.nextLine();
        System.out.print("Enter patient phone number: ");
        String phone = scanner.nextLine();

        Patient patient = new Patient(null, name, address, phone, 0.0);
        patientService.newAdmission(patient);
        System.out.println("New admission successful!");
    }

    private void searchPatientDetails() {
        System.out.print("Enter patient ID: ");
        int patientId = scanner.nextInt();
        scanner.nextLine(); // Consume the newline character

        Patient patient = patientService.searchPatientDetails(patientId);
        if (patient != null) {
            System.out.println("Patient details: " + patient);
        } else {
            System.out.println("Patient not found!");
        }
    }

    private void generateBill() {
        System.out.print("Enter patient ID: ");
        int patientId = scanner.nextInt();
        scanner.nextLine(); // Consume the newline character

        patientService.generateBill(patientId);
    }

    private void viewAllPatients() {
        List<Patient> patients = patientService.getAllPatients();
        if (patients.isEmpty()) {
            System.out.println("No patients found.");
        } else {
            System.out.println("All Patients:");
            for (Patient patient : patients) {
                System.out.println(patient);
            }
        }
    }
}

/*
 * static PatientService ps = new PatientService();
 * 
 * public static void getPatient() { try { ps.getpatient(); } catch
 * (SQLException e) { e.printStackTrace(); } }
 * 
 * public static void main(String[] args) {
 * 
 * }
 */