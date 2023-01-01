package Exersice04;

import java.lang.StackWalker.Option;
import java.util.Scanner;

public class representsAllcourses {
    public static void main(String[] args) {
        courses COURSES = new courses();
        COURSES.addCoursesToarray(1, "Network I", "Cours");
        COURSES.addCoursesToarray(2, "Intenet Programming I", "Cours");
        COURSES.addCoursesToarray(3, "Telecommunication", "Cours");
        COURSES.addCoursesToarray(4, "Software Engineering I", "Cours");
        COURSES.addCoursesToarray(5, "Advanced Database and DBMS", "Cours");
        COURSES.addCoursesToarray(6, "Operation Systems I", "Cours");
        COURSES.addCoursesToarray(7, "Network I", "TP");
        COURSES.addCoursesToarray(8, "Intenet Programming I", "TP");
        COURSES.addCoursesToarray(9, "Telecommunication", "TP");
        COURSES.addCoursesToarray(10, "Software Engineering I", "TP");
        COURSES.addCoursesToarray(11, "Advanced Database and DBMS", "TP");
        COURSES.addCoursesToarray(12, "Operation Systems I", "TP");
        while (1 > 0) {
            // use method choice
            COURSES.choice();
            Scanner sc = new Scanner(System.in);
            System.out.printf("Choose a option : ");
            int option = sc.nextInt();

            switch (option) {
                case 1: {
                    COURSES.listCourses();
                    break;
                }
                case 2: {
                    COURSES.searchCourseByName();
                    break;
                }
                case 3: {
                    COURSES.addNewCourse();
                    break;
                }
                case 4: {
                    System.exit(4);
                }

            }

        }
    }
}
