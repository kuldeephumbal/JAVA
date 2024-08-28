// public class patterns{
//     public static void main(String args[]){
//         for(int i=1; i<=4; i++){
//             for(int j=1; j<=i; j++){
//                 System.out.print("*");
//             }
//             System.out.println();
//         }
//     }
// }
// output
// * 
// **
// ***
// ****

// public class patterns{
//     public static void main(String arhs[]){
//         for(int i=1; i<=4; i++){
//             for(int j=1; j<=4-i+1; j++){
//                 System.out.print("*");
//             }
//             System.out.println();
//         }
//     }
// }
// output
// ****
// ***
// **
// *

// public class patterns{
//     public static void main(String args[]){
//         for(int i=1; i<=4; i++){
//             for(int j=1; j<=i; j++){
//                 System.out.print(j);
//             }
//             System.out.println();
//         }
//     }
// }
// output
// 1
// 12
// 123
// 1234

// public class patterns{
//     public static void main(String args[]){
//         char ch = 'A';
//         for(int i=1; i<=4; i++){
//             for(int j=1; j<=i; j++){
//                 System.out.print(ch);
//                 ch++;
//             }
//             System.out.println();
//         }
//     }
// }
// output 
// A 
// BC
// DEF
// GHIJ

// public class patterns{
//     public static void main(String args[]){
//         for(int i=1; i<=4; i++){
//             for(int j=1; j<=5; j++){
//                 if(i==1 || i==4 || j==1 || j==5 ){
//                     System.out.print("* ");
//                 } else{
//                     System.out.print("  ");
//                 }
//             }
//             System.out.println();
//         }
//     }
// }
// output
// * * * * *
// *       *
// *       *
// * * * * *

// public class patterns{
//     public static void main(String args[]){
//         for(int i=1; i<=4; i++){
//             for(int j=1; j<=4-i; j++){
//                 System.out.print("  ");
//             }
//             for(int j=1; j<=i; j++){
//                 System.out.print("* ");
//             }
//             System.out.println();
//         }
//     }
// }
// output
//       * 
//     * * 
//   * * * 
// * * * * 

// public class patterns{
//     public static void main(String args[]){
//         for(int i=1; i<=5; i++){
//             for(int j=1; j<=5-i+1; j++){
//                 System.out.print(j);
//             }
//             System.out.println();
//         }
//     }
// }
// output
// 12345
// 1234
// 123
// 12
// 1

// public class patterns{
//     public static void main(String args[]){
//         int number = 1;
//         for(int i=1; i<=5; i++){
//             for(int j=1; j<=i; j++){
//                 System.out.print(number+" ");
//                 number++;
//             }
//             System.out.println();
//         }
//     }
// }
// output
// 1
// 2 3
// 4 5 6
// 7 8 9 10
// 11 12 13 14 15

// public class patterns{
//     public static void main(String args[]){
//         for(int i=1; i<=5; i++){
//             for(int j=1; j<=i; j++){
//                 if((i+j)%2 == 0){
//                     System.out.print(1+" ");
//                 } else{
//                     System.out.print(0+" ");
//                 }
//             }
//             System.out.println();
//         }
//     }
// }
// output
// 1
// 0 1
// 1 0 1
// 0 1 0 1
// 1 0 1 0 1


// public class patterns{
//     public static void main(String args[]){
//         for(int i=1; i<=4; i++){
//             //stars - i
//             for(int j=1; j<=i; j++){
//                 System.out.print("* ");
//             }
//             //space - 2*4-i
//             for(int j=1; j<=2*(4-i); j++){
//                 System.out.print("  ");
//             }
//              //stars - i
//             for(int j=1; j<=i; j++){
//                 System.out.print("* ");
//             }
//             System.out.println();
//         }
//             for(int i=4; i>=1 ; i--){
//                 //stars - i
//             for(int j=1; j<=i; j++){
//                 System.out.print("* ");
//             }
//             //space - 2*4-i
//             for(int j=1; j<=2*(4-i); j++){
//                 System.out.print("  ");
//             }
//              //stars - i
//             for(int j=1; j<=i; j++){
//                 System.out.print("* ");
//             }
//                 System.out.println();
//             }
//     }
// }
// output
// *             * 
// * *         * *
// * * *     * * *
// * * * * * * * *
// * * * * * * * *
// * * *     * * *
// * *         * *
// *             *


// public class patterns{
//     public static void main(String args[]){
//         for(int i=1; i<=5; i++){
//             for(int j=1; j<=5-i; j++){
//                 System.out.print("  ");
//             }
//             for(int j=1; j<=5; j++){
//                 System.out.print("* ");
//             }
//             System.out.println();
//         }
//     }
// }
// output
//         * * * * * 
//       * * * * *
//     * * * * *
//   * * * * *
// * * * * *


// public class patterns{
//     public static void main(String args[]){
//         for(int i=1; i<=5; i++){
//             for(int j=1; j<=5-i; j++){
//                 System.out.print("  ");
//             }
//             for(int j=1; j<=5; j++){
//                 if(i==1 || i==5 || j==1 || j==5){
//                     System.out.print("* ");
//                 } else{
//                     System.out.print("  ");
//                 }
//             }
//             System.out.println();
//         }
//     }
// }
// output
//         * * * * * 
//       *       *
//     *       *
//   *       *
// * * * * *


// public class patterns{
//     public static void main(String args[]){
//         for(int i=1; i<=4; i++){
//             for(int j=1; j<=4-i; j++){
//                 System.out.print("  ");
//             }
//             for(int j=1; j<=(2*i)-1; j++){
//                 System.out.print("* ");
//             }
//             System.out.println();
//         }
//         for(int i=4; i>=1; i--){
//             for(int j=1; j<=4-i; j++){
//                 System.out.print("  ");
//             }
//             for(int j=1; j<=(2*i)-1; j++){
//                 System.out.print("* ");
//             }
//             System.out.println();
//         }
//     }
// }
// output
//       * 
//     * * *
//   * * * * *
// * * * * * * *
// * * * * * * *
//   * * * * *
//     * * *
//       *

// public class patterns{
//     public static void main(String args[]){
//         for(int i=1; i<=5; i++){
//             for(int j=1; j<6-i; j++){
//                 System.out.print("  ");
//             }
//             for(int j=1; j<=i; j++){
//                 System.out.print(i+"   ");
//             }
//             System.out.println();
//         }
//     }
// }
// output
//         1   
//       2   2
//     3   3   3
//   4   4   4   4
// 5   5   5   5   5

// public class patterns{
//     public static void main(String args[]){
//         for(int i=1; i<=5; i++){
//             for(int j=1; j<=5-i; j++){
//                 System.out.print("  ");
//             }
//             for(int j=i; j>=1; j--){
//                 System.out.print(j+" ");
//             }
//             for(int j=2; j<=i; j++){
//                 System.out.print(j+" ");
//             }
//             System.out.println();
//         }
//     }
// }
// output
//         1 
//       2 1 2
//     3 2 1 2 3
//   4 3 2 1 2 3 4
// 5 4 3 2 1 2 3 4 5