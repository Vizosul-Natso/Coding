package strings;

import java.util.Scanner;

public class ReverseString {
	
	public static void main(String[] args ) {
		
		String originalString, reversedString ="";
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Enter a String");
		originalString = sc.next();
		
		int length = originalString.length();
		
		for(int i=length-1; i>=0 ; i--) {
			reversedString = reversedString + originalString.charAt(i);
		}
		
		System.out.printf("Your reversed String is : %s",reversedString);
	}

}
