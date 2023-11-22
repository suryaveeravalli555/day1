
// finding armstrong numbers between 100 and 999
package day_1;

public class ArmstrongNumber2 {
    public static void main(String[] args) {
        for (int number = 100; number <= 999; number++) {
            int originalNumber = number;
            int n = String.valueOf(number).length();
            int sum = 0;

            int temp = number;
            while (temp > 0) {
                int remainder = temp % 10;
                sum += Math.pow(remainder, n);
                temp /= 10;
            }

            if (sum == originalNumber) {
                System.out.println(number);
            }
        }
    }
}
