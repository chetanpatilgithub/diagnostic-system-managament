package com.entity;

//import java.util.ArrayList;
//import java.util.List;

public class Patient {

	private Integer patientId;
	private String patientName;
	private String patientAddress;
	private String patientPhone;
//	private List<TestResult> testResults;
	private double patientBill;
	
/*	public void addTestResult(TestResult testResult) {
        if (testResults == null) {
            testResults = new ArrayList<>();
        }
        testResults.add(testResult);
    }*/
	
	public Patient() {
		super();
		// TODO Auto-generated constructor stub
	}

	public Patient(Integer patientId, String patientName, String patientAddress, String patientPhone,
			/*List<TestResult> testResults,*/ double patientBill) {
		super();
		this.patientId = patientId;
		this.patientName = patientName;
		this.patientAddress = patientAddress;
		this.patientPhone = patientPhone;
//		this.testResults = testResults;
		this.patientBill = patientBill;
	}

	public Integer getPatientId() {
		return patientId;
	}

	public void setPatientId(Integer patientId) {
		this.patientId = patientId;
	}

	public String getPatientName() {
		return patientName;
	}

	public void setPatientName(String patientName) {
		this.patientName = patientName;
	}

	public String getPatientAddress() {
		return patientAddress;
	}

	public void setPatientAddress(String patientAddress) {
		this.patientAddress = patientAddress;
	}

	public String getPatientPhone() {
		return patientPhone;
	}

	public void setPatientPhone(String patientPhone) {
		this.patientPhone = patientPhone;
	}

/*	public List<TestResult> getTestResults() {
		return testResults;
	}

	public void setTestResults(List<TestResult> testResults) {
		this.testResults = testResults;
	}*/

	public double getPatientBill() {
		return patientBill;
	}

	public void setPatientBill(double patientBill) {
		this.patientBill = patientBill;
	}

	@Override
	public String toString() {
		return "Patient [patientId=" + patientId + ", patientName=" + patientName + ", patientAddress=" + patientAddress
				+ ", patientPhone=" + patientPhone + ", patientBill=" + patientBill + "]";
	}

	
	
	
	
	
}
