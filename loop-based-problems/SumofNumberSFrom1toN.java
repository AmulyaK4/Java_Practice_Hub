import java.util.Scanner;
public class SumofNumbersFrom1toN {
    public static void main (String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter  a Number N:");
        int N = scanner.nextInt();
        int sum = 0;
        for (int i=0; i <= N; i++) {
            sum = sum+i;
        }
        System.out.println("The sum of Numbers from 1 to N is:" +sum);

    }
}
  
