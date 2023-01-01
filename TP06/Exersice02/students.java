package Exersice02;

import java.util.ArrayList;
import java.util.Scanner;

public class students {
    private int ID;
    private String name;

    /* Array of link lis */
    ArrayList<students> students_list = new ArrayList<>();

    public students() {
        students_list = new ArrayList<>();
    }

    public students(int ID, String name) {
        this.ID = ID;
        this.name = name;
    }

    /* Set and return a ID */
    public void setID(int ID) {
        this.ID = ID;
    }

    public int getID() {
        return ID;
    }

    /* Set string and return string name */
    public void setName(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    // method choice
    public void choice() {
        System.out.println("\n.............................");
        System.out.println(":  1.Add new students       :");
        System.out.println(":  2.List students          :");
        System.out.println(":  3.Remove student by name :");
        System.out.println(":  4.Update student by id   :");
        System.out.println(":  5.Exit                   :");
        System.out.println(".............................");
    }

    // method add
    public void addStudents(int[] ID, String[] name, int index) {
        for (int i = 0; i < index; i++) {
            // if we want to add we used namelinklist.add(index,new .....)
            students_list.add(i, new students(ID[i], name[i]));

        }
    }

    // method list
    public void listStudents() {
        System.out.println("\n----Show list of students----");
        System.out.println("ID\t\tName");
        for (students students : students_list) {
            System.out.println(students.getID() + "\t\t" + students.getName());
        }
    }

    // method remove
    public void removeStudentByName() {
        int counter = 0;
        Scanner sc = new Scanner(System.in);
        System.out.printf("remove student by name : ");
        String name = sc.next();
        students_list.removeIf(students -> students.name.equals(name));
        counter = counter + 1;
        if (counter >= 1) {
            System.out.println("\nDeleted !!!");
        } else {
            System.out.println("\nIt's can't delete !!!");
        }
    }

    // method update
    public void updateInfoStudents() {
        int index = 0;
        Scanner sc = new Scanner(System.in);
        System.out.printf("\nupdata info of student by id: ");
        int ID = sc.nextInt();
        for (students students : students_list) {
            // let int oldID equal old id value
            int oldID = students.getID();
            if (ID == oldID) {
                System.out.printf("Input student new ID  : ");
                int newID = sc.nextInt();
                System.out.printf("Input student new name: ");
                String newName = sc.next();
                // if we want to update we used namelinklist.set(index,new .....)
                students_list.set(index, new students(newID, newName));
            } else {
                index = index + 1;
            }
        }
    }
}
