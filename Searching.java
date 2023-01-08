//1. WAP to test if an array contains a specific value using : 
// 1.1 Linear Search
// 1.1 Binary Search
public class Searching{
    public static void main(String args[]){
        System.out.println(linearSearch(new int[]{10,20,30,40,50},20));
        System.out.println(binarySearch(new int[]{10,20,30,40,50},40));
    }
    public static int linearSearch(int []arr,int search){
        for(int i=0;i<arr.length;i++){
            if(arr[i]==search)
            return i;
        }
        return -1;
    }
    
    public static int binarySearch(int[] arr,int search){
        int s=0;
        int e=arr.length-1;
        while(s<=e){
            int mid=(s+e)/2;
            if(arr[mid]==search)
            return mid;
            else if(search<arr[mid])
            e=mid-1;
            else
            s=mid+1;
            
        }
        return -1;
    }
}
