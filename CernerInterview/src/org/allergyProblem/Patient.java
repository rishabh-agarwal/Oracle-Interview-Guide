package org.allergyProblem;

import java.util.ArrayList;
import java.util.List;

class Patient extends Person {

	private List<Allergy> allergies;
	private List<Medication> medications;
	

	public Patient(String name, String phoneNumber, String emailAddress, Address address, List<Allergy> allergies) {
		super(name, phoneNumber, emailAddress, address);
		this.allergies = allergies;
	}

	@Override
	public String toString() {
		return "Patient [allergies=" + allergies + ", getAllergies()=" + getAllergies() + ", getName()=" + getName()
				+ ", getPhoneNumber()=" + getPhoneNumber() + ", getEmailAddress()=" + getEmailAddress()
				+ ", getAddress()=" + getAddress() + ", getClass()=" + getClass() + ", hashCode()=" + hashCode()
				+ ", toString()=" + super.toString() + "]";
	}

	public List<Allergy> getAllergies() {
		return allergies;
	}

	public void setAllergies(List<Allergy> allergies) {
		this.allergies = allergies;
	}

}
