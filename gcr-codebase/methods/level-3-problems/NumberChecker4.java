public class NumberChecker4 {

    public static int[] storeDigits(int num) {
        String s = String.valueOf(num);
        int[] digits = new int[s.length()];
        for (int i = 0; i < s.length(); i++)
            digits[i] = s.charAt(i) - '0';
        return digits;
    }

    public static int[] reverseArray(int[] arr) {
        int[] rev = new int[arr.length];
        for (int i = 0; i < arr.length; i++)
            rev[i] = arr[arr.length - 1 - i];
        return rev;
    }

    public static boolean compareArrays(int[] a, int[] b) {
        if (a.length != b.length)
            return false;
        for (int i = 0; i < a.length; i++)
            if (a[i] != b[i])
                return false;
        return true;
    }

    public static boolean isPalindrome(int num) {
        int[] original = storeDigits(num);
        int[] reversed = reverseArray(original);
        return compareArrays(original, reversed);
    }

    public static boolean isDuckNumber(int[] digits) {
        for (int d : digits)
            if (d != 0)
                return true;
        return false;
    }

    public static void main(String[] args) {
        int number = 121;
        int[] digits = storeDigits(number);

        System.out.println("Palindrome: " + isPalindrome(number));
        System.out.println("Duck Number: " + isDuckNumber(digits));
    }
}
