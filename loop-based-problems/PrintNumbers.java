Problem Statement
Print Numbers from 1 to N

import java.util.Scanner; // Import Scanner
public class PrintNumbers { // Main class
  public static void main(String[] args) {  // Main method 
    Scanner scanner = new Scanner(System.in);  // Create Scanner object
    System.out.print("Enter a positive interger N: ");  // Ask user for input
    int N = scanner.nextInt(); // Read the input value
    for (int i=1; i<=N; i++) {   // Loop from 1 to N
      System.out.println(i);  // Print current number
    }
  }
} 


