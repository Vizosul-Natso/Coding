package strings;

import java.util.Scanner;

public class DuplicateCharacters {
	
	public static void main(String[] args) {
		
		String str;
		
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter a String ");
		
		str = sc.next();
		
		char arr[] = str.toCharArray();
		int count = 0;
		
		System.out.println("The duplicate characters:");
		
		for(int i = 0; i<arr.length ; i++) {
			
			char a = arr[i];	
			
			for(int k = i+1; k<arr.length ; k++) {
				
				char b = arr[k];
				
				if(a == b && a != ' ') {
					
					count++;
					System.out.print("'"+a+"' ");
				}
			}
		}
		System.out.printf("\nNumber of duplicate characters is %d ",count);
		
		sc.close();
	}

}
