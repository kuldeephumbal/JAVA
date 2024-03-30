import java.util.Scanner;
public class exercise09 {
    public static int calculateGCD(int num1, int num2) {
        while (num2 != 0) {
            int temp = num2;
            num2 = num1 % num2;
            num1 = temp;
        }
        return num1;
    }
    public static void main(String argd[]){
        Scanner sc =new Scanner(System.in);
        System.out.print("Enter the first number: ");
        int num1 = sc.nextInt();
        System.out.print("Enter the second number: ");
        int num2 = sc.nextInt();
        System.out.println("The GCD of " + num1 + " and " + num2 + " is " + calculateGCD(num1, num2));
        sc.close();
    }
}
