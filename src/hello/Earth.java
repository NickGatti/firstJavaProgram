package hello;

import java.util.Scanner;

public class Earth {
	Scanner scanner = new Scanner(System.in);
	
	public void init() {
		System.out.println("Create a new humans? Y/N");
		String question = scanner.nextLine();
		if (question.equals("y") || question.equals("Y")) {
			System.out.println("How many humans?");
			int numberOfHumans = scanner.nextInt();
			Human[] humanArray;
			humanArray = new Human[numberOfHumans];
			for (int i = 0; i < humanArray.length; i++) {
				humanArray[i] = new Human();
			}
			for (int i = 0; i < humanArray.length; i++) {
				humanArray[i].speak();
			}
		} else {
			System.out.println("Earth without humans!");
		}
	}
}
