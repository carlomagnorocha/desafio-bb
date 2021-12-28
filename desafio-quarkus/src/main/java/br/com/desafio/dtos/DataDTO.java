package br.com.desafio.dtos;

public class DataDTO {
	
	private String countryId;
	private String countryValue;
	private String countryiso3code;
	private String date;
	private Double value;
	
	
	public DataDTO() {}
	
	public DataDTO(String countryId, String countryValue, String countryiso3code, String date, Double value) {
		super();
		this.countryId = countryId;
		this.countryValue = countryValue;
		this.countryiso3code = countryiso3code;
		this.date = date;
		this.value = value;
	}
	

	public String getCountryId() {
		return countryId;
	}

	public void setCountryId(String countryId) {
		this.countryId = countryId;
	}

	public String getCountryValue() {
		return countryValue;
	}

	public void setCountryValue(String countryValue) {
		this.countryValue = countryValue;
	}

	public String getCountryiso3code() {
		return countryiso3code;
	}

	public void setCountryiso3code(String countryiso3code) {
		this.countryiso3code = countryiso3code;
	}

	public String getDate() {
		return date;
	}

	public void setDate(String date) {
		this.date = date;
	}

	public Double getValue() {
		return value;
	}

	public void setValue(Double value) {
		this.value = value;
	}
	
}
