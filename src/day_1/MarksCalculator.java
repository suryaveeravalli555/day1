package day_1;

import java.util.Scanner;

import java.util.Scanner;

public class MarksCalculator {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int totalMarks = 0;

        // Input and calculate total marks for each student
        for (int student = 0; student < 3; student++) {
            int studentTotal = 0;

            for (int subject = 0; subject < 3; subject++) {
                System.out.print("Enter marks for Student " + (char)('1' + student) + " in Subject " + (char)('A' + subject) + ": ");
                int marks = scanner.nextInt();
                studentTotal += marks;
            }

            totalMarks += studentTotal;

            double studentAverage = (double) studentTotal / 3;
            System.out.println("Total marks for Student " + (char)('A' + student) + ": " + studentTotal);
            System.out.println("Average marks for Student " + (char)('A' + student) + ": " + studentAverage);
            System.out.println();
        }

        // Calculate and display total and average marks for all students
        double averageAllStudents = (double) totalMarks / (3 * 3);

        System.out.println("Total marks for all students: " + totalMarks);
        System.out.println("Average marks for all students: " + averageAllStudents);

        // Close the scanner
        scanner.close();
    }
}
