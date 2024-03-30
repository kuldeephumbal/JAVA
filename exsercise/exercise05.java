import java.util.Scanner;
public class exercise05 {
    public static int ageEligility(int num){
        if(num<18){
            System.out.println("Eligible");
        }
        else{
            System.out.println("Not eligible");
        }
        return num;
    }
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        int age = sc.nextInt();
        ageEligility(age);
        sc.close();
    }    
}
