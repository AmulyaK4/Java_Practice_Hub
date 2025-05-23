import java.util.Scanner;
public class DivisibleByBothNumbers {
  public static void main (String[] args) {
    Scanner scanner = new Scanner(System.in);
    System.out.print("Enter num1:");
    int num1 = scanner.nextInt();
    System.out.print("Enter num2:");
    int num2 = scanner.nextInt();
    System.out.println("The numbers that divisible by num1 and num 2 is:");
    for (int i = 1; i <= 100; i++) {
      if ( i % num1 == 0 && i % num2 == 0) {
        System.out.println(i + " ");
      }
    }
  }
}  
