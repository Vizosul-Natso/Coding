package Basic;

import java.util.Scanner;

public class PrimeNumber {
	
	public static void main(String[] args) {
		
		int no;
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Enter any no");
		no = sc.nextInt();
		
		String answer = ( (no!=2 && no!=3 && no!=5) && ( no%2==0 || no%3==0 || no%5==0 )? "Not Prime"  : "Prime");
		
		System.out.println(answer);
	}

}
