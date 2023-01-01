import java.util.Scanner;

public class TP04 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("...........Menu...........");
        System.out.println(":  1.Prime number        :");
        System.out.println(":  2.Lucky number        :");
        System.out.println(":  3.Reverating number   :");
        System.out.println(":  4.Money Exchange      :");
        System.out.println(":  5.Max among 8 numbers :");
        System.out.println(":  6.Shipping            :");
        System.out.println(":  7.Leap Year           :");
        System.out.println(":  0.Exit                :");
        System.out.println(":.........................");
        int n = 1;
        while (n > 0) {
            System.out.println("\n.........................");
            System.out.printf("Choose an option: ");
            int option = sc.nextInt();
            switch (option) {
                case 1:
                    Exercise01.main(args);
                    break;
                case 2:
                    Exercise02.main(args);
                    break;
                case 3:
                    Exercise03.main(args);
                    break;
                case 4:
                    Exercise04.main(args);
                    break;
                case 5:
                    Exercise05.main(args);
                    break;
                case 6:
                    Exercise06.main(args);
                    break;
                case 7:
                    Exercise07.main(args);
                    break;
                case 0:
                    System.exit(0);
                    break;
            }
        }
    }

}