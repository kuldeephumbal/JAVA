import java.util.Scanner;
public class funtionOfSum {
    public static int Sum(int a,int b){
        int c = a + b;
        return c;
    }
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        int b = sc.nextInt();
        int calculatrSum = Sum(a,b);
        System.out.println("Sum = " + calculatrSum );

        sc.close();

    }
}
