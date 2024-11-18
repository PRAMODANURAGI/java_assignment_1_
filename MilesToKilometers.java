// A-1 Q-5
import java.util.Scanner;

public class MilesToKilometers {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Conversion factor: 1 mile = 1.60934 kilometers
        final double MILES_TO_KILOMETERS = 1.60934;

        // Prompt the user for input
        System.out.print("Enter distance in miles: ");
        double miles = scanner.nextDouble();

        // Convert miles to kilometers
        double kilometers = miles * MILES_TO_KILOMETERS;

        // Display the result
        System.out.printf("%.2f miles is equal to %.2f kilometers.%n", miles, kilometers);
    }
}
