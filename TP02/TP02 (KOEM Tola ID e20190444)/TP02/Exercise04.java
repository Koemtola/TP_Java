import java.util.Scanner;

public class Exercise04 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.printf("Please input a positve number:");
        int numberIn = sc.nextInt();
        int hundred = numberIn / 100;
        System.out.println("There are " + hundred + " hundred in number " + numberIn + "\n");
    }
}
