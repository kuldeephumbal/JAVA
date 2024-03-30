import java.util.Scanner;
public class exercise02 {
    public static int sumOfOdd(int num){
        int sum = 0;
        for(int i = 1; i <= num; i++){
            if(i % 2 != 0){
                sum += i;
            }
        }
        return sum;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int num = sc.nextInt();
        System.out.println("The sum of odd no. = "+sumOfOdd(num));    
        sc.close();
    }
}