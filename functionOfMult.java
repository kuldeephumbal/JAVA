import java.util.Scanner;
public class functionOfMult {
    public static int mult(int a,int b){
        int c = a * b;
        return c;
    }
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        int b = sc.nextInt();
        int mult = mult(a,b);
        System.out.println("Multi = " + mult);

        sc.close();
    }
}
