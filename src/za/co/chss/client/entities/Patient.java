package za.co.chss.client.entities;

public class Patient 
{
	public String Id;
	public String IdNumber;
	public String FirstName;
	public String Surname;
	public String DateOfBirth;
	public String Gender;
	public String Height;
	
	public String HouseHold;
	public String Address;
	public String Ward;
	public String Recommendation;
	public String getId() {
		return Id;
	}
	public String getIdNumber() {
		return IdNumber;
	}
	public String getFirstName() {
		return FirstName;
	}
	public String getSurname() {
		return Surname;
	}
	public String getDateOfBirth() {
		return DateOfBirth;
	}
	public String getGender() {
		return Gender;
	}
	public String getHeight() {
		return Height;
	}
	public String getHouseHold() {
		return HouseHold;
	}
	public String getAddress() {
		return Address;
	}
	public String getWard() {
		return Ward;
	}
	public String getRecommendation() {
		return Recommendation;
	}
	public void setId(String id) {
		Id = id;
	}
	public void setIdNumber(String idNumber) {
		IdNumber = idNumber;
	}
	public void setFirstName(String firstName) {
		FirstName = firstName;
	}
	public void setSurname(String surname) {
		Surname = surname;
	}
	public void setDateOfBirth(String dateOfBirth) {
		DateOfBirth = dateOfBirth;
	}
	public void setGender(String gender) {
		Gender = gender;
	}
	public void setHeight(String height) {
		Height = height;
	}
	public void setHouseHold(String houseHold) {
		HouseHold = houseHold;
	}
	public void setAddress(String address) {
		Address = address;
	}
	public void setWard(String ward) {
		Ward = ward;
	}
	public void setRecommendation(String recommendation) {
		Recommendation = recommendation;
	}
}
