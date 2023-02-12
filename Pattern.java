// n=6
// *
// **
// ***
// ****
// *****      *
// ************
// *****      *
// ****
// ***
// **
// *

// public class Pattern {
//     private static void pattern1(int n) {
//         for (int i = 0; i < n; i++) {
//             for (int j = 0; j <= i; j++) {
//                 System.out.print("*");
//             }
//             if (i == n - 2) {
//                 for (int j = 0; j < n; j++)
//                     System.out.print(" ");
//                 System.out.print("*");
//             }
//             if (i == n - 1) {
//                 for (int j = 0; j < n; j++)
//                     System.out.print("*");
//             }
//             System.out.println();
//         }
//         for (int i = n - 1; i > 0; i--) {
//             for (int j = 0; j < i; j++) {
//                 System.out.print("*");
//             }
//             if (i == n - 1) {
//                 for (int j = 0; j < n; j++)
//                     System.out.print(" ");
//                 System.out.print("*");
//             }
//             System.out.println();
//         }
//     }

//     public static void pattern2(int n) {

//     }

//     public static void main(String[] args) {
//         java.util.Scanner sc = new java.util.Scanner(System.in);
//         int n = sc.nextInt();
//         sc.close();
//         pattern1(n);
//         pattern2(n);
//     }
// }