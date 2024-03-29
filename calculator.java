import java.util.Scanner;
public class calculator{
    public static void main(String arg[]){
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        int b = sc.nextInt();
        System.out.println("Enter the operation you want to perform");
        System.out.println("Click 1 for Addition");
        System.out.println("Click 2 for Subtraction");
        System.out.println("Click 3 for Multiplication");
        System.out.println("Click 4 for Division");
        int operation = sc.nextInt();
        if(operation == 1){
            System.out.println("The sum of the numbers is " + (a+b));
        }
        else if(operation == 2){
            System.out.println("The difference of the numbers is " + (a-b));
        }
        else if(operation == 3){
            System.out.println("The product of the numbers is " + (a*b));
        }
        else if(operation == 4){
            System.out.println("The division of the numbers is " + (a/b));
        }
        else{
            System.out.println("Invalid operation");
        }

        sc.close();

    }
}  