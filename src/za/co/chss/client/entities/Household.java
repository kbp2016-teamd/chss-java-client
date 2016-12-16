package za.co.chss.client.entities;

public class Household {
	
	private Site site;
	private String name;
	private String address;
	private String longitude;
	private String latitude;
	private int males;
	private int females;

	private int siteID;
	private int id;
	private String CreatedUser;
	private String CreatedDate;
	private String LastModifiedUser;
	private String LastModifiedDate;
	public Site getSite() {
		return site;
	}
	public String getName() {
		return name;
	}
	public String getAddress() {
		return address;
	}
	public String getLongitude() {
		return longitude;
	}
	public String getLatitude() {
		return latitude;
	}
	public int getMales() {
		return males;
	}
	public int getFemales() {
		return females;
	}
	public int getSiteID() {
		return siteID;
	}
	public int getId() {
		return id;
	}
	public String getCreatedUser() {
		return CreatedUser;
	}
	public String getCreatedDate() {
		return CreatedDate;
	}
	public String getLastModifiedUser() {
		return LastModifiedUser;
	}
	public String getLastModifiedDate() {
		return LastModifiedDate;
	}
	public void setSite(Site site) {
		this.site = site;
	}
	public void setName(String name) {
		this.name = name;
	}
	public void setAddress(String address) {
		this.address = address;
	}
	public void setLongitude(String longitude) {
		this.longitude = longitude;
	}
	public void setLatitude(String latitude) {
		this.latitude = latitude;
	}
	public void setMales(int males) {
		this.males = males;
	}
	public void setFemales(int females) {
		this.females = females;
	}
	public void setSiteID(int siteID) {
		this.siteID = siteID;
	}
	public void setId(int id) {
		this.id = id;
	}
	public void setCreatedUser(String createdUser) {
		CreatedUser = createdUser;
	}
	public void setCreatedDate(String createdDate) {
		CreatedDate = createdDate;
	}
	public void setLastModifiedUser(String lastModifiedUser) {
		LastModifiedUser = lastModifiedUser;
	}
	public void setLastModifiedDate(String lastModifiedDate) {
		LastModifiedDate = lastModifiedDate;
	}
	
//    "Name": "Midrand Area",
//    "Address": "1685 Midrand Road",
//    "Longitude": null,
//    "Latitude": null,
//    "Males": 2,
//    "Females": 10,
//    "SiteId": 1,
//    "Id": 3,
//    "CreatedUser": null,
//    "CreatedDate": null,
//    "LastModifiedUser": null,
//    "LastModifiedDate": null
	
	
}
