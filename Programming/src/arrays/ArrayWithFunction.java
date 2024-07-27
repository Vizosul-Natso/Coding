package arrays;

import java.util.Scanner;

public class ArrayWithFunction {
	
	public static int[] takeInput() {
		
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter size of array");
		int n = sc.nextInt();
		int arr[] = new int[n];
		
		for(int i = 0; i < n; i++) {
			
			System.out.printf("Enter element at %d index : \n", i );
			arr[i] = sc.nextInt();
		}
		return arr;
	}
	
	public static void printArr(int[] arr) {
		for(int i = 0; i < arr.length ;i++) {
			System.out.print(arr[i]);
		}
	}
	
	public static void main(String[] args) {
		int[] arr = takeInput();
		printArr(arr);
	}

}
