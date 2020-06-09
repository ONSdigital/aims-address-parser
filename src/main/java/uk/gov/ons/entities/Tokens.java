package uk.gov.ons.entities;

import com.fasterxml.jackson.annotation.JsonAlias;

import lombok.AccessLevel;
import lombok.Data;
import lombok.Getter;

@Getter(value = AccessLevel.NONE)
public @Data class Tokens {

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

	public String getDepartmentName() {
		return departmentName != null ? departmentName : "";
	}

	public String getSubBuildingName() {
		return subBuildingName != null ? subBuildingName : "";
	}

	public String getBuildingName() {
		return buildingName != null ? buildingName : "";
	}

	public String getBuildingNumber() {
		return buildingNumber != null ? buildingNumber : "";
	}

	public String getPaoStartNumber() {
		return paoStartNumber != null ? paoStartNumber : "";
	}

	public String getPaoStartSuffix() {
		return paoStartSuffix != null ? paoStartSuffix : "";
	}

	public String getPaoEndNumber() {
		return paoEndNumber != null ? paoEndNumber : "";
	}

	public String getPaoEndSuffix() {
		return paoEndSuffix != null ? paoEndSuffix : "";
	}

	public String getSaoStartNumber() {
		return saoStartNumber != null ? saoStartNumber : "";
	}

	public String getSaoStartSuffix() {
		return saoStartSuffix != null ? saoStartSuffix : "";
	}

	public String getSaoEndNumber() {
		return saoEndNumber != null ? saoEndNumber : "";
	}

	public String getSaoEndSuffix() {
		return saoEndSuffix != null ? saoEndSuffix : "";
	}

	public String getStreetName() {
		return streetName != null ? streetName : "";
	}

	public String getLocality() {
		return locality != null ? locality : "";
	}

	public String getTownName() {
		return townName != null ? townName : "";
	}

	public String getPostcode() {
		return postcode != null ? postcode : "";
	}

	public String getPostcodeIn() {
		return postcodeIn != null ? postcodeIn : "";
	}

	public String getPostcodeOut() {
		return postcodeOut != null ? postcodeOut : "";
	}
}
