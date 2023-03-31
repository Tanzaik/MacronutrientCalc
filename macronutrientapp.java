import java.util.Scanner;

public class MaintenanceCalories {
    // Set the Harris-Benedict constants
    private static final double MALE_CONSTANT = 88.36;
    private static final double FEMALE_CONSTANT = 447.6;
    private static final double HEIGHT_CONSTANT = 4.7;
    private static final double WEIGHT_CONSTANT = 13.7;
    private static final double AGE_CONSTANT = 5.0;

    public static void main(String[] args) {
        // Create a Scanner object for user input
        Scanner input = new Scanner(System.in);

        // Declare variables for the user's information
        char gender;
        int age;
        double height, weight, activity_level;

        // Ask for the user's information
        System.out.print("Enter your gender (M or F): ");
        gender = input.next().charAt(0);
        System.out.print("Enter your age: ");
        age = input.nextInt();
        System.out.print("Enter your height in cm: ");
        height = input.nextDouble();
        System.out.print("Enter your weight in kg: ");
        weight = input.nextDouble();
        System.out.print("Enter your activity level (1.2 for sedentary, 1.375 for light activity, 1.55 for moderate activity, 1.725 for very active, or 1.9 for extra active): ");
        activity_level = input.nextDouble();

        // Calculate the maintenance calories based on the user's information
        double maintenance_calories;
        if (gender == 'M') {
            maintenance_calories = (MALE_CONSTANT + (WEIGHT_CONSTANT * weight) + (HEIGHT_CONSTANT * height) - (AGE_CONSTANT * age)) * activity_level;
        } else {
            maintenance_calories = (FEMALE_CONSTANT + (WEIGHT_CONSTANT * weight) + (HEIGHT_CONSTANT * height) - (AGE_CONSTANT * age)) * activity_level;
        }

        // Print the calculated maintenance calories
        System.out.println("Your maintenance calories are: " + maintenance_calories);
    }
}
