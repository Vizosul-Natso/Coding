package arrays;

import java.util.Arrays;

public class SwapAlternateArray {
	
public static void main(String[] args) {
		
		int[] arr = {1,4,7,6,5,3};
		int[] swap = new int[arr.length];
			
		for(int i = 0 ; i < arr.length-1 ; i+=2) {			
			int temp = arr[i];
			swap[i] = arr[i+1];
			swap[i+1] = temp;	
		}
		System.out.println(Arrays.toString(swap));
	}

}
