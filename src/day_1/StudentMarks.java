package day_1;

import java.util.Scanner;

public class StudentMarks {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Input marks for three students in three subjects
        int[][] marks = new int[3][3];

        for (int student = 0; student < 3; student++) {
            for (int subject = 0; subject < 3; subject++) {
                System.out.print("Enter marks for Student " + (char)('1' + student) + " in Subject " + (char)('A' + subject) + ": ");
                marks[student][subject] = scanner.nextInt();
            }
        }

        // Calculate and display total and average marks
        calculateTotalAndAverage(marks);

        // Close the scanner
        scanner.close();
    }

    private static void calculateTotalAndAverage(int[][] marks) {
        // Calculate total and average for each subject
        for (int subject = 0; subject < marks[0].length; subject++) {
            int total = 0;

            for (int student = 0; student < marks.length; student++) {
                total += marks[student][subject];
            }

            double average = (double) total / marks.length;

            System.out.println("Subject " + (char)('A' + subject) + ":");
            System.out.println("Total: " + total);
            System.out.println("Average: " + average);
            System.out.println();
        }

        // Calculate total and average for all subjects
        int totalAllSubjects = 0;

        for (int student = 0; student < marks.length; student++) {
            for (int subject = 0; subject < marks[0].length; subject++) {
                totalAllSubjects += marks[student][subject];
            }
        }

        double averageAllSubjects = (double) totalAllSubjects / (marks.length * marks[0].length);

        System.out.println("Total for all subjects: " + totalAllSubjects);
        System.out.println("Average for all subjects: " + averageAllSubjects);
    }
}

