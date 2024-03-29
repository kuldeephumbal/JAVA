import java.util.Scanner;
public class functionOfFactorial {
    public static void sumOfFactorial(int n) {
        if (n < 0) {
            System.out.println("Invalid number");
            return;
        }
        int factorial = 1;
        for (int i = n; i >= 1; i--) {
            factorial = factorial * i;
        }
        System.out.println("Sum Of Factorial Is " + factorial);
        return;
    }

    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        sumOfFactorial(n);

        sc.close();
    }

}
