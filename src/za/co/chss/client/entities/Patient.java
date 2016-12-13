package za.co.chss.client.entities;

public class Patient 
{
	private String name;
	private String surname;
	private String idNumber;
	private String cellphone;
	private String addressLine1;
	private String addressLine2;
		
	public Patient(String name, String surname, String idNumber, String cellphone, String addressLine1, String addressLine2) {
		this.name = name;
		this.surname = surname;
		this.idNumber = idNumber;
		this.cellphone = cellphone;
		this.addressLine1 = addressLine1;
		this.addressLine2 = addressLine2;
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
