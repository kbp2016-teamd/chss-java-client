package za.co.chss.client.lib;

import java.io.IOException;

import org.codehaus.jackson.JsonGenerationException;
import org.codehaus.jackson.map.JsonMappingException;

import za.co.chss.client.entities.DataClass;
import za.co.chss.client.entities.EvaluationResponse;

public class EvaluationAnswers {

	public void evaluationResponse(EvaluationResponse evaluationResponse) throws JsonGenerationException, JsonMappingException, IOException{
		DataClass.createResponse(evaluationResponse);
	}
	
}
