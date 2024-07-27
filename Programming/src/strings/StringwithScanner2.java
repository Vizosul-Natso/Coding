package strings;

import java.util.Scanner;

public class StringwithScanner2 {
	
	public static void main(String[] args) {
		
		String str,str1;
		
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter any two string");
		str = sc.next();
		str1 = sc.nextLine();
		
		
		System.out.println(str + " " + str.length());
		System.out.println(str1 + " " + str1.length());
	
	}

}
