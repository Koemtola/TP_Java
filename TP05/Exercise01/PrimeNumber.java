package Exercise01;

import java.util.Scanner;

public class PrimeNumber {

    public static void main(String[] args) {
        boolean isPrime = true;
        String primeNumbersFound = "";

        Scanner number = new Scanner(System.in);
        System.out.printf("input number to list prime numbers from 2 it : ");
        int inPutToCheck = number.nextInt();

        for (int i = 2; i <= inPutToCheck; i++) {// Start loop 2 to inPutToCheck
            isPrime = CheckPrime(i);
            if (isPrime) {
                primeNumbersFound = primeNumbersFound + i + " "; // space
            }
        }
        // Print prime numbers from 1 to inPutToCheck
        System.out.println(primeNumbersFound + "are prime numbers.");
    }

    public static boolean CheckPrime(int numberToCheck) {
        int remainder;
        for (int i = 2; i <= numberToCheck / 2; i++) {
            remainder = numberToCheck % i;
            if (remainder == 0) {// if remainder is 0 than numberToCheckber is not prime and break loop. Else
                                 // continue loop
                return false;
            }
        }
        return true;
    }
}
