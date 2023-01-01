package Exersice04;

import java.util.ArrayList;
import java.util.Scanner;

public class courses {
    private String coursName;
    private String catagery;
    private int coursID;
    // Create array link list
    ArrayList<courses> list_cours = new ArrayList<>();

    public courses() {
        list_cours = new ArrayList<>();
    }

    public courses(int coursID, String coursName, String catagery) {
        this.coursName = coursName;
        this.coursID = coursID;
        this.catagery = catagery;
    }

    public void choice() {
        System.out.println("\n............................");
        System.out.println(": 1. List all courses      :");
        System.out.println(": 2. Find a course by name :");
        System.out.println(": 3. Add a course          :");
        System.out.println(": 4. Quit                  :");
        System.out.println("............................");

    }

    public void addCoursesToarray(int coursID, String coursName, String cataString) {
        list_cours.add(new courses(coursID, coursName, cataString));
    }

    public void listCourses() {
        System.out.println("ID\tCourses\t\t\t\tCatagery");
        for (courses courses : list_cours) {
            System.out.printf("%d\t%s\t\t%.24s\n", courses.coursID, courses.coursName, courses.catagery);
        }
    }

    public void searchCourseByName() {
        Scanner sc = new Scanner(System.in);
        System.out.printf("Search cours by id: ");
        int S = sc.nextInt();
        System.out.println("ID\tCourses\t\t\t\tCatagery");
        for (courses courses : list_cours) {
            if (S == courses.coursID) {
                System.out.printf("%d\t%s\t\t%.24s\n", courses.coursID, courses.coursName, courses.catagery);
            }
        }
    }

    public void addNewCourse() {
        Scanner sc = new Scanner(System.in);
        // let id to auto add id
        int id = 0;
        System.out.printf("Input Couse name : ");
        String couseName = sc.next();
        for (courses courses : list_cours) {
            id = id + 1;
        }
        System.out.printf("Input a catagery(Coure/TP): ");
        String catagery = sc.next();
        list_cours.add(new courses(id + 1, couseName, catagery));

    }
}
