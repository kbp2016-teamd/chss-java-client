package za.co.chss.client.entities;

import java.lang.reflect.Field;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.concurrent.ExecutionException;

import za.co.chss.client.lib.DownloadDataTask;

public class DataClass {
	public static final String EMPTY_STRING = "";
	public static final String VALUE = "Value";
	public static final String ID = "ID";
	
	public static ArrayList<Patient> getAllCount(Area area) {
		AsyncParameters asyncParameters = new AsyncParameters();
		asyncParameters.requestType = AsyncParameters.REQUEST_TYPE_GET;
		asyncParameters.url = "patients/area";
		ArrayList<Patient> patients = new ArrayList<>();
		Site site = new Site("Area1");
		Patient patient = new Patient("","","","",0,"","",site);
		
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
	
	private static ArrayList<Patient> formatResultToPatientList(String resultString) {
		// TODO Auto-generated method stub
		return null;
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