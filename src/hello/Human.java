package hello;

import java.util.Scanner;

public class Human {
	GetInput getInput = new GetInput();
	
	String name;
	int age;
	int heightInInches;
	String eyeColor;
	String init;
	
	public Human() {
		this.name = getInput.getText("what is this new human's name?");
		this.eyeColor = getInput.getText("What is this new human's eye color?");
		this.age = getInput.getInt("What is the new human's age?");
		this.heightInInches = getInput.getInt("What is this new human's height in inches?");
	}
	
	public void speak() {
		System.out.println("Hello, my name is " + name);
		System.out.println("I am " + heightInInches + " inches tall.");
		System.out.println("I am " + age + " years old.");
		System.out.println("My eye color is " + eyeColor);
	}
	
	public void eat() {
		System.out.println("Eating...");
	}
	
	public void walk() {
		System.out.println("Walking...");
	}
	
	public void work() {
		System.out.println("Working");
	}
}
