import java.util.Scanner;

public class Exercise04 {
    public static void main(String[] args) {
        System.out.println(".........................................");
        System.out.println(":  Welocome to program Money Exchanges! :");
        System.out.println(":  1.Riels to dollar                    :");
        System.out.println(":  2.Riels to Thai Baht                 :");
        System.out.println(":  3.Dollar to Riels                    :");
        System.out.println(":  4.Dollar to thai Baht                :");
        System.out.println(":  5.Thai Baht to Riels                 :");
        System.out.println(":  0.Exit                               :");
        System.out.println(".........................................");
        int n = 1;
        while (n > 0) {
            int x = 1;
            System.out.println("=========================================");

            System.out.printf(">> Choose an option : ");
            Scanner sc = new Scanner(System.in);
            int option = sc.nextInt();
            switch (option) {
                case 1:
                    RielToDollar();
                    break;
                case 2:
                    RielToThaiBaht();
                    break;
                case 3:
                    DollarToRiel();
                    break;
                case 4:
                    DollarToThaiBaht();
                    break;
                case 5:
                    ThaiBahtToRiel();
                    break;
                case 0:
                    System.exit(option);
                    break;
            }
        }
    }

    public static void RielToDollar() {
        System.out.printf("Input money in Riel: ");
        Scanner convert = new Scanner(System.in);
        float riel = convert.nextInt();
        int FloatToInteger = (int) riel;
        float USA = riel / 4000;
        System.out.println(FloatToInteger + " RIELS= " + USA + " USA.");
    }

    public static void RielToThaiBaht() {
        System.out.printf("Input money in Riel: ");
        Scanner convert = new Scanner(System.in);
        float Riel = convert.nextFloat();
        int FloatToInteger = (int) Riel;
        float ThaiBaht = (30 * Riel) / 4000;
        System.out.println(FloatToInteger + " Riels= " + ThaiBaht + " B");
    }

    public static void DollarToRiel() {
        System.out.printf("Input money in Dollar: ");
        Scanner convert = new Scanner(System.in);
        float dollar = convert.nextFloat();
        int FloatToInteger = (int) dollar;
        float RIEL = dollar * 4000;
        System.out.println(FloatToInteger + " Dollar= " + RIEL + " RIELS.");
    }

    public static void DollarToThaiBaht() {
        System.out.printf("Input money in Dollar: ");
        Scanner convert = new Scanner(System.in);
        float dollar = convert.nextFloat();
        int FloatToInteger = (int) dollar;
        float Baht = dollar * 30;
        System.out.println(FloatToInteger + " Dollar= " + Baht + " Baht.");
    }

    public static void ThaiBahtToRiel() {
        System.out.printf("Input money in Thai Baht: ");
        Scanner convert = new Scanner(System.in);
        float ThaiBaht = convert.nextFloat();
        // int FloatToInteger=(int)dollar;
        float Riel = (4000 * ThaiBaht) / 30;
        System.out.println(ThaiBaht + " Thai Baht= " + Riel + " Riels.");
    }
}
