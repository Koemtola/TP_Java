package Exersice03;

import java.util.ArrayList;
import java.util.Scanner;

public class PC {
    private int PCno;
    private String PCcondition;
    private String PCdname;
    // Create list in array
    ArrayList<PC> list_pc = new ArrayList<PC>();

    public PC() {
        list_pc = new ArrayList<>();
    }

    public PC(int PCno, String PCcondition, String PCname) {
        this.PCno = PCno;
        this.PCcondition = PCcondition;
        this.PCdname = PCname;
    }

    /*
     * public void setPCno(int PCno) {
     * this.PCno = PCno;
     * }
     * 
     * public int getPCno() {
     * return PCno;
     * }
     * 
     * public void setPCcondition(String PCcondition) {
     * this.PCcondition = PCcondition;
     * }
     * 
     * public String getPCcondition() {
     * return PCcondition;
     * }
     * 
     * public void setPCname(String PCname) {
     * this.PCdname = PCname;
     * }
     * 
     * public String getPCname() {
     * return PCdname;
     * }
     */

    public void choice() {
        System.out.println("\n...............................");
        System.out.println(":  1.List all PCs             :");
        System.out.println(":  2.List all damages PCs     :");
        System.out.println(":  3.List all good PCs        :");
        System.out.println(":  4.Mark a PC as damaged     :");
        System.out.println(":  5.Mark a PC as not demaged :");
        System.out.println(":  6.Quit                     :");
        System.out.println("...............................");
    }

    // method write
    public void addAPC(int PCno, String PCcondition, String PCname) {
        list_pc.add(new PC(PCno, PCcondition, PCname));
    }

    // method read
    public void listAllPCs() {
        System.out.println("PCno\t\tPCname\t\tPCdemage");
        for (PC pc : list_pc) {
            System.out.printf(" %d\t\t%s\t\t%s\n", pc.PCno, pc.PCcondition, pc.PCdname);
        }
    }

    // method list all demages
    public void listAllDemagesPCs() {
        for (PC pc : list_pc) {
            System.out.println("PCno\t\tPCname\t\tPCdemage");
            if (pc.PCcondition.equals("Demage")) {
                System.out.printf(" %d\t\t%s\t\t%s\n", pc.PCno, pc.PCcondition, pc.PCdname);
            }
        }
    }

    // method list all good
    public void listAllGoodPCs() {
        for (PC pc : list_pc) {
            System.out.println("PCno\t\tPCname\t\tPCdemage");
            if (pc.PCcondition == "Good") {
                System.out.printf(" %d\t\t%s\t\t%s\n", pc.PCno, pc.PCcondition, pc.PCdname);
            }
        }
    }

    // method mark a pc as demaged
    public void markPCAsDemaged() {
        Scanner sc = new Scanner(System.in);
        System.out.printf("Input id PC has gotten demage :");
        int id = sc.nextInt();
        int index = 0;
        for (PC pc : list_pc) {
            if (id == pc.PCno) {
                System.out.printf("Input brand of PC :");
                String brand = sc.next();
                list_pc.set(index, new PC(id, PCcondition = "Good", brand));
            } else {
                index = index + 1;
            }
        }
    }

    // method mark a pc as not demaged
    public void markPCNotAsDemaged() {
        Scanner sc = new Scanner(System.in);
        System.out.printf("Input id PC has gotten not demage :");
        int id = sc.nextInt();
        int index = 0;
        for (PC pc : list_pc) {
            if (id == pc.PCno) {
                System.out.printf("Input brand of PC :");
                String brand = sc.next();
                list_pc.set(index, new PC(id, PCcondition = "Demage", brand));
            } else {
                index = index + 1;
            }
        }
    }
}
