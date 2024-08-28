// Array in java
// public class array {
//     public static void main(String args[]){
//         int marks[] = {23,24,25};
//         for(int i=1;i<=3;i++){
//             System.out.println(marks[i]);
//         }
//     sc.close();
//     }    
// }

// Input in java
// import java.util.Scanner;
// public class array{
//     public static void main(String args[]){
//         Scanner sc = new Scanner(System.in);
//         int num = sc.nextInt();
//         int marks[] = new int[num];
//         for(int i=1;i<=num;i++){
//             System.out.println(marks[i]);
//         }
//         sc.close();
//     }
// }

// Array length
// import java.util.Scanner;
// public class array{
//     public static void main(String args[]){
//         Scanner sc = new Scanner(System.in);
//         int size = sc.nextInt();
//         int marks[] = new int[num];
//         for(int i=1;i<=size;i++){
//             number[i] = sc.nextInt();
//         }
//     }
// }

import java.util.*;
public class array{
    public static int findKey(int number[], int key){
        for(int i=0; i<=number.length; i++){
            if(number[i] == key){
                return i;
            } 
        }
        return -1;
    }
    public static void main(String args[]){
        int number[] = {1,2,3,4,5};
        int key = 5;
        System.out.println(findKey(number, key));
    }
}