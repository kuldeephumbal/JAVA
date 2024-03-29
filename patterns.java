// 01 pattern
public class patterns {
    public static void main(String args[]){
        for(int i = 1;i <= 4;i++){
            for(int j = 1;j <= 5;j++){
                System.out.print("* ");
            }
            System.out.println();
        }
    }
} 
// output
// * * * * *
// * * * * *
// * * * * *
// * * * * *



// 02 pattern
// public class patterns{
//     public static void main(String args[]){
//         for(int i=1 ; i<=4 ; i++){
//             for(int j=1 ; j<=5 ; j++){
//                 if(i == 1 || j == 1 || i == 4 || j == 5){
//                     System.out.print("* ");
//                 }else{
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



// 03 pattern
// public class patterns{
//     public static void main(String args[]){
//         for(int i=1 ; i<=4 ; i++){
//             for(int j=1 ; j<=i ;j++){
//                 System.out.print("* ");
//             }
//             System.out.println();
//         }
//     }
// }
// output
// *
// * *
// * * *
// * * * *



// 04 pattern
// public class patterns{ 
//     public static void main(String args[]){
//         for(int i=4 ;i>=1 ;i--){ 
//             for(int j=1 ; j<=i ; j++){
//                 System.out.print("* ");
//             }
//             System.out.println();
//         }
//     }
// }
// output
// * * * *
// * * *
// * *
// * 



// 05 pattern
// public class patterns{
//     public static void main(String args[]){
//         for(int i=1 ; i<=4 ; i++){
//             for(int j=1; j<=4-i ; j++){
//                 System.out.print("  ");
//             }
//             for(int j=1; j<=i ; j++){  
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



// 06 pattern
// public class patterns{
//     public static void main(String args[]){
//         for(int i=1 ; i<=5 ; i++){
//             for(int j=1 ; j<=i ; j++){
//                 System.out.print(j+" ");
//             }
//             System.out.println();
//         }
//     }
// }
// output
// 1
// 1 2
// 1 2 3
// 1 2 3 4
// 1 2 3 4 5



// 07 pattern
// public class patterns{
//     public static void main(String args[]){
//         for(int i=1 ; i<=5 ; i++){
//             for(int j=1 ; j<=5-i+1; j++){
//                 System.out.print(j+" ");
//             }
//             System.out.println();
//         }
//     }
// }
// output
// 1 2 3 4 5
// 1 2 3 4
// 1 2 3
// 1 2
// 1



// 08 pattern
// public class patterns{
//     public static void main(String args[]){
//         int num = 1;
//         for(int i=1;i<=5;i++){
//             for(int j=1;j<=i;j++){
//                 System.out.print(num + " ");
//                 num++;
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



// 09 pattern
// public class patterns{
//     public static void main(String args[]){
//         for(int i=1;i<=5;i++){
//             for(int j=1;j<=i;j++){
//                 if((i+j)%2 == 0){
//                     System.out.print("1 ");
//                 }
//                 else{
//                     System.out.print("0 ");
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



// 10 pattern type 1
// public class patterns {
//     public static void main(String args[]) {
//         //upper part
//         for (int i=1; i<=5; i++) {
//             //1
//             for (int j=1; j<=i ; j++) {
//                 System.out.print("* ");
//             }
//             //2
//             for (int j=1; j<=5-i ; j++) {
//                 System.out.print("  ");
//             }
//             //3
//             for (int j=1; j<=5-i ; j++) {
//                 System.out.print("  ");
//             }
//             //4
//             for (int j=1; j<=i ; j++) {
//                 System.out.print("* ");
//             }
//             System.out.println();
//         }
//         //lower part
//         for (int i=1; i<=5; i++) {
//          //5
//          for (int j=1; j<=6-i ; j++) {
//             System.out.print("* ");
//         }
//         //6
//         for (int j=1; j<=i-1 ; j++) {
//             System.out.print("  ");
//         }
//         //7
//         for (int j=1; j<=i-1 ; j++) {
//             System.out.print("  ");
//         }
//         //8
//         for (int j=1; j<=6-i ; j++) {
//             System.out.print("* ");
//         }
//         System.out.println();
//     }
//     }
// }
// 10 pattern type 2
// public class patterns{
//     public static void main(String args[]){
//         for(int i=1;i<=5;i++){
//             for(int j=1;j<=i;j++){
//                 System.out.print("* ");
//             }
//             for(int j=1;j<=2*(5-i);j++){
//                 System.out.print("  ");
//             }
//             for(int j=1;j<=i;j++){
//                 System.out.print("* ");
//             }
//             System.out.println();
//         }
//         for(int i=5;i>=1;i--){
//             for(int j=1;j<=i;j++){
//                 System.out.print("* ");
//             }
//             for(int j=1;j<=2*(5-i);j++){
//                 System.out.print("  ");
//             }
//             for(int j=1;j<=i;j++){
//                 System.out.print("* ");
//             }
//             System.out.println();    
//         }
//     }
// }
// output
// *                 * 
// * *             * *
// * * *         * * *
// * * * *     * * * *
// * * * * * * * * * *
// * * * * * * * * * *
// * * * *     * * * *
// * * *         * * *
// * *             * *
// *                 *



