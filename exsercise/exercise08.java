import java.util.Scanner;
public class exercise08 {
    public static int findNoXToThePowerN(int n, int x){
        int result = 1;
        for(int i=1; i<=n; i++){
            result = result * x;
        }
        return result;
    }
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the number: ");
        int n = sc.nextInt();
        System.out.print("Enter the power: ");
        int x = sc.nextInt();
        System.out.println("The result of " + x + " to the power " + n + " = " + findNoXToThePowerN(n, x));
        sc.close();
    }
}
