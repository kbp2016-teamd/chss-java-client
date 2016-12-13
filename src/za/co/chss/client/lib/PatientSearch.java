package za.co.chss.client.lib;

import java.util.ArrayList;
import java.util.List;

import za.co.chss.client.entities.Area;
import za.co.chss.client.entities.Patient;
import za.co.chss.client.entities.Vitals;

public class PatientSearch {
	
	private ArrayList<Patient> listOfPatientsArea = new ArrayList<>();
	
	public ArrayList<Patient> getListOfPatients(Area area)
	{
		Vitals v1 = new Vitals("10", "10", "10", "10", "10", "10", "10");
		Patient p1 = new Patient("Patient1","P1Surname" , "1234567890123", "Male", 31 , "1985/01/01 ", "0812345678", "add1", "add2", v1);
		Patient p2 = new Patient("Patient2","P2Surname" , "1234567890123", "Female", 34 , "1982/02/02 ", "0812345678", "add1", "add3", v1);
		listOfPatientsArea.add(p1);
		listOfPatientsArea.add(p2);
		return listOfPatientsArea;
	}

}
