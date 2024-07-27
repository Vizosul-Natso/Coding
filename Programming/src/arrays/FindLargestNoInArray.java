package arrays;

import java.util.Scanner;

public class FindLargestNoInArray {
	
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter size of array");
		int n = sc.nextInt();
		int arr[] = new int[n];
		int no = 0;
		int a = Integer.MIN_VALUE;
		
		for(int i = 0; i < n; i++) {
			
			System.out.printf("Enter element at %d index : \n", i );
			arr[i] = sc.nextInt();
		}
		
		for(int i = 0; i < n ;i++) {
			
			int k = 1; 
			while(k < n ) {
				if(arr[i] > arr[k]) {
					no = arr[i];
				}else
					no = arr[k];
				k++;
			}
		}
		System.out.printf("Largest NO of array is %d ",no);
		System.out.println(a);
	}

}
