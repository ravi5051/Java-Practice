// 2. WAP to find the maximum and minimum value in an array.
public class MinAndMax {
    public static void main(String...args){
        int arr[]=new int[]{56,87,56,97,56,23,32,89,69};
        System.out.println(minimum(arr));
        System.out.println(maximum(arr));
    }
    public static int minimum(int[] arr){
        if(arr.length<1)
        return -1;
        int min=Integer.MAX_VALUE;
        for(int i:arr){
            if(i<min)
            min=i;
        }
        return min;
    }
    public static int maximum(int []arr){
        if(arr.length<1)
        return -1;
        int max=Integer.MIN_VALUE;
        for(int i:arr){
            if(i>max){
                max=i;
            }
        }
        return max;
    }
}
