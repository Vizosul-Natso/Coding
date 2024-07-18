package Basic;

import java.util.Scanner;

public class PrimeList {
	
	public static void main(String[] args) {
		
		int no = 1, n ,count=0;
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Enter the amount of Prime Numbers");
		n = sc.nextInt();
		
		while(count < n) {
			if(isPrime(no)) {
				System.out.println(no);
				count++;
			}
			no++;
		}		
	}
	
    public static boolean isPrime(int num) {
        if (num <= 1) return false; 
        for (int i = 2; i <= Math.sqrt(num); i++) {
            if (num % i == 0) return false;
        }
        return true;
    }

}
