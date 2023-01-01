package Exersice03;

import java.util.Scanner;

public class representsPC {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        PC pc = new PC();
        // write are pc into a list
        pc.addAPC(1, "Good", "ASUS");
        pc.addAPC(2, "Good", "ASUS");
        pc.addAPC(3, "Demage", "DELL");
        pc.addAPC(4, "Good", "DELL");
        pc.addAPC(5, "Demage", "ASUS");
        pc.addAPC(6, "Demage", "ASUS");
        pc.addAPC(7, "Good", "DELL");
        pc.addAPC(8, "Good", "ASUS");
        pc.addAPC(9, "Good", "ASUS");
        pc.addAPC(10, "Demage", "DELL");
        pc.addAPC(11, "Good", "ASUS");
        pc.addAPC(12, "Good", "DELL");
        pc.addAPC(13, "Good", "ASUS");
        pc.addAPC(14, "Demage", "DELL");
        pc.addAPC(15, "Good", "ASUS");
        pc.addAPC(16, "Good", "ASUS");
        pc.addAPC(17, "Demage", "ASUS");
        pc.addAPC(18, "Good", "ASUS");
        pc.addAPC(20, "Good", "DELL");

        while (1 > 0) {
            // use the method choice from PC class
            pc.choice();
            System.out.printf("Choose an option : ");
            int option = sc.nextInt();

            switch (option) {
                case 1: {
                    pc.listAllPCs();
                    break;
                }
                case 2: {
                    pc.listAllDemagesPCs();
                    break;
                }
                case 3: {
                    pc.listAllGoodPCs();
                    break;
                }
                case 4: {
                    pc.markPCAsDemaged();
                    break;
                }
                case 5: {
                    pc.markPCNotAsDemaged();
                    break;
                }
                case 6: {
                    System.exit(6);
                }
            }
        }
    }
}
