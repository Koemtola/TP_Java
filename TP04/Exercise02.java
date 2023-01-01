import java.util.Scanner;

public class Exercise02 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Program for testing for lucky number.");
        System.out.printf("Please input 6 digits number: ");
        int n = sc.nextInt();
        // isValid(n);
        isLucky(n);
    }

    private static void isLucky(int n) {
        int sum = 0;
        int reminder = 0;
        int count = 0;
        while (n > 0) {
            reminder = n % 10;
            sum = sum + reminder;
            n = n / 10;
            count = count + 1;
        }
        if (count == 6) {
            if (sum % 2 == 0) {
                System.out.println(sum + " It is lucky number.");

            } else {
                System.out.println(sum + " It is not lucky number.");
            }
        } else {
            System.out.println("Invalid input number,please input only 6 digits number.");
        }
    }
}
