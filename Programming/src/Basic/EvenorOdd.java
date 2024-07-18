package Basic;

import java.util.Scanner;

public class EvenorOdd {
	public static void main(String[] args) {
		
		int no;
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Enter any number ");
		no = sc.nextInt();
		
		if(no%2 == 0) {
			System.out.printf("%d is an Even number",no);
		}else {
			System.out.printf("%d is an Odd number",no);
		}
	}

}
