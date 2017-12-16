package org.allergyProblem;

/*This class contain address and phoneNumber*/

class Address {

	private String addressLine1, city, state;
	private int zipCode;

	public Address(String addressLine1, String City, String State, int ZipCode) {
		addressLine1 = addressLine1;
		city = City;
		state = State;
		zipCode = ZipCode;
	}

	public String getAddressLine1() {
		return addressLine1;
	}

	public void setAddressLine1(String addressLine1) {
		this.addressLine1 = addressLine1;
	}

	public String getCity() {
		return city;
	}

	public void setCity(String city) {
		this.city = city;
	}

	public String getState() {
		return state;
	}

	public void setState(String state) {
		this.state = state;
	}

	public int getZipCode() {
		return zipCode;
	}

	public void setZipCode(int zipCode) {
		this.zipCode = zipCode;
	}

}
