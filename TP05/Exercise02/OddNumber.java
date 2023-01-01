package Exercise02;

import java.util.Scanner;

public class OddNumber {
    public static void main(String[] args) {
        boolean isOdd = true;
        String oddNumbersFound = "";

        Scanner sc = new Scanner(System.in);
        System.out.printf("Input number you want to check it: ");
        int numberInput = sc.nextInt();

        for (int i = 1; i <= numberInput; i++) {// Start loop 1 to numberInput
            isOdd = checkOddNumber(i);
            if (isOdd) {
                oddNumbersFound = oddNumbersFound + i + " "; // space
            }
        }
        // Print odd numbers from 1 to numberInput
        System.out.println(oddNumbersFound);
    }

    public static boolean checkOddNumber(int numberToCheck) {
        int remainder;
        for (int i = 1; i <= numberToCheck; i++) {
            remainder = numberToCheck % 2;
            if (remainder == 0) {
                return false;
            }
        }
        return true;
    }
}
