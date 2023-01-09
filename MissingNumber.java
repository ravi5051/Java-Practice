
//ind the missinq number in integer array of 1 to 10?
import java.util.Arrays;

public class MissingNumber {
    public static void main(String[] args) {
        int[] arr = new int[] { 1, 3, 9, 6, 2, 8, 5, 4, 10 };
        System.out.println(findMissingNumber(arr));
    }

    public static int findMissingNumber(int arr[]) {
        Arrays.sort(arr); // firstly sorting the array
        if (arr[0] != 1)
            return 1;
        if (arr[arr.length - 1] != 10)
            return 10;
        for (int i = 1; i < arr.length - 1; i++) {
            if (arr[i] - arr[i - 1] != 1)
                return arr[i] - 1;
        }
        return -1;
    }
}
