package za.co.chss.client.lib;

import java.util.ArrayList;
import za.co.chss.client.entities.DataClass;
import za.co.chss.client.entities.Patient;

public class PatientSearch {
	
	private ArrayList<Patient> listOfPatientsArea = new ArrayList<>();
	
	public ArrayList<Patient> getListOfPatients(){
		ArrayList<Patient> listOfPatientsArea = DataClass.getAllCount();		 
		return listOfPatientsArea;
	}

}
