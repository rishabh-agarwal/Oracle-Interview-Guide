package org.allergyProblem;

import java.util.*;

class Allergy {

	private String symptons;
	private String reporters;
	private Severity severity;
	private String diseaseName;

	// constructor
	public Allergy(String symptons, String reporters, Severity severity, String diseaseName) {
		super();
		this.symptons = symptons;
		this.reporters = reporters;
		this.severity = severity;
		this.diseaseName = diseaseName;
	}

	public String getDiseaseName() {
		return diseaseName;
	}

	public void setDiseaseName(String diseaseName) {
		this.diseaseName = diseaseName;
	}

	public String getSymptons() {
		return symptons;
	}

	public void setSymptons(String symptons) {
		this.symptons = symptons;
	}

	public String getReporters() {
		return reporters;
	}

	public void setReporters(String reporters) {
		this.reporters = reporters;
	}

	public Severity getSeverity() {
		return severity;
	}

	public void setSeverity(Severity severity) {
		this.severity = severity;
	}

}
