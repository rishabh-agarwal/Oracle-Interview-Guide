package org.allergyProblem;

import java.sql.Date;
import java.text.SimpleDateFormat;

class Medication {

	SimpleDateFormat dateFormat = new SimpleDateFormat("dd-MMM-yyyy");
	
	private String dosage;
	private float quantity;
	private String startDate;
	private Date endDate;
	private int frequency;
	
	public Medication(String dosage, String start, Date end) {
		this.dosage = dosage;
		this.startDate = start;
		this.endDate = end;
	}
	
	
	public Medication(String dosage, String start) {
		this.dosage = dosage;
		this.startDate = start;
	}
	

	public Medication(SimpleDateFormat dateFormat, String dosage, float quantity, String startDate, Date endDate,
			int frequency) {
		this.dateFormat = dateFormat;
		this.dosage = dosage;
		this.quantity = quantity;
		this.startDate = startDate;
		this.endDate = endDate;
		this.frequency = frequency;
	}

	public String getDosage() {
		return dosage;
	}

	public void setDosage(String dosage) {
		this.dosage = dosage;
	}

	public float getQuantity() {
		return quantity;
	}

	public void setQuantity(float quantity) {
		this.quantity = quantity;
	}

	public String getStartDate() {
		return startDate;
	}

	public void setStartDate(String startDate) {
		this.startDate = startDate;
	}

	public Date getEndDate() {
		return endDate;
	}

	public void setEndDate(Date endDate) {
		this.endDate = endDate;
	}

	public int getFrequency() {
		return frequency;
	}

	public void setFrequency(int frequency) {
		this.frequency = frequency;
	}
	
	
	
}
