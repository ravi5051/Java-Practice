public class Sorting {
    public static void main(String[] args) {
        String[] str=new String[]{"ravi","rohit","rahul"};
        selectionSortOnString(str);//sorting of string array using selectrion sort alphabetically
    }
    public static void selectionSortOnInteger(int[] arr) {
        int min = 0;
        for (int i = 0; i < arr.length; i++) {
            min = i;
            for (int j = i + 1; j < arr.length; j++) {
                if (arr[j] < arr[min]) {
                    min = j;
                }
            }
            int tmp = arr[i];
            arr[i] = arr[min];
            arr[min] = tmp;
        }
    }
    public static void selectionSortOnString(String[] arr) {
        int min = 0;
        for (int i = 0; i < arr.length; i++) {
            min = i;
            for (int j = i + 1; j < arr.length; j++) {
                if (arr[j].compareTo(arr[min])<0) { //comparing each character by unicode
                    min = j;
                }
            }
            String tmp = arr[i];
            arr[i] = arr[min];
            arr[min] = tmp;
        }
    }
}
