package Exercise04;

import java.util.Scanner;

public class CompanyProfits {
    public static void main(String[] args) {
        float[] arrayMonth = new float[12];
        float sum = 0;
        Scanner month = new Scanner(System.in);

        for (int i = 0; i < 12; i++) {
            System.out.printf("Profit for manth " + (i + 1) + " : ");
            arrayMonth[i] = month.nextFloat();
            sum = sum + arrayMonth[i];
        }
        System.out.println("Total profits for 12 month: " + sum);
    }

}
