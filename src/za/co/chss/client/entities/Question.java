package za.co.chss.client.entities;

public class Question {

	private String question;
	public String getQuestion() {
		return question;
	}

	public int getQuestionNumber() {
		return questionNumber;
	}

	private int questionNumber;
	
	public Question(int questionNumber, String question)
	{
		this.questionNumber = questionNumber;
		this.question = question;
	}
}
