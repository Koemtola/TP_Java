package Exercise06;

import java.util.Scanner;

public class StringMirroring {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.printf("Please gives a word to check : ");
        String textInput = sc.nextLine();

        String reverse = "";
        int length = textInput.length();
        for (int i = 0; i < length; i++) {
            reverse = reverse + textInput.charAt(i);
        }
        System.out.println(textInput + reverse);
    }
}
