package Exercise05;

import java.util.Scanner;

public class Palindrome {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.printf("Please gives a word to check : ");
        String textInput = sc.nextLine();
        System.out.printf("choose method (REV/LOOP): ");
        String choose = sc.nextLine();
        String REV = "REV";
        String LOOP = "LOOP";
        if (choose.equals(REV)) {
            usingREV(textInput);
        } else if (choose.equals(LOOP)) {
            usingLOOP(textInput);
        }
    }

    public static void usingLOOP(String textInput) {
        String reverse = "";
        int length = textInput.length();
        for (int i = 0; i < textInput.length(); i++) {
            reverse = reverse + textInput.charAt(i);
        }
        if (textInput.equals(reverse)) {
            System.out.printf(textInput + " string is a palindrome.\n");
        } else {
            System.out.printf(textInput + " string isn't a palindrome.\n");
        }
    }

    public static void usingREV(String textInput) {
        StringBuilder textRevers = new StringBuilder();
        textRevers.append(textInput);
        textRevers.reverse();
        // convert stringbuider to string
        String convertToString = textRevers.toString();
        if (textInput.equals(convertToString)) {
            System.out.printf(textInput + " string is a palindrome.\n");
        } else {
            System.out.printf(textInput + " string isn't a palindrome.\n");
        }
    }
}