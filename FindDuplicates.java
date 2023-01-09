
//5. WAP to find the duplicate values of an array of integer values.
//6. WAP to find the duplicate values of an array of String values.
import java.util.*;

public class FindDuplicates {
    public static void main(String[] args) {
        int[] arr = new int[] { 1, 2, 1, 3, 3, 3, 7, 8, 45, 32, 12, 32, 15, 15 };
        findDuplicateIntegers(arr);
        String[] str = new String[] { "ravi", "rohit", "rahul", "rohit", "chandan", "vikky", "rahul" };
        findDuplicateIntegers(str);
    }

    public static void findDuplicateIntegers(int[] arr) {
        Arrays.sort(arr); // sorting the array
        if (arr.length < 2)
            return;
        for (int i = 1; i < arr.length - 1; i++) {
            if (arr[i] == arr[i - 1] && arr[i] != arr[i + 1]) {
                System.out.println(arr[i]);
            }
        }
    }

    public static void findDuplicateIntegers(String[] arr) {
        Arrays.sort(arr); // sorting the array
        if (arr.length < 2)
            return;
        for (int i = 1; i < arr.length - 1; i++) {
            if (arr[i] == arr[i - 1] && arr[i] != arr[i + 1]) {
                System.out.println(arr[i]);
            }
        }
    }
}
