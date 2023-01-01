import java.util.Scanner;

public class Exercise04 {
    public static void main(String[] args) {
        Scanner convert=new Scanner(System.in);
        System.out.println("Prgram for converting money in Riels to Dollars.");
        System.out.println("Converstin rate is:1 USE = 4000 Riels");
        System.out.printf("Please input money in Riels:");

        float Riels=convert.nextInt();
        int convertFloatToInteger=(int)Riels;
        float use=Riels/4000;

        System.out.printf("\n"+convertFloatToInteger+"="+use+"USD.\n");
       
    }
}
