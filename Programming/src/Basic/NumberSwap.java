package Basic;

import java.util.Scanner;

public class NumberSwap {
	public static void main(String[] args) {
		int a, b, temp;
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Enter any two Numbers");
		a = sc.nextInt();
		b = sc.nextInt();
		
		System.out.printf("Numbers before swapping are %d & %d \n", a , b);
		
		a = a + b;
		b = a - b;
		a = a - b;
		
		System.out.printf("Numbers after swapping are %d & %d", a , b);
		
	}

}
