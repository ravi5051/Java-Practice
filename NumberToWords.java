public class NumberToWords {
    public static void main(String[] args) {
        java.util.Scanner sc = new java.util.Scanner(System.in);
        int n = sc.nextInt();
        sc.close();
        System.out.println(new NumberToWords().numberToWords(n));
    }

    private String numberToWords(int n) {
        String[] ones = { "", "one", "two", "three", "four", "five", "six", "seven", "eight", "nine" };
        String[] tens = { "ten", "eleven", "twelve", "thirteen", "fourteen", "fifteen", "sixteen", "seventeen",
                "eighteen", "nineteen" };
        String[] multi = { "", "ten", "twenty", "thirty", "forty", "fifty", "sixty", "seventy", "eighty", "ninety" };
        // String[] extra={"hundred","thousand","lakh","crore"};
        String str = "";
        if ((n / 10000) > 0) {
            str = str + multi[n / 10000] + ones[(n % 10000) / 1000] + " Thousand ";
            n = n % 1000;
        }
        if ((n / 1000) > 0) {
            str = str + ones[n / 1000] + " Thousand ";
            n = n % 1000;
        }
        if ((n / 100) > 0) {
            str = str + ones[n / 100] + " Hundred ";
            n = n % 100;
        }
        if (n > 19) {
            str = str + multi[n / 10] + " " + ones[n % 10];
        }

        if (n < 20 && n > 9) {
            str = str + tens[n % 10];
        }
        if (n < 10) {
            str = str + ones[n];
        }
        return str;
    }
}