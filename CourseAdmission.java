// A-1 Q-12
import java.util.Scanner;

public class CourseAdmission {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter the number of students: ");
        int n = scanner.nextInt(); // Number of students

        for (int i = 1; i <= n; i++) {
            System.out.println("\nEnter marks for Student " + i + ":");

            // Input marks for the three subjects
            System.out.print("Mathematics: ");
            int math = scanner.nextInt();

            System.out.print("Physics: ");
            int physics = scanner.nextInt();

            System.out.print("Chemistry: ");
            int chemistry = scanner.nextInt();

            // Check conditions
            boolean isEligible = false;

            int totalAllSubjects = math + physics + chemistry;
            int totalMathPhysics = math + physics;

            if (math >= 60 && physics >= 50 && chemistry >= 40) {
                if (totalAllSubjects >= 200 || totalMathPhysics >= 150) {
                    isEligible = true;
                }
            }

            // Display eligibility
            if (isEligible) {
                System.out.println("Student " + i + " is eligible for admission.");
            } else {
                System.out.println("Student " + i + " is NOT eligible for admission.");
            }
        }
    }
}
