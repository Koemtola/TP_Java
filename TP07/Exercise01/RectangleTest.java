package Exercise01;

import java.util.Scanner;

public class RectangleTest {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.printf("Input a value width:");
        int w = sc.nextInt();
        System.out.printf("Input a value height:");
        int h = sc.nextInt();
        // We can do it on Rectangle class
        Rectangle rectangle = new Rectangle(w, h);

        System.out.println("This is a surface  :" + rectangle.surface());
        System.out.println("This is a perimeter: " + rectangle.perimeter());

    }

}
