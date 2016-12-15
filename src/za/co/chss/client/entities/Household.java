package za.co.chss.client.entities;

public class Household {
	
	private int householdID;
	private int siteID;
	private String dwellingAddress;
	private int totalNoMales;
	private int totalNoFemales;
	
	public int getHouseholdID() {
		return householdID;
	}
	public int getSiteID() {
		return siteID;
	}
	public String getDwellingAddress() {
		return dwellingAddress;
	}
	public int getTotalNoMales() {
		return totalNoMales;
	}
	public int getTotalNoFemales() {
		return totalNoFemales;
	}
	public void setHouseholdID(int householdID) {
		this.householdID = householdID;
	}
	public void setSiteID(int siteID) {
		this.siteID = siteID;
	}
	public void setDwellingAddress(String dwellingAddress) {
		this.dwellingAddress = dwellingAddress;
	}
	public void setTotalNoMales(int totalNoMales) {
		this.totalNoMales = totalNoMales;
	}
	public void setTotalNoFemales(int totalNoFemales) {
		this.totalNoFemales = totalNoFemales;
	}
}
