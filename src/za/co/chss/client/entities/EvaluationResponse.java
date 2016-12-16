package za.co.chss.client.entities;

import java.util.HashMap;

public class EvaluationResponse {
	
	private int ID;
	private HashMap<String, String > responses = new HashMap<String, String>();
	public int getID() {
		return ID;
	}
	public HashMap<String, String> getResponses() {
		return responses;
	}
	public void setID(int iD) {
		ID = iD;
	}
	public void setResponses(HashMap<String, String> responses) {
		this.responses = responses;
	}

}
