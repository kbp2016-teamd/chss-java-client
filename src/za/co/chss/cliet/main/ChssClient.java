package za.co.chss.cliet.main;

import java.util.ArrayList;

import za.co.chss.client.entities.Patient;
import za.co.chss.client.lib.PatientSearch;

public class ChssClient {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		PatientSearch patientSearch = new PatientSearch();
		ArrayList<Patient> patientList = new ArrayList<>();
		
		patientList = patientSearch.getListOfPatients(null);
		
		for(int i = 0 ; i < patientList.size(); i++)
		{
			System.out.println(patientList.get(i).getName());
		}

	}

}
