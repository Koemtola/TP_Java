import java.util.Scanner;

public class Exercise02 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Program for caculating perimter and surface of a Rectangle.");
        System.out.printf("Please input width(in meter):");
        int width = sc.nextInt();
        System.out.printf("Please input height(in meter):");
        int height = sc.nextInt();

        int perimeter = (width + height) * 2;
        int surface = width * height;

        System.out.printf("\nPerimeter=(" + width + ")+(" + height + ")*2=" + perimeter + " m.\n");
        System.out.printf("Suface=" + width + "*" + height + "=" + surface + " m*2\n");

    }
}
