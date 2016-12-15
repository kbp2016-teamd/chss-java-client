package za.co.chss.client.entities;

public class Site {
	
private String siteCode;
private String name;
private int provinceID;
private int districtID;
private int localMunicipalityID;
private int wardID;

	public Site(String siteCode)
	{
		this.siteCode = siteCode;
	}

	public String getSiteCode() {
		return siteCode;
	}

	public String getName() {
		return name;
	}

	public int getProvinceID() {
		return provinceID;
	}

	public int getDistrictID() {
		return districtID;
	}

	public int getLocalMunicipalityID() {
		return localMunicipalityID;
	}

	public int getWardID() {
		return wardID;
	}

	public void setSiteCode(String siteCode) {
		this.siteCode = siteCode;
	}

	public void setName(String name) {
		this.name = name;
	}

	public void setProvinceID(int provinceID) {
		this.provinceID = provinceID;
	}

	public void setDistrictID(int districtID) {
		this.districtID = districtID;
	}

	public void setLocalMunicipalityID(int localMunicipalityID) {
		this.localMunicipalityID = localMunicipalityID;
	}

	public void setWardID(int wardID) {
		this.wardID = wardID;
	}

}
