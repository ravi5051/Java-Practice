//4. WAP to find kth smallest and largest element in an array.
public class KthSmallestAndLargest {
    public static void main(String...args){
        int arr[]=new int[]{56,87,58,97,53,23,32,89,69};
        selectionSort(arr);//it will sort the elements in non-decreasing order
        System.out.println(kthMinimum(arr,5));
        System.out.println(kthMaximum(arr,7));
    }
    public static int kthMinimum(int[] arr,int i){
        return arr[i-1];
    }
    public static int kthMaximum(int[] arr,int i){
        return arr[arr.length-i];
    }
    public static void selectionSort(int[] arr){
        int min=0;
        for(int i=0;i<arr.length;i++){
            min=i;
            for(int j=i+1;j<arr.length;j++){
                if(arr[j]<arr[min]){
                    min=j;
                }
            }
            int tmp=arr[i];
            arr[i]=arr[min];
            arr[min]=tmp;
        }
    }
}
