package Exersice02;

import java.util.Scanner;

/*if you want to create a lot of class in one file we can follow by:
 * class name(){
 * .............
 * }
*/
public class representsStudent {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        // use students class
        students students = new students();
        while (1 > 0) {
            // use the method name choice
            students.choice();
            System.out.printf("\nChoose a option:");
            int option = sc.nextInt();
            switch (option) {
                case 1: {
                    System.out.printf("How do you want to add student? :");
                    int index = sc.nextInt();
                    /* Create an array */
                    int[] ID = new int[index];
                    String[] name = new String[index];
                    for (int i = 0; i < index; i++) {
                        System.out.println("\n----Information of student " + i + 1 + "----");
                        System.out.printf("Input student ID   : ");
                        ID[i] = sc.nextInt();
                        System.out.printf("Input student name : ");
                        name[i] = sc.next();
                        students.setID(ID[i]);
                        students.setName(name[i]);
                    }
                    // input value into the method addStudents
                    students.addStudents(ID, name, index);
                    break;
                }

                case 2: {
                    // use the method listStudents
                    students.listStudents();
                    break;
                }
                case 3: {
                    // use the method removeStudentByID
                    students.removeStudentByName();
                    break;
                }
                case 4: {
                    // call the method removeStudentByID
                    students.updateInfoStudents();
                    break;
                }
                case 5: {
                    System.exit(5);
                }
            }
        }
    }
}
