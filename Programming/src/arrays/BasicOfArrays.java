package arrays;

import java.util.Arrays;

public class BasicOfArrays {
	
	public static void main(String[] args) {
		
		int arr[] = new int[10];
		arr[0] = 5;
		arr[5] = 18;
		arr[9] = 10;
		
		System.out.println(arr[5]);
		System.out.println(Arrays.toString(arr));
		
		char[] cArray = new char[10];
		double[] dArray = new double[10];
		System.out.println(cArray[0]+ " char is null   --- " + dArray[0]);
	}

}
