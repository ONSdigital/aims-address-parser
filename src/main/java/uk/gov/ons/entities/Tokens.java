package uk.gov.ons.entities;

import com.fasterxml.jackson.annotation.JsonAlias;

public class Tokens {

	@JsonAlias({ "OrganisationName"})
	private String organisationName;
	@JsonAlias("DepartmentName")
	private String departmentName;
	@JsonAlias("SubBuildingName")
	private String subBuildingName;
	@JsonAlias("BuildingName")
	private String buildingName;
	@JsonAlias("BuildingNumber")
	private String buildingNumber;
	@JsonAlias("PaoStartNumber")
	private String paoStartNumber;
	@JsonAlias("PaoStartSuffix")
	private String paoStartSuffix;
	@JsonAlias("PaoEndNumber")
	private String paoEndNumber;
	@JsonAlias("PaoEndSuffix")
	private String paoEndSuffix;
	@JsonAlias("SaoStartNumber")
	private String saoStartNumber;
	@JsonAlias("SaoStartSuffix")
	private String saoStartSuffix;
	@JsonAlias("SaoEndNumber")
	private String saoEndNumber;
	@JsonAlias("SaoEndSuffix")
	private String saoEndSuffix;
	@JsonAlias("StreetName")
	private String streetName;
	@JsonAlias("Locality")
	private String locality;
	@JsonAlias("TownName")
	private String townName;
	@JsonAlias("Postcode")
	private String postcode;
	@JsonAlias("PostcodeIn")
	private String postcodeIn;
	@JsonAlias("PostcodeOut")
	private String postcodeOut;
	
	public Tokens() {
		super();
	}
	
	public Tokens(String organisationName, String departmentName, String subBuildingName, String buildingName,
			String buildingNumber, String paoStartNumber, String paoStartSuffix, String paoEndNumber,
			String paoEndSuffix, String saoStartNumber, String saoStartSuffix, String saoEndNumber, String saoEndSuffix,
			String streetName, String locality, String townName, String postcode, String postcodeIn,
			String postcodeOut) {
		super();
		this.organisationName = organisationName;
		this.departmentName = departmentName;
		this.subBuildingName = subBuildingName;
		this.buildingName = buildingName;
		this.buildingNumber = buildingNumber;
		this.paoStartNumber = paoStartNumber;
		this.paoStartSuffix = paoStartSuffix;
		this.paoEndNumber = paoEndNumber;
		this.paoEndSuffix = paoEndSuffix;
		this.saoStartNumber = saoStartNumber;
		this.saoStartSuffix = saoStartSuffix;
		this.saoEndNumber = saoEndNumber;
		this.saoEndSuffix = saoEndSuffix;
		this.streetName = streetName;
		this.locality = locality;
		this.townName = townName;
		this.postcode = postcode;
		this.postcodeIn = postcodeIn;
		this.postcodeOut = postcodeOut;
	}

	public String getOrganisationName() {
		return organisationName != null ? organisationName : "";
	}

	public void setOrganisationName(String organisationName) {
		this.organisationName = organisationName;
	}

	public String getDepartmentName() {
		return departmentName != null ? departmentName : "";
	}

	public void setDepartmentName(String departmentName) {
		this.departmentName = departmentName;
	}

	public String getSubBuildingName() {
		return subBuildingName != null ? subBuildingName : "";
	}

	public void setSubBuildingName(String subBuildingName) {
		this.subBuildingName = subBuildingName;
	}

	public String getBuildingName() {
		return buildingName != null ? buildingName : "";
	}

	public void setBuildingName(String buildingName) {
		this.buildingName = buildingName;
	}

	public String getBuildingNumber() {
		return buildingNumber != null ? buildingNumber : "";
	}

	public void setBuildingNumber(String buildingNumber) {
		this.buildingNumber = buildingNumber;
	}

	public String getPaoStartNumber() {
		return paoStartNumber != null ? paoStartNumber : "";
	}

	public void setPaoStartNumber(String paoStartNumber) {
		this.paoStartNumber = paoStartNumber;
	}

	public String getPaoStartSuffix() {
		return paoStartSuffix != null ? paoStartSuffix : "";
	}

