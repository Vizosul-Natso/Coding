package strings;

import java.util.Scanner;

public class StringwithScanner {
	
	public static void main(String[] args) {
		
		String name;
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("What is your Name?");
		name = sc.next();
		
		System.out.printf("\nHello %s. How may I help you?",name);
	}

}
