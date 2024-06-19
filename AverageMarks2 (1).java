import java.util.Scanner; // import the Scanner class to read input from the keyboard

public class AverageMarks2 {
  public static void main(String[] args) {
    Scanner marks = new Scanner(System.in); // create a Scanner object to read input from the keyboard

    // prompt the user to enter the marks of the five units
    System.out.println("Enter the marks of the  units you did :");

    // read the marks of each unit using scanner.nextInt()
    System.out.print("java: ");
    int unit1 = marks.nextInt(); // read the mark of unit 1
    System.out.print("application: ");
    int unit2 = marks.nextInt(); // read the mark of unit 2
    System.out.print("hci: ");
    int unit3 = marks.nextInt(); // read the mark of unit 3
    System.out.print("structured cable: ");
    int unit4 = marks.nextInt(); // read the mark of unit 4
    System.out.print("networking: ");
    int unit5 = marks.nextInt(); // read the mark of unit 5

    // compute the total marks by adding up the marks of all five units
    int totalMarks = java + enterpreneirship + hci + structured cable + networking;

    // compute the average by dividing the total marks by 5
    // use a double type to store the average, since it may not be an integer value
    double average = (double) totalMarks / 5;

    // display the average mark on the screen with two decimal places
    System.out.printf("Your average mark is: %.2f%n", average);
  }
}