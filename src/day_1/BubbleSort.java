package day_1;

public class BubbleSort {
    public static void main(String[] args) {
        int[] array = {5, 12, 14, 6, 78, 19, 1, 23, 26, 35, 37, 7, 52, 86, 47};
        int searchValue = 19;

        // Applying Bubble Sort
        for (int i = 0; i < array.length - 1; i++) {
            for (int j = 0; j < array.length - 1 - i; j++) {
                if (array[j] > array[j + 1]) {
                    // Swapping elements
                    int temp = array[j];
                    array[j] = array[j + 1];
                    array[j + 1] = temp;
                }
            }
        }

        // Searching for the value
        int index = binarySearch(array, searchValue);

        // Displaying the result
        if (index != -1) {
            System.out.println("Value " + searchValue + " found at index " + index);
        } else {
            System.out.println("Value " + searchValue + " not found in the array");
        }
    }

    // Binary search method
    private static int binarySearch(int[] array, int target) {
        int left = 0;
        int right = array.length - 1;

        while (left <= right) {
            int mid = left + (right - left) / 2;

            if (array[mid] == target) {
                return mid; // Element found
            } else if (array[mid] < target) {
                left = mid + 1; // Search the right half
            } else {
                right = mid - 1; // Search the left half
            }
        }

        return -1; // Element not found
    }
}
