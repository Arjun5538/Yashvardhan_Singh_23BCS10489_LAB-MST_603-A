import java.util.Scanner;

public class SquareRootCalculator {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in); 
        
        System.out.print("Enter a number: ");
        try {
            
            double number = Double.parseDouble(scanner.nextLine());

            
            if (number < 0) {
                System.out.println("Cannot calculate square root of a negative number.");
            } else {
                double result = Math.sqrt(number);
                System.out.println("Square root of " + number + " is " + result);
            }

        } catch (NumberFormatException e) {
            System.out.println("Invalid input. Please enter a numeric value.");
        } finally {
            scanner.close(); 
        }
    }
}
