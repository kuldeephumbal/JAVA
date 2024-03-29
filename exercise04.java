import java.util.Scanner;
public class exercise04 {
    public static double circumferenceOfCircle(int r){
        double circumference = 2 * 3.14 * r;
        return circumference;
    }
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        int r = sc.nextInt();
        System.out.println("The circumference of circle = " + circumferenceOfCircle(r) );
        sc.close();
    }
}
