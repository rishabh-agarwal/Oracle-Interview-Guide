package org.allergyProblem;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

class Main {
	

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);

		System.out.println("Enter person name: ");
		String name = sc.nextLine();

		System.out.println("Enter phone number: ");
		String phn = sc.nextLine();

		System.out.println("Enter email address: ");
		String email = sc.nextLine();

		System.out.println("Enter street name: ");
		String street = sc.nextLine();

		System.out.println("Enter city: ");
		String city = sc.nextLine();

		System.out.println("Enter state: ");
		String state = sc.nextLine();

		System.out.println("Enter zipcode: ");
		int zipcode = sc.nextInt();

		Address adr1 = new Address(street, city, state, zipcode);

		Allergy al1 = new Allergy("coughing", "Arzoo", Severity.Low, "Regular cough");

		List<Allergy> allergies = new ArrayList<Allergy>();
		allergies.add(al1);

		Patient p1 = new Patient(name, phn, email, adr1, allergies);

		System.out.println(p1);
	}
}
