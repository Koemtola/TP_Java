import java.util.Scanner;

public class Exercise02 {
    public static void main(String[] args) {
      
        Scanner time=new Scanner(System.in);
        System.out.println("Program for converting tiome to seconds");
        System.out.printf("Input input hours:");
        int h=time.nextInt();
        System.out.printf("Input input minutes:");
        int m=time.nextInt();
        System.out.printf("Input input seconds:");
        int s=time.nextInt();

        int hour=h*3600;
        int minute=m*60;
        int second=s;

        int secondTotal=hour+minute+second;

        System.out.printf("Number of seconds= "+h+"*3600 + "+m+"*60 + "+s+" = "+secondTotal+"\n");
        
    }
}
