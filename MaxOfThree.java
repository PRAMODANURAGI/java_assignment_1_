// A-1 Que.-3
import java.util.Scanner;

public class MaxOfThree {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Input three numbers from the user
        System.out.print("Enter the first number: ");
        int num1 = scanner.nextInt();

        System.out.print("Enter the second number: ");
        int num2 = scanner.nextInt();

        System.out.print("Enter the third number: ");
        int num3 = scanner.nextInt();

        // Find the maximum of the three numbers
        int max = num1; // Assume the first number is the largest

        if (num2 > max) {
            max = num2; // Update max if the second number is larger
        }

        if (num3 > max) {
            max = num3; // Update max if the third number is larger
        }

        // Print the maximum number
        System.out.println("The maximum of the three numbers is: " + max);
    }
}