	public void setPaoStartSuffix(String paoStartSuffix) {
		this.paoStartSuffix = paoStartSuffix;
	}

	public String getPaoEndNumber() {
		return paoEndNumber != null ? paoEndNumber : "";
	}

	public void setPaoEndNumber(String paoEndNumber) {
		this.paoEndNumber = paoEndNumber;
	}

	public String getPaoEndSuffix() {
		return paoEndSuffix != null ? paoEndSuffix : "";
	}

	public void setPaoEndSuffix(String paoEndSuffix) {
		this.paoEndSuffix = paoEndSuffix;
	}

	public String getSaoStartNumber() {
		return saoStartNumber != null ? saoStartNumber : "";
	}

	public void setSaoStartNumber(String saoStartNumber) {
		this.saoStartNumber = saoStartNumber;
	}

	public String getSaoStartSuffix() {
		return saoStartSuffix != null ? saoStartSuffix : "";
	}

	public void setSaoStartSuffix(String saoStartSuffix) {
		this.saoStartSuffix = saoStartSuffix;
	}

	public String getSaoEndNumber() {
		return saoEndNumber != null ? saoEndNumber : "";
	}

	public void setSaoEndNumber(String saoEndNumber) {
		this.saoEndNumber = saoEndNumber;
	}

	public String getSaoEndSuffix() {
		return saoEndSuffix != null ? saoEndSuffix : "";
	}

	public void setSaoEndSuffix(String saoEndSuffix) {
		this.saoEndSuffix = saoEndSuffix;
	}

	public String getStreetName() {
		return streetName != null ? streetName : "";
	}

	public void setStreetName(String streetName) {
		this.streetName = streetName;
	}

	public String getLocality() {
		return locality != null ? locality : "";
	}

	public void setLocality(String locality) {
		this.locality = locality;
	}

	public String getTownName() {
		return townName != null ? townName : "";
	}

	public void setTownName(String townName) {
		this.townName = townName;
	}

	public String getPostcode() {
		return postcode != null ? postcode : "";
	}

	public void setPostcode(String postcode) {
		this.postcode = postcode;
	}

	public String getPostcodeIn() {
		return postcodeIn != null ? postcodeIn : "";
	}

	public void setPostcodeIn(String postcodeIn) {
		this.postcodeIn = postcodeIn;
	}

	public String getPostcodeOut() {
		return postcodeOut != null ? postcodeOut : "";
	}

