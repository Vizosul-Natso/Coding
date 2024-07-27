package strings;

import java.util.Scanner;

public class PrintAllCharInString {
	
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		String str = "Hello I am Natso";
		
		for(int i = 0; i < str.length(); i++) {
			System.out.print(" "+str.charAt(i) + ",");
		}
	}

}
