import java.util.Scanner;
public class Exercise03 {
    public static void main(String[] args) {
        Scanner cost=new Scanner(System.in);
        System.out.println("Program for calculating cost of a call.");

        System.out.printf("Plesas input start hour:");
        int starthour=cost.nextInt();
        System.out.printf("Plesas input start minute:");
        int startminute=cost.nextInt();
        System.out.printf("Plesas input start second:");
        int startsecond=cost.nextInt();

        //Find total  seconds of start call
        int Sh=starthour*3600;
        int Sm=startminute*60;
        int Ss=startsecond;
        int Totalstart=Sh+Sm+Ss;

        System.out.printf("\nPlesas input end hour:");
        int endhour=cost.nextInt();
        System.out.printf("Plesas input end minute:");
        int endminute=cost.nextInt();
        System.out.printf("Plesas input end second:");
        int endsecond=cost.nextInt();

        //Find total seconds of end call
        int Eh=endhour*3600;
        int Em=endminute*60;
        int Es=endsecond;
        int TotalEnd=Eh+Em+Es;

        //Find total  cast of the call
        int totalCase=TotalEnd-Totalstart;
        double totalCaseOfTheCall=(totalCase/60)*0.05;

        //Convert seconds to h,m,s
        int convertH=totalCase/3600;
        int remainder=totalCase%3600;
        int convertM=remainder/60;
        int convertS=remainder%60;

        System.out.println("\nTotal call duration: "+convertH+" h "+convertM+" mn "+convertS+" s.");
        System.out.println("Total cost of this call:"+totalCaseOfTheCall+" $\n");

    }
}
