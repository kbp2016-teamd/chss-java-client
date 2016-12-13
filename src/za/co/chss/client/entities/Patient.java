package za.co.chss.client.entities;

public class Patient 
{
	private String name;
	private String surname;
	private String idNumber;
	private String gender;
	private int age;
	private String dob;
	private String cellphone;
	private String addressLine1;
	private String addressLine2;
	private Vitals vitals;
		
	public Patient(String name, String surname, String idNumber, String gender, int age, String dob, String cellphone, String addressLine1, String addressLine2, Vitals vitals) {
		this.name = name;
		this.surname = surname;
		this.idNumber = idNumber;
		this.gender = gender;
		this.age = age;
		this.dob = dob;
		this.cellphone = cellphone;
		this.addressLine1 = addressLine1;
		this.addressLine2 = addressLine2;
		this.vitals = vitals;
	}

	public String getName() {
		return name;
	}

	public String getSurname() {
		return surname;
	}

	public String getIdNumber() {
		return idNumber;
	}

	public String getCellphone() {
		return cellphone;
	}

	public String getAddressLine1() {
		return addressLine1;
	}

	public String getAddressLine2() {
		return addressLine2;
	}
}
