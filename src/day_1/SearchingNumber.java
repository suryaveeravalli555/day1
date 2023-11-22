package day_1;

import java.util.Scanner;

public class SearchingNumber {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int[] numbers = {5, 14, 6, 19, 1, 37, 7, 52, 86, 47, 12, 78, 23, 26, 35};

        System.out.print("Enter a number to search: ");
        int searchNumber = scanner.nextInt();

        int index = -1;

        for (int i = 0; i < numbers.length; i++) {
            if (numbers[i] == searchNumber) {
                index = i;
                break;
            }
        }

        if (index != -1) {
            System.out.println(searchNumber + " is present in the numbers at index " + index + ".");
        } else {
            System.out.println(searchNumber + " is not present in the numbers.");
        }

        scanner.close();
    }
}

