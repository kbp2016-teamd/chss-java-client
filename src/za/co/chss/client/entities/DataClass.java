package za.co.chss.client.entities;

import java.io.IOException;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import org.codehaus.jackson.JsonGenerationException;
import org.codehaus.jackson.JsonParseException;
import org.codehaus.jackson.map.JsonMappingException;
import org.codehaus.jackson.map.ObjectMapper;

import com.google.gson.Gson;

import za.co.chss.client.lib.DownloadDataTask;

public class DataClass {
	public static final String EMPTY_STRING = "";
	public static final String VALUE = "Value";
	public static final String ID = "ID";
	private static Gson jsonResult = null;
	private static ObjectMapper mapper = null;
	
	public static void createResponse(EvaluationResponse evaluationResponse) throws JsonGenerationException, JsonMappingException, IOException {
		AsyncParameters asyncParameters = new AsyncParameters();
		asyncParameters.requestType = AsyncParameters.REQUEST_TYPE_POST;
		asyncParameters.url = "response/";
		
		DownloadDataTask downloadData = new DownloadDataTask();
	
		
		mapper = new ObjectMapper();

		//Object to JSON in String
		//String jsonInString = mapper.writeValueAsString(evaluationResponse);
		asyncParameters.parameters = new ArrayList<NameValPair>();
		asyncParameters.parameters.add(new NameValPair("id", evaluationResponse.getID())); 
		asyncParameters.parameters.add(new NameValPair("responses", evaluationResponse.getResponses())); 
		String resultString = downloadData.doInBackground(asyncParameters);
		
	}
	
	public static boolean createPatient(Patient patient) throws JsonGenerationException, JsonMappingException, IOException
	{
		AsyncParameters asyncParameters = new AsyncParameters();
		asyncParameters.requestType = AsyncParameters.REQUEST_TYPE_POST;
		asyncParameters.url = "patient/";
		
		DownloadDataTask downloadData = new DownloadDataTask();
	
		mapper = new ObjectMapper();

		//Object to JSON in String
		//String jsonInString = mapper.writeValueAsString(patient);
		asyncParameters.parameters = new ArrayList<NameValPair>();
		asyncParameters.parameters.add(new NameValPair("Id", patient.Id + ""));
		asyncParameters.parameters.add(new NameValPair( "IdNumber", patient.IdNumber ));
		asyncParameters.parameters.add(new NameValPair( "FirstName", patient.FirstName ));
		asyncParameters.parameters.add(new NameValPair( "Surname", patient.Surname ));
		asyncParameters.parameters.add(new NameValPair( "DateOfBirth", patient.DateOfBirth ));
		asyncParameters.parameters.add(new NameValPair( "Gender", patient.Gender ));
		asyncParameters.parameters.add(new NameValPair( "Height", patient.Height ));
		
		String resultString = downloadData.doInBackground(asyncParameters);
	
		return true;
	}
	
	public static ArrayList<Patient> getAllCount() {
		AsyncParameters asyncParameters = new AsyncParameters();
		asyncParameters.requestType = AsyncParameters.REQUEST_TYPE_GET;
		asyncParameters.url = "patient/";
		ArrayList<Patient> patients = new ArrayList<>();

		DownloadDataTask downloadData = new DownloadDataTask();

		try {
			String resultString = downloadData.doInBackground(asyncParameters);
			patients = DataClass.formatResultToPatientList(resultString);
			return patients;
		} catch (Exception e) {
			e.printStackTrace();
		}

		return null;
	}
	
	private static ArrayList<Patient> formatResultToPatientList(String resultString) throws JsonParseException, JsonMappingException, IOException {
		// convert json to Patient List
	
		jsonResult = new Gson();
		mapper = new ObjectMapper();
		
//		ArrayList<Patient> patients = new ArrayList<Patient>();
		//PatientList patientList = mapper.readValue(resultString, PatientList[].class);
		//PatientList patientList = mapper.readValue(resultString, PatientList.class);
		//ArrayList<Patient> patients = (ArrayList<Patient>) Arrays.asList(mapper.readValue(resultString.toString(), Patient[].class));
//		Patient patient = mapper.readValue(resultString, Patient.class);
//		patients.add(patient);
		
		
		ObjectMapper objectMapper = new ObjectMapper();
		Patient[] patients = objectMapper.readValue(resultString, Patient[].class);
		ArrayList<Patient> patientList = new ArrayList<Patient>(Arrays.asList(patients));
		return patientList;
	
	}

	public static String formatParameters(ArrayList<NameValPair> aParameters, String aRequestType) {
		String data = "";
		if(aParameters == null) {
			return data;
		}

		if(aRequestType.equalsIgnoreCase(AsyncParameters.REQUEST_TYPE_POST))
		{
			data += "{";

			for(int i = 0; i < aParameters.size(); i++)
			{
				data += "\'" + aParameters.get(i).key + "\':\'" + aParameters.get(i).value + "\'";
				if(i != aParameters.size()-1)
				{
					data += ",";
				}
			}

			data += "}";
		}
		else if(aRequestType.equalsIgnoreCase(AsyncParameters.REQUEST_TYPE_GET))
		{
			for(int i = 0; i < aParameters.size(); i++)
			{
				data += "" + aParameters.get(i).key + "=" + aParameters.get(i).value + "";
				if(i != aParameters.size()-1)
				{
					data += "&";
				}
			}
		}

		return data;
	}
}