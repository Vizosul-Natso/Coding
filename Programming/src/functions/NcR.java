package functions;

import java.util.Scanner;

public class NcR {
	
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter N & R values");
		int n = sc.nextInt();
		int r = sc.nextInt();
		
		int nr = n - r;
		int factN =factorial(n);
		int factR =factorial(r);
		int factNR =factorial(nr);
				
		int res = factN/ (factR * factNR);
		
		System.out.println(res);
	}
	public static int factorial(int x) {
		int fact = 1;
		for(int i = 1; i <= x; i++) {
			fact = fact * i;
		}
		return fact;
	}

}
