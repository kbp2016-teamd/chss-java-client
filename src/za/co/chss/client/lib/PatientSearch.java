package za.co.chss.client.lib;

import java.util.ArrayList;
import za.co.chss.client.entities.Area;
import za.co.chss.client.entities.DataClass;
import za.co.chss.client.entities.Patient;

public class PatientSearch {
	
	private ArrayList<Patient> listOfPatientsArea = new ArrayList<>();
	private DataClass data = null;
	
	public ArrayList<Patient> getListOfPatients(Area area){
		listOfPatientsArea = new ArrayList<>();
		listOfPatientsArea = data.getAllCount(area);		 
		return listOfPatientsArea;
	}

}
