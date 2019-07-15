package hello;

import java.util.Scanner;

public class User {
	public String firstName;
	public String lastName;
	
	Scanner scanner = new Scanner(System.in);
	
	public String inputFirstName() {
		System.out.println("What is your first name?");
		return scanner.nextLine();
	}
	
	public String inputLastName() {
		System.out.println("What is your last name?");
		return scanner.nextLine();
	}
	
	public String getFullName() {
		return firstName + " " + lastName;
	}
}
