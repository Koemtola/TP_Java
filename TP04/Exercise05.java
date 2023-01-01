import java.util.Scanner;

public class Exercise05 {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        int ArrayNum[] = new int[8];

        for (int i = 0; i < 8; i++) {
            System.out.printf("Input integer number (" + (i + 1) + "):");
            ArrayNum[i] = sc.nextInt();
        }
        int max = ArrayNum[0];
        for (int i = 0; i < 8; i++) {
            if (max < ArrayNum[i]) {
                max = ArrayNum[i];
            }
        }
        System.out.println("Maximum value in the array is:" + max + "\n\n");
    }
}
