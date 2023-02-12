
// public class Test {
//     public static void main(String[] args) {
//         String str = "it was bold to make the build larger";
//         String s = "";
//         for (int i = 0; i < str.length(); i++) {
//             if (str.charAt(i) == 'a' || str.charAt(i) == 'e' || str.charAt(i) == 'i' || str.charAt(i) == 'o'
//                     || str.charAt(i) == 'u')
//                 continue;
//             else
//                 s = s + Character.toString(str.charAt(i));
//         }
//         String[] ch = s.split(" ");
//         for (int i = 0; i < ch.length; i++) {
//             int c = 1;
//             for (int j = i + 1; j < ch.length; j++) {
//                 if (ch[i].equals(ch[j])) {
//                     ch[j] = ch[j] + c;
//                 }
//             }
//         }
//         s = "";
//         for (String st : ch) {
//             s = s + st + " ";
//         }
//         System.out.println(s);
//     }
// }
// import java.util.Scanner;

// public class Test {
//     public static void main(String[] args) {
//         int A, B, n;

//         Scanner sc = new Scanner(System.in);
//         A = sc.nextInt();
//         B = sc.nextInt();
//         n = sc.nextInt();
//         sc.close();
//         int sum = 0;
//         String str = "";
//         str = str + A + " " + B;
//         for (int i = 0; i < n - 2; i++) {
//             sum = A + B;
//             str = str + " " + sum;
//             A = B;
//             B = sum;
//         }
//         String[] s = str.split(" ");
//         String even="";
//         String odd="";
//         for (int i = 0; i < s.length; i++) {
//             if (Integer.parseInt(s[i]) % 2 == 0) {
//                 even=even+s[i]+" ";
//             }
//         }
//         for (int i = 0; i < s.length; i++) {
//             if (Integer.parseInt(s[i]) % 2 != 0) {
//                 odd=odd+s[i]+" ";
//             }
//         }
//         System.out.println(even);
//         System.out.println(odd);

//     }
// }
// public class Test{
//     static int totalDistance(String word1,String word2){
//         int result =0;
//         for(int i=0;i<word1.length();i++){
//             result=result+word1.codePointAt(i)-word2.codePointAt(i);
//         }
//         return result;
//     }
//     static void stabilizedTraysWeight(int arr[],int N){
//         int c=0;
//         int[] x=new int[N];
//         for(int i=0;i<N;i++)
//             x[i]=arr[i];
//         for(int i=0;i<N;i++){
//              c=0;
//             for(int j:x){
//                 if(x[i]==j)
//                 c++;
//             }
//             arr[i]=N-c;
//         }
//     }
//     public static void main(String[] args) {
//         String  str1="hears";
//         String  str2="heard";
//         System.out.println(totalDistance(str1, str2));
//         System.out.println("________");
//         int arr[]={1,2,5,2,2,5,4,4};
//         stabilizedTraysWeight(arr, 8);
//         for(int a:arr)
//         System.out.println(a);
//     }
// }

// public class Test{
//     public static void main(String[] args) {
//         String str="a+2b*6c";
//         String s="";
//         for(int i=0;i<str.length();i++){
//             if(str.charAt(i)>='a' && str.charAt(i)<='z')
//             s=s+"*1";
//             else
//             s=s+str.charAt(i);
//         }
//         System.out.println(Solution.calculate(s));
//     }
// }
// class Solution {
//     public static int calculate(String s) {
//         int sum = 0;
//         int tempSum = 0;
//         int num = 0;
//         char lastSign = '+';
//         for (int i = 0; i < s.length(); i++) {
//             char c = s.charAt(i);
//             if (Character.isDigit(c)) num = num * 10 + c - '0';
//             if (i == s.length() - 1 || !Character.isDigit(c) && c!=' ') {
//                 switch(lastSign) {
//                     case '+':
//                         sum+=tempSum;
//                         tempSum = num;
//                         break;
//                     case '-':
//                         sum+=tempSum;
//                         tempSum = -num;
//                         break;
//                     case '*':
//                         tempSum *= num;
//                         break;
//                     case '/':
//                         tempSum /= num;
//                         break;
//                 }
//                 lastSign = c;
//                 num=0;
//             }
//         }
//         sum+=tempSum;
//         return sum;
//     }
// }

// public class Test {
//     public static void minMaxTime(String t) {

//         String[] arr = t.split(":");
//         String tmpMin="";
//         String tmpMax="";
//         String min="";
//         String max="";
//         for (int i = 0; i < arr.length; i++) {
//             if(arr[i].contains(Character.toString('@'))){
//                 if(i==0){
//                     if(arr[i].charAt(0)=='@'){
//                         min="0"+arr[i].charAt(1);
//                         max="2"+arr[i].charAt(1);
//                     }
//                     else{
//                         min=arr[i].charAt(0)+"0";
//                         max=arr[i].charAt(0)+"9";
//                     }
//                 }
//                 else if(i==1){
//                     if(arr[i].charAt(0)=='@'){
//                         min="0"+arr[i].charAt(1);
//                         max="5"+arr[i].charAt(1);
//                     }
//                     else{
//                         min=arr[i].charAt(0)+"0";
//                         max=arr[i].charAt(0)+"9";
//                     }
//                 }
//                 else{
//                     if(arr[i].charAt(0)=='@'){
//                         min="0"+arr[i].charAt(1);
//                         max="5"+arr[i].charAt(1);
//                     }
//                     else{
//                         min=arr[i].charAt(0)+"0";
//                         max=arr[i].charAt(0)+"9";
//                     }
//                 }
//                 if(i==1){
//                     tmpMin=tmpMin+":"+min+":";
//                 tmpMax=tmpMax+":"+max+":";
//                 }
//                 else{
//                     tmpMin=tmpMin+min;
//                 tmpMax=tmpMax+max;
//                 }
//             }
//             else{
//                 if(i==1){
//                     tmpMin=tmpMin+":"+arr[i]+":";
//                 tmpMax=tmpMax+":"+arr[i]+":";
//                 }
//                 else{
//                     tmpMin=tmpMin+arr[i];
//                 tmpMax=tmpMax+arr[i];
//                 }
//             }
//         }
//         System.out.println(tmpMin);
//         System.out.println(tmpMax);
//     }

//     public static void main(String[] args) {
//         minMaxTime("1@:@5:58");
//     }
// }

public class Test{
    public static void main(String[] args) {
        
    
    }
}