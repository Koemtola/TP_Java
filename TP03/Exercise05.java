import java.util.Scanner;

public class Exercise05 {
    public static void main(String[] args) {
        Scanner duration = new Scanner(System.in);
        System.out.println("Program for calculating duration of trabel from ITC to Airport.");
        System.out.printf("Please input traffic jam factor(in percentage 0-100):");
        float trafficJamFactor = duration.nextFloat();
        trafficJamFactor = (100 - trafficJamFactor) / 100;
        float t = 7 / (30 * trafficJamFactor);
        float s = t * 3600;

        int totalsecond = Math.round(s);
        int h = totalsecond / 3600;
        int remainder = totalsecond % 3600;
        int minute = remainder / 60;
        int seconds = remainder % 60;
        System.out.printf("Travelling buration " + h + ":" + minute + ":" + seconds + "\n");
    }
}
