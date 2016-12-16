package za.co.chss.client.lib;

import java.io.IOException;
import java.util.ArrayList;

import org.codehaus.jackson.JsonGenerationException;
import org.codehaus.jackson.map.JsonMappingException;

import za.co.chss.client.entities.DataClass;
import za.co.chss.client.entities.Patient;

public class PatientCreation {
	
	public void createPatient(Patient patient) throws JsonGenerationException, JsonMappingException, IOException
	{
		DataClass.createPatient(patient);

	}


}
