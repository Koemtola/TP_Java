import java.util.Scanner;

public class Exercise07 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.printf("Enter a year: ");
        int year = sc.nextInt();
        boolean leap = false;
        if (year < 1) {
            System.out.println(year + " error Message!!!\n\n");
        } else {
            if (year % 4 == 0) {
                if (year % 100 == 0) {
                    if (year % 400 == 0) {
                        leap = true;
                    } else {
                        leap = false;
                    }
                } else {
                    leap = true;
                }
            } else {
                leap = false;
            }
            if (leap) {
                System.out.println(year + " is a leap year.\n\n");
            } else {
                System.out.println(year + " is not a leap year.\n\n");
            }
        }
    }
}
