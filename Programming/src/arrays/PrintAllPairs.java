package arrays;

public class PrintAllPairs {
	
	public static void main(String[] args) {
		
		int[] arr = {1,4,7,6,5};
		int counter = 1;
		for(int i = 0 ; i < arr.length-1 ; i++) {
			
			for(int k = i+1 ; k < arr.length; k++ ) {
				
				System.out.printf("Pair %d is %d & %d \n",counter,arr[i],arr[k]);
				counter++;
			}
			
		}
		
	}
	


}
