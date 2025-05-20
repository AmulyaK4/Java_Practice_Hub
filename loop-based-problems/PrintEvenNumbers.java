import java.util.Scanner; // Import Scanner
public class PrintEvenNumbers {  // Class definition
  public static void main(String[] args) {  // Main method
    Scanner scanner = new Scanner(System.in);  // Creates Scanner object
    System.out.print("Enter a Positive integer N: "); // Ask the user to type in a positive number (N)
    int N = scanner.nextInt(); // Reads the entered integer and stores in N
    for (int i=1; i <= N; i++) { // Loop from 1 to N
      if (i % 2 == 0) {  // Checks if number is divisible by 2 (even)
        System.out.println(i);  // Prints the even number
      }
    } 
    scanner.close(); // Closes the Scanner
  }
}  
  