	public void setPostcodeOut(String postcodeOut) {
		this.postcodeOut = postcodeOut;
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((buildingName == null) ? 0 : buildingName.hashCode());
		result = prime * result + ((buildingNumber == null) ? 0 : buildingNumber.hashCode());
		result = prime * result + ((departmentName == null) ? 0 : departmentName.hashCode());
		result = prime * result + ((locality == null) ? 0 : locality.hashCode());
		result = prime * result + ((organisationName == null) ? 0 : organisationName.hashCode());
		result = prime * result + ((paoEndNumber == null) ? 0 : paoEndNumber.hashCode());
		result = prime * result + ((paoEndSuffix == null) ? 0 : paoEndSuffix.hashCode());
		result = prime * result + ((paoStartNumber == null) ? 0 : paoStartNumber.hashCode());
		result = prime * result + ((paoStartSuffix == null) ? 0 : paoStartSuffix.hashCode());
		result = prime * result + ((postcode == null) ? 0 : postcode.hashCode());
		result = prime * result + ((postcodeIn == null) ? 0 : postcodeIn.hashCode());
		result = prime * result + ((postcodeOut == null) ? 0 : postcodeOut.hashCode());
		result = prime * result + ((saoEndNumber == null) ? 0 : saoEndNumber.hashCode());
		result = prime * result + ((saoEndSuffix == null) ? 0 : saoEndSuffix.hashCode());
		result = prime * result + ((saoStartNumber == null) ? 0 : saoStartNumber.hashCode());
		result = prime * result + ((saoStartSuffix == null) ? 0 : saoStartSuffix.hashCode());
		result = prime * result + ((streetName == null) ? 0 : streetName.hashCode());
		result = prime * result + ((subBuildingName == null) ? 0 : subBuildingName.hashCode());
		result = prime * result + ((townName == null) ? 0 : townName.hashCode());
		return result;
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Tokens other = (Tokens) obj;
		if (buildingName == null) {
			if (other.buildingName != null)
				return false;
		} else if (!buildingName.equals(other.buildingName))
			return false;
		if (buildingNumber == null) {
			if (other.buildingNumber != null)
				return false;
		} else if (!buildingNumber.equals(other.buildingNumber))
			return false;
		if (departmentName == null) {
			if (other.departmentName != null)
				return false;
		} else if (!departmentName.equals(other.departmentName))
			return false;
		if (locality == null) {
			if (other.locality != null)
				return false;
		} else if (!locality.equals(other.locality))
			return false;
		if (organisationName == null) {
			if (other.organisationName != null)
				return false;
		} else if (!organisationName.equals(other.organisationName))
			return false;
		if (paoEndNumber == null) {
			if (other.paoEndNumber != null)
				return false;
		} else if (!paoEndNumber.equals(other.paoEndNumber))
			return false;
		if (paoEndSuffix == null) {
			if (other.paoEndSuffix != null)
				return false;
		} else if (!paoEndSuffix.equals(other.paoEndSuffix))
			return false;
		if (paoStartNumber == null) {
			if (other.paoStartNumber != null)
				return false;
		} else if (!paoStartNumber.equals(other.paoStartNumber))
			return false;
		if (paoStartSuffix == null) {
			if (other.paoStartSuffix != null)
				return false;
		} else if (!paoStartSuffix.equals(other.paoStartSuffix))
			return false;
		if (postcode == null) {
			if (other.postcode != null)
				return false;
		} else if (!postcode.equals(other.postcode))
			return false;
		if (postcodeIn == null) {
			if (other.postcodeIn != null)
				return false;
		} else if (!postcodeIn.equals(other.postcodeIn))
			return false;
		if (postcodeOut == null) {
			if (other.postcodeOut != null)
				return false;
		} else if (!postcodeOut.equals(other.postcodeOut))
			return false;
		if (saoEndNumber == null) {
			if (other.saoEndNumber != null)
				return false;
		} else if (!saoEndNumber.equals(other.saoEndNumber))
			return false;
		if (saoEndSuffix == null) {
			if (other.saoEndSuffix != null)
				return false;
		} else if (!saoEndSuffix.equals(other.saoEndSuffix))
			return false;
		if (saoStartNumber == null) {
			if (other.saoStartNumber != null)
				return false;
		} else if (!saoStartNumber.equals(other.saoStartNumber))
			return false;
		if (saoStartSuffix == null) {
			if (other.saoStartSuffix != null)
				return false;
		} else if (!saoStartSuffix.equals(other.saoStartSuffix))
			return false;
		if (streetName == null) {
			if (other.streetName != null)
				return false;
		} else if (!streetName.equals(other.streetName))
			return false;
		if (subBuildingName == null) {
			if (other.subBuildingName != null)
				return false;
		} else if (!subBuildingName.equals(other.subBuildingName))
			return false;
		if (townName == null) {
			if (other.townName != null)
				return false;
		} else if (!townName.equals(other.townName))
			return false;
		return true;
	}

	@Override
	public String toString() {
		return "Tokens [organisationName=" + organisationName + ", departmentName=" + departmentName
				+ ", subBuildingName=" + subBuildingName + ", buildingName=" + buildingName + ", buildingNumber="
				+ buildingNumber + ", paoStartNumber=" + paoStartNumber + ", paoStartSuffix=" + paoStartSuffix
				+ ", paoEndNumber=" + paoEndNumber + ", paoEndSuffix=" + paoEndSuffix + ", saoStartNumber="
				+ saoStartNumber + ", saoStartSuffix=" + saoStartSuffix + ", saoEndNumber=" + saoEndNumber
				+ ", saoEndSuffix=" + saoEndSuffix + ", streetName=" + streetName + ", locality=" + locality
				+ ", townName=" + townName + ", postcode=" + postcode + ", postcodeIn=" + postcodeIn + ", postcodeOut="
				+ postcodeOut + "]";
	}
}