// 11 pattern type 1
// public class patterns{
//     public static void main(String args[]){
//         for(int i=1;i<=5;i++){
//             for(int j=1;j<=6-i;j++){
//                 System.out.print("  ");
//             }
//             for(int j=1;j<=i;j++){
//                 System.out.print("* ");
//             }
//             for(int j=1;j<=5-i;j++){
//                 System.out.print("* ");
//             }
//             System.out.println();
//         }
//     }
// }
// 11 pattern type 2
// public class patterns{
//     public static void main(String args[]){
//         for(int i=1;i<=5;i++){
//             for(int j=1;j<=6-i;j++){
//                 System.out.print("  ");
//             }
//             for(int j=1;j<=5;j++){
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




// 12 pattern 
// public class patterns{
//     public static void main(String args[]){
//         for(int i=1;i<=5;i++){
//             for(int j=1;j<=6-i;j++){
//                 System.out.print("  ");
//             }
//             for(int j=1;j<=5;j++){
//                 if(i == 1 || i == 5 || j == 5 || j == 1){
//                     System.out.print("* ");
//                 }else{
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




// 13 pattern
// public class patterns{
//     public static void main(String arg[]){
//         // int num = 1;
//         for(int i=1;i<=5;i++){
//             for(int j=1;j<=6-i;j++){
//                 System.out.print("  ");
//             }
//             for(int j=1;j<=i;j++){
//                 System.out.print(i+"   ");
//             }
//             System.out.println();
//         }
//     }
// }
// output
//          1   
//        2   2
//      3   3   3
//    4   4   4   4
//  5   5   5   5   5




// 14 pattern
// public class patterns{
//     public static void main(String args[]){
//         for(int i=1;i<=5;i++){
//             for(int j=1;j<=6-i;j++){
//                 System.out.print("  ");
//             }
//             for(int j=i;j>=1;j--){
//                 System.out.print(j+" ");
//             }
//             for(int j=2;j<=i;j++){
//                 System.out.print(j+" ");
//             }
//             System.out.println();
//         }
//     }
// }
// output 
//          1 
//        2 1 2
//      3 2 1 2 3
//    4 3 2 1 2 3 4
//  5 4 3 2 1 2 3 4 5




// 15 pattern
// public class patterns{
//     public static void main(String args[]){
//         for(int i=1;i<=6;i++){
//             for(int j=1;j<=6-i;j++){
//                 System.out.print("  ");
//             }
//             for(int j=1;j<=i;j++){
//                 System.out.print("* ");
//             }
//             for(int j=2;j<=i;j++){
//                 System.out.print("* ");
//             }
//             System.out.println();
//         }
//         for(int i=1;i<=6;i++){
//             for(int j=1;j<=i;j++){
//                 System.out.print("  ");
//             }
//             for(int j=1;j<=6-i;j++){
//                 System.out.print("* ");
//             }
//             for(int j=2;j<=6-i;j++){
//                 System.out.print("* ");
//             }
//             System.out.println();
//         }
//     }
// }
// output
//           * 
//         * * *
//       * * * * *
//     * * * * * * *
//   * * * * * * * * *
// * * * * * * * * * * *
//   * * * * * * * * *
//     * * * * * * *
//       * * * * *
//        * * *
//          *





// public class patterns{
//     public static void main(String args[]){
//         for(int i=1;i<=6;i++){
//             for(int j=1;j<=6-i;j++){
//                 System.out.print("  ");
//             }
//             for(int j=1;j<=2*i-1;j++){
//                 System.out.print("* ");
//             }
//             System.out.println();
//         }
//         for(int i=6;i>=1;i--){
//             for(int j=1;j<=6-i;j++){
//                 System.out.print("  ");
//             }
//             for(int j=1;j<=2*i-1;j++){
//                 System.out.print("* ");
//             }
//             System.out.println();
//         }
       
//     }
// }
// output
//           * 
//         * * *
//       * * * * *
//     * * * * * * *
//   * * * * * * * * *
// * * * * * * * * * * *
// * * * * * * * * * * *
//   * * * * * * * * *
//     * * * * * * *
//       * * * * *
//         * * *
//           *

