import java.util.Scanner;

public class exercise10 {
    public static void printFibonacciSeries(int n) {
        int first = 0, second = 1;
        for (int i = 0; i < n; i++) {
            System.out.print(first + " ");
            int next = first + second;
            first = second;
            second = next;
        }
    }
    public static void main(String args[]) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter the value of n: ");
        int n = scanner.nextInt();
        
        System.out.println("Fibonacci Series:");
        printFibonacciSeries(n);
        
        scanner.close();
    }
    
}
