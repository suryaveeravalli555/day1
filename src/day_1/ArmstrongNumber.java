package day_1;

import java.util.Scanner;

public class ArmstrongNumber {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter a number: ");
        int number = scanner.nextInt();

        int originalNumber = number;   //Store the original number for comparison later

        int n = String.valueOf(number).length();  // Calculate the number of digits in the input number by changing it into string

        int sum = 0;  //initially consider sum is 0

        while (number > 0) {
            int remainder = number % 10;  //'remainder = 153 % 10 = 3': Extract the last digit (3) from the number.

            sum += Math.pow(remainder, n);   //'sum += Math.pow(3, 3)': Add the cube of the digit (3^3) to the sum

            number /= 10;  //Remove the last digit from the number, 'leaving number = 15'
        }

        if (sum == originalNumber) {
            System.out.println(originalNumber + " is an Armstrong number.");
        } else {
            System.out.println(originalNumber + " is not an Armstrong number.");
        }

       scanner.close();
    }
}

