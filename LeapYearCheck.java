// A-1 Q-6
import java.util.Scanner;

public class LeapYearCheck {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Prompt the user for input
        System.out.print("Enter a year: ");
        int year = scanner.nextInt();

        // Check if the year is a leap year
        boolean isLeapYear;

        if (year % 4 == 0) {
            if (year % 100 == 0) {
                // If divisible by 100, it must also be divisible by 400 to be a leap year
                isLeapYear = (year % 400 == 0);
            } else {
                isLeapYear = true;
            }
        } else {
            isLeapYear = false;
        }

        // Display the result
        if (isLeapYear) {
            System.out.println(year + " is a leap year.");
        } else {
            System.out.println(year + " is not a leap year.");
        }
    }
}
