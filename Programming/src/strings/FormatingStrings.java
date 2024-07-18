package strings;

import java.awt.desktop.PrintFilesEvent;

public class FormatingStrings {
	
	public static void main(String[] args) {
		
		String name = "Natso";
		int age = 27;
		String role = "Developer";
		float sal = 67999.99f;
		
		String formated = String.format("Hello! I am %s.\nI am %d years old. \nI am a %s. \nMy salary is Rs %f ", name, age, role, sal);
		System.out.println(formated);
		
	}

}
