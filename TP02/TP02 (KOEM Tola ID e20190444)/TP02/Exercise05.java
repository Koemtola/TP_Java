import java.util.Scanner;

public class Exercise05 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Program for guessing your luckiness.");
        System.out.printf("Please input a positive number:");
        int numberIn = sc.nextInt();
        int Bigger = numberIn + 1;
        System.out.println("I got " + Bigger + ". I am Luckier.\n");
    }
}
