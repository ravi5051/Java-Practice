public class FindFirstDuplicate {
    static public void main(String... args) {
        int[] arr = new int[] { 1, 2, 1, 3, 3, 3, 7, 8, 45, 32, 12, 32, 15, 15 };
        System.out.println(findFirstDuplicate(arr));
        String[] str = new String[] { "ravi", "rohit", "rahul", "rohit", "chandan", "vikky", "rahul" };
        System.out.println(findFirstDuplicate(str));
    }

    public static int findFirstDuplicate(int[] arr) {
        for (int i = 0; i < arr.length; i++) {
            for (int j = i + 1; j < arr.length; j++) {
                if (arr[i] == arr[j])
                    return arr[i];
            }
        }
        return -1;
    }

    public static String findFirstDuplicate(String[] arr) {
        for (int i = 0; i < arr.length; i++) {
            for (int j = i + 1; j < arr.length; j++) {
                if (arr[i] == arr[j])
                    return arr[i];
            }
        }
        return "";
    }
}
