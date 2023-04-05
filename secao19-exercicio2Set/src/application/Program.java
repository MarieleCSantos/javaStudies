package application;

import entities.Student;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.time.Instant;
import java.util.*;

public class Program {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        List<String> courses = Arrays.asList("A", "B", "C");

        try {

            Set<Student> set = new HashSet<>();

            for (String course: courses) {
                System.out.print("How many students for course " + course + "? ");

                int students = sc.nextInt();
                for (int i = 0; i < students; i++) {
                    int student = sc.nextInt();
                    set.add(new Student(student));
                }
            }

            System.out.println("Total students: " + set.size());

        } catch (Exception e) {
            throw new RuntimeException(e);
        }

        sc.close();

    }
}