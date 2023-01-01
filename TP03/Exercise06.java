import java.util.Scanner;

public class Exercise06 {
    public static void main(String[] args) {
        Scanner opt=new Scanner(System.in);
        System.out.println("--------Menu---------");
        System.out.println("1.Seconds to Time");
        System.out.println("2.Calling Cost");
        System.out.println("3.Tiels to Dollar");
        System.out.println("4.Traveling Duration");
        System.out.println("5.Exit");
       int n=1;
       while(n>0){
            System.out.printf("\nPlease chois the option: ");
            int chois=opt.nextInt();
            switch (chois) {
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
                }
            
        }
            
    }
}
