public class SecondMinAndMax {
    public static void main(String... args) {
        int arr[] = new int[] { 56, 87, 10, 97, 56, 23, 32, 89, 69 };
        System.out.println(secondMinimum(arr));    //using first method
        System.out.println(secondMinimumType2(arr));//using second method
        System.out.println(secondMaximum(arr));//using first method
        System.out.println(secondMaximumType2(arr));//using second method
    }

    public static int secondMinimum(int arr[]) {
        if (arr.length < 1)
            return -1;
        int min = Integer.MAX_VALUE, secMin = Integer.MAX_VALUE;
        for (int i : arr) { // finding minimum
            if (i < min)
                min = i;
        }
        for (int i : arr) { // finding second minimum
            if (i < secMin && i > min) {
                secMin = i;
            }
        }
        return secMin;
    }

    public static int secondMinimumType2(int arr[]) {
        if (arr.length < 1)
            return -1;
        int min = Integer.MAX_VALUE, secMin = Integer.MAX_VALUE;
        for (int i : arr) {
            if (i < min) {
                secMin = min;
                min = i;
            } else if (i < secMin) {
                secMin = i;
            }
        }
        return secMin;
    }

    public static int secondMaximum(int arr[]) {
        if (arr.length < 1)
            return -1;
        int max = Integer.MIN_VALUE, secMax = Integer.MIN_VALUE;
        // finding maximum
        for (int i : arr) {
            if (i > max)
                max = i;
        }
        for (int i : arr) { // now finding second minimum
            if (i < max && i > secMax) {
                secMax = i;
            }
        }
        return secMax;
    }

    public static int secondMaximumType2(int arr[]) {
        if (arr.length < 1)
            return -1;
        int max = Integer.MIN_VALUE, secMax = Integer.MIN_VALUE;
        for (int i : arr) {
            if (i > max) {
                secMax = max;
                max = i;
            } else if (i > secMax) {
                secMax = i;
            }
        }
        return secMax;
    }
}
