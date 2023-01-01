import java.util.Scanner;

public class Exercise01 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.printf("Input number to check whether it is prime number: ");
        int n = sc.nextInt();
        isPrime(n);
    }

    public static void isPrime(int n) {
        int count = 0;
        int divisible = 0;
        for (int i = 2; i <= n / 2; i++) {
            if (n % i == 0) {
                count++;
                divisible = i;
                break;
            }
        }
        if (count == 0 && n != 1) {
            System.out.printf(n + " It is  prime number.");
        } else {
            System.out.printf(n + " It is not prime number.");
            System.out.printf(" Beccause it is divisible to " + divisible + "\n\n");
        }
    }
}