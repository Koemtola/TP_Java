import java.util.Scanner;

public class Exercise01 {
    public static void main(String[] args) {
        Scanner name = new Scanner(System.in);
        System.out.printf("Input your name:");
        String myName = name.nextLine();
        System.out.printf("Hello " + myName + "!");

    }
}