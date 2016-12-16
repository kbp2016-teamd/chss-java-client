package za.co.chss.cliet.main;

import java.io.IOException;
import java.util.ArrayList;

import org.codehaus.jackson.JsonGenerationException;
import org.codehaus.jackson.map.JsonMappingException;

import za.co.chss.client.entities.Patient;
import za.co.chss.client.lib.PatientCreation;
import za.co.chss.client.lib.PatientSearch;

public class ChssClient {
	
	private static Patient patient;

	public static void main(String[] args) throws JsonGenerationException, JsonMappingException, IOException {
//		// TODO Auto-generated method stub
//		PatientSearch patientSearch = new PatientSearch();
//		//ArrayList<Patient> patientList = new ArrayList<>();
//		
//		ArrayList<Patient> patientList = patientSearch.getListOfPatients();
//		
//		for(int i = 0 ; i < patientList.size(); i++)
//		{
//			System.out.println(patientList.get(i).getFirstName());
//				
//		}
		
		patient = new Patient();
		patient.FirstName = "Sam";
		patient.Surname = "Tak";
		patient.Gender = "Female";
		patient.DateOfBirth = "1989/11/25";
		patient.Height = "155cm";
		patient.IdNumber = "8911251122345";
		patient.Address = "test";
		patient.Ward = "test";
		patient.HouseHold = "test";
		patient.Recommendation = "test";
		//patient.Id = "0";
		
		PatientCreation pc = new PatientCreation();
		pc.createPatient(patient);

	}

}
