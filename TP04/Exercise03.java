import java.util.Scanner;

public class Exercise03 {
    public static void reverseNumber(int number) {
        if (number < 10) {
            // prints the same number if the number is less than 10
            System.out.println(number);
            return;
        } else {
            System.out.print(number % 10);
            reverseNumber(number / 10);
        }
    }

    public static void main(String args[]) {
        // Input values
        Scanner sc = new Scanner(System.in);
        System.out.println("Program for reversing a 4 digits number.");
        System.out.print("Please input 4 digits number: ");
        int num = sc.nextInt();
        int number = num;

        int count = 0;
        // find digits of the number
        while (number > 0) {
            number = number / 10;
            count = count + 1;
        }
        // display if the number are 4 digits
        if (count == 4) {
            System.out.printf("After reverse: ");
            // method calling
            reverseNumber(num);
        } else {
            System.out.println("Error: invalid number,please input only 4 digits number,\n\n");
        }
    }
}
