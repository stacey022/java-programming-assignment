//5.Create a calculator using java to help user perform the basic operations (+, -, * and /).
a.	User should be asked to enter a number, then an operation, the program computes the operation and display the output to the computer screen. 
import java.util.Scanner;

public class Calculator {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        // Prompt user to enter the first number
        System.out.print("Enter the first number: ");
        double num1 = scanner.nextDouble();
        
        // Prompt user to enter the operation (+, -, *, /)
        System.out.print("Enter the operation (+, -, *, /): ");
        char operator = scanner.next().charAt(0); // Read the first character of input
        
        // Prompt user to enter the second number
        System.out.print("Enter the second number: ");
        double num2 = scanner.nextDouble();
        
        // Close the Scanner object
        scanner.close();
        
        double result = 0;
        
        // Perform the calculation based on the operator entered
        switch (operator) {
            case '+':
                result = num1 + num2;
                break;
            case '-':
                result = num1 - num2;
                break;
            case '*':
                result = num1 * num2;
                break;
            case '/':
                // Check if num2 is not zero to avoid division by zero error
                if (num2 != 0) {
                    result = num1 / num2;
                } else {
                    System.out.println("Error: Division by zero is not allowed.");
                    return; // Exit the program
                }
                break;
            default:
                System.out.println("Error: Invalid operator.");
                return; // Exit the program if operator is invalid
        }
        
        // Display the result
        System.out.println("Result: " + num1 + " " + operator + " " + num2 + " = " + result);
    }
}


