package day_1;

import java.util.Scanner;

public class LoginApplication {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String correctUsername = "admin";
        String correctPassword = "password";
        int maxAttempts = 3;
        int attempts = 0;

        while (attempts < maxAttempts) {
            System.out.print("Enter your Login name: ");
            String enteredUsername = scanner.nextLine();

            System.out.print("Enter your password: ");
            String enteredPassword = scanner.nextLine();

            if (correctUsername.equals(enteredUsername) && correctPassword.equals(enteredPassword)) {
                System.out.println("Welcome, " + correctUsername + "!");
                break;
            } else {
                attempts++;
                System.out.println("Invalid login attempt. Remaining attempts: " + (maxAttempts - attempts));
            }
        }

        if (attempts == maxAttempts) {
            System.out.println("Contact Admin. Too many unsuccessful login attempts.");
        }

        scanner.close();
    }
}

