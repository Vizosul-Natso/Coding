package Basic;

import java.util.Scanner;

public class PrimeNum1 {
	public static void main(String[] args) {
		int x;
		int flag = 0;
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Enter any number");
		x = sc.nextInt();
		
		if(x <=1) {
			flag = 1;
		}
		
		for ( int i = 2; i <= Math.sqrt(x); i++ ) {
			if(x % i == 0 ) {
				flag = 1;
			}
		}
		
		if(flag!=0) {
			System.out.printf("%d is Not a Prime Number",x);
		}else
			System.out.printf("%d is a Prime Number",x);
		
		
	}
}
