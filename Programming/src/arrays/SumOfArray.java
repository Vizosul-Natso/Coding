package arrays;

import java.util.Scanner;

public class SumOfArray {
	
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter size of array");
		int n = sc.nextInt();
		int arr[] = new int[n];
		int sum = 0;
		
		for(int i = 0; i < n; i++) {
			
			System.out.printf("Enter element at %d index : \n", i );
			arr[i] = sc.nextInt();
		}
		
		for(int i = 0; i < n ;i++) {
			sum = sum + arr[i];
		}
		System.out.printf("Sum of nos in array is %d ",sum);
	}

}
