package Basic;

import java.util.Scanner;

public class PrimeNthPos {
    public static void main(String[] args) {
        int n;
        int count = 0;
        int num = 1;
        int nthPrime = 0;
        
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Enter the prime no postion");
		n = sc.nextInt();
        
        while (count < n) {
            num++;
            if (isPrime(num)) {
                count++;
                nthPrime = num;
            }
        }
        
        System.out.println("The " + n + "th prime number is: " + nthPrime);
    }

    public static boolean isPrime(int num) {
        if (num <= 1) return false; // 1 and less are not prime numbers
        for (int i = 2; i <= Math.sqrt(num); i++) {
            if (num % i == 0) return false;
        }
        return true;
    }
}

