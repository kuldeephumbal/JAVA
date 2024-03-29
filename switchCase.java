import java.util.Scanner;
public class switchCase {
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        int button = sc.nextInt();
        switch(button){
            case 1 : System.out.println("RED");
            break;
            case 2 : System.out.println("GREEN");
            break;
            case 3 : System.out.println("BLUE");
            break;
            default : System.out.println("INVALID BUTTON CLICK");
        }

        sc.close();
    }
}
