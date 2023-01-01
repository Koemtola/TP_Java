import java.util.Scanner;

public class Exercise03 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Program for calculating euation 1/x=1/y+1/z");
        System.out.printf("Please input y:");
        Float y = sc.nextFloat();
        System.out.printf("Please input z:");
        Float z = sc.nextFloat();

        float Resulf = (y * z) / (z + y);
        System.out.println("Resulf:" + Resulf);

    }
}
