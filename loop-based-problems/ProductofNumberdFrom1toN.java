import java.util.Scanner;
public class ProductofNumbersFrom1toN {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter a Number N:");
        int N = scanner.nextInt();
        int product = 1;  // Start with 1 for multiplication
        for(int i=1; i<=N; i++) { // Multiply numbers from 1 to N
            product = product*i;
        }
        System.out.println("The product from 1 to N is:" + product);
    }
}
