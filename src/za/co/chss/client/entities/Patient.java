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
	private Site site;
		
	public Patient(String name, String surname, String idNumber, String gender, int age, String dob, String cellphone, Site site) {
		this.name = name;
		this.surname = surname;
		this.idNumber = idNumber;
		this.gender = gender;
		this.age = age;
		this.dob = dob;
		this.cellphone = cellphone;
		this.site = site;
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
	
	public String getGender() {
		return gender;
	}

	public int getAge() {
		return age;
	}

	public String getDob() {
		return dob;
	}

	public Site getSite() {
		return site;
	}
}
