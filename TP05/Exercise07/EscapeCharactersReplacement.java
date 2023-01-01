package Exercise07;

import java.util.Scanner;

public class EscapeCharactersReplacement {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.printf("Please enter a sentence: ");
        String textInput = sc.nextLine();
        int length = textInput.length();
        String tmp = null;
        String textResult = "";
        for (int i = 0; i < length; i++) {

            if (textInput.charAt(i) == '\\') {
                if (textInput.charAt(i + 1) == 'n') {
                    tmp = "(new_line)";
                    i++;
                } else if (textInput.charAt(i + 1) == '\\') {
                    tmp = "(slash)";
                    i++;
                } else if (textInput.charAt(i + 1) == 't') {
                    tmp = "   (tab)";
                    i = i;
                }
            } else if (textInput.charAt(i) == '/' && textInput.charAt(i + 1) == '/') {
                tmp = "(commnet_line)";
                i++;
            } else if (textInput.charAt(i) == ':' && textInput.charAt(i + 1) == ')') {
                tmp = "(smile)";
                i++;
            } else if (textInput.charAt(i) == ' ') {
                tmp = " ";
                i = i;
            } else {
                tmp = "" + textInput.charAt(i);
            }

            textResult = textResult + tmp;
        }
        System.out.println(textResult);

    }
}
