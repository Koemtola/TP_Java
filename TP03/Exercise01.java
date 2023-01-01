import java.util.Scanner;

public class Exercise01 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.printf("Input number of seconds:");
        int hour = sc.nextInt();
        int h = hour / 3600;
        int remainder = hour % 3600;
        int minute = remainder / 60;
        int seconds = remainder % 60;
        System.out.printf("Time corresponding to " + hour + " is " + h + ":" + minute + ":" + seconds + "\n");

    }
}
