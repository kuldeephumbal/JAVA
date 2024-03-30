import java.util.Scanner;
public class exercise06 {
    public static int doWhileLoop(int num){
        int i=1;
        do{
            i++;
            System.out.println("Do whule loop "+num);
        }while(i<=5);
        return i;
    }
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        int num = sc.nextInt();
        doWhileLoop(num);
        sc.close();
    }
}
