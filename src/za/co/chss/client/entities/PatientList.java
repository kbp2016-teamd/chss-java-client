package za.co.chss.client.entities;

import java.util.ArrayList;

public class PatientList {
	 private ArrayList<Patient> patients = new ArrayList<Patient>();

	public ArrayList<Patient> getPatients() {
		return patients;
	}

	public void setPatients(ArrayList<Patient> patients) {
		this.patients = patients;
	}
}
