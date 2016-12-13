package za.co.chss.client.entities;

public class Vitals {

	private String height;
	private String weight;
	private String BMI;
	private String temperature;
	private String pulse;
	private String respiratoryRate;
	private String bloodPressure;
	
	public Vitals(String height, String weight, String BMI, String temperature, String pulse, String respiratoryRate, String bloodPressure)
	{
		this.height = height;
		this.weight = weight;
		this.BMI = BMI;
		this.temperature = temperature;
		this.pulse = pulse;
		this.respiratoryRate = respiratoryRate;
		this.bloodPressure = bloodPressure;
	}

	public String getHeight() {
		return height;
	}

	public String getWeight() {
		return weight;
	}

	public String getBMI() {
		return BMI;
	}

	public String getTemperature() {
		return temperature;
	}

	public String getPulse() {
		return pulse;
	}

	public String getRespiratoryRate() {
		return respiratoryRate;
	}

	public String getBloodPressure() {
		return bloodPressure;
	}
}
