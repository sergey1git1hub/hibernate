package dto;

import javax.persistence.Column;
import javax.persistence.Embeddable;


public class Address {
	private String street;
	@Column(name = "STREET_NAME")
	public String getStreet() {
		return street;
	}
	public void setStreet(String street) {
		this.street = street;
	}
	
	@Column(name = "CITY_NAME")
	public String getCity() {
		return city;
	}
	public void setCity(String city) {
		this.city = city;
	}
	@Column(name = "STATE_NAME")
	public String getState() {
		return state;
	}
	public void setState(String state) {
		this.state = state;
	}
	@Column(name = "PINCODE_NAME")
	public String getPincode() {
		return pincode;
	}
	public void setPincode(String pincode) {
		this.pincode = pincode;
	}
	private String city;
	private String state;
	private String pincode;
	

}
