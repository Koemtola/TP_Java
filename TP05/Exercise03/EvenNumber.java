package Exercise03;

import java.util.Scanner;

public class EvenNumber {
    public static void main(String[] args) {
        boolean isEven = true;
        String evenNumbersFound = "";
        Scanner sc = new Scanner(System.in);
        System.out.printf("Input number you want to check it: ");
        int numberInput = sc.nextInt();
        // loop 1 to numberInput
        for (int i = 1; i <= numberInput; i++) {
            isEven = checkToEvenNumber(i);
            if (isEven) {
                evenNumbersFound = evenNumbersFound + i + " ";
            }
        }
        // Display 1 to numberInput
        System.out.println(evenNumbersFound);
    }

    public static boolean checkToEvenNumber(int inputToCheck) {
        int remainder;
        for (int i = 1; i < inputToCheck; i++) {
            remainder = inputToCheck % 2;
            if (remainder != 0) {
                return false;
            }
        }
        return true;
    }
}
