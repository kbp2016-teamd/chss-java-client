package za.co.chss.client.lib;

import com.google.gson.Gson;
import com.google.gson.GsonBuilder;
import com.google.gson.JsonArray;
import com.google.gson.JsonObject;

import za.co.chss.client.entities.Answer;
import za.co.chss.client.entities.Result;

public class Evaluation {
	
	private Answer answer = null;
	
	private Result result = null;

	public Result sendEvaluationAnswers(EvaluationAnswers evaluationAnswers)
	{
		//Gson json = new Gson();
		//String jsonResult =  json.toJson(evaluationAnswers);
		
		result = new Result("Test Recommendation");
		return result;
	}
	public Answer getAnswer() {
		return answer;
	}

	public void setAnswer(Answer answer) {
		this.answer = answer;
	}

}
