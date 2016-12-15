package za.co.chss.client.entities;

public class Patient 
{
	private int householdID;
	public int getHouseholdID() {
		return householdID;
	}
	public int getPersonID() {
		return personID;
	}
	public String getName() {
		return name;
	}
	public String getSurname() {
		return surname;
	}
	public String getGender() {
		return gender;
	}
	public int getAge() {
		return age;
	}
	public void setHouseholdID(int householdID) {
		this.householdID = householdID;
	}
	public void setPersonID(int personID) {
		this.personID = personID;
	}
	public void setName(String name) {
		this.name = name;
	}
	public void setSurname(String surname) {
		this.surname = surname;
	}
	public void setGender(String gender) {
		this.gender = gender;
	}
	public void setAge(int age) {
		this.age = age;
	}
	private int personID;
	private String name;
	private String surname;
	private String gender;
	private int age;
		



}
