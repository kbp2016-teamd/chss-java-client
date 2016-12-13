package za.co.chss.client.entities;

public class Answer {

	private String answer;
	private int answerNumber;
	
	public String getAnswer() {
		return answer;
	}

	public int getAnswerNumber() {
		return answerNumber;
	}
	
	public Answer(int answerNumber, String answer)
	{
		this.answerNumber = answerNumber;
		this.answer = answer;
	}
}
