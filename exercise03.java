import java.util.Scanner;
public class exercise03 {
    public static int findGreaterNo(int a,int b){
        if(a > b){
            return a;
        }else{
            return b;
        }
    }
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        int b = sc.nextInt();
        System.out.println("The greater no. = "+findGreaterNo(a, b));
        sc.close();
    }
}
