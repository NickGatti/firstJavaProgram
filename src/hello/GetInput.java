package hello;

import java.util.Scanner;

public class GetInput {
	
	Scanner scanner = new Scanner(System.in);
	
	public String getText(String inputQuestion) {
		System.out.println(inputQuestion);
		return scanner.nextLine();
	}
	
	public int getInt(String inputQuestion) {
		System.out.println(inputQuestion);
		return scanner.nextInt();
	}
}
