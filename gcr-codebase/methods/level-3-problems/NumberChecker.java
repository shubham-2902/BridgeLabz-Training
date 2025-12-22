public class NumberChecker {

    public static int countDigits(int num) {
        return String.valueOf(num).length();
    }

    public static int[] storeDigits(int num) {
        String s = String.valueOf(num);
        int[] digits = new int[s.length()];
        for (int i = 0; i < s.length(); i++)
            digits[i] = s.charAt(i) - '0';
        return digits;
    }

    public static boolean isDuckNumber(int[] digits) {
        for (int d : digits)
            if (d != 0)
                return true;
        return false;
    }

    public static boolean isArmstrong(int num, int[] digits) {
        int power = digits.length;
        int sum = 0;
        for (int d : digits)
            sum += Math.pow(d, power);
        return sum == num;
    }

    public static void findLargestSecondLargest(int[] digits) {
        int largest = Integer.MIN_VALUE;
        int second = Integer.MIN_VALUE;

        for (int d : digits) {
            if (d > largest) {
                second = largest;
                largest = d;
            } else if (d > second && d != largest) {
                second = d;
            }
        }
        System.out.println("Largest: " + largest);
        System.out.println("Second Largest: " + second);
    }

    public static void findSmallestSecondSmallest(int[] digits) {
        int smallest = Integer.MAX_VALUE;
        int second = Integer.MAX_VALUE;

        for (int d : digits) {
            if (d < smallest) {
                second = smallest;
                smallest = d;
            } else if (d < second && d != smallest) {
                second = d;
            }
        }
        System.out.println("Smallest: " + smallest);
        System.out.println("Second Smallest: " + second);
    }

    public static void main(String[] args) {
        int number = 153;
        int[] digits = storeDigits(number);

        System.out.println("Digit Count: " + countDigits(number));
        System.out.println("Duck Number: " + isDuckNumber(digits));
        System.out.println("Armstrong: " + isArmstrong(number, digits));
        findLargestSecondLargest(digits);
        findSmallestSecondSmallest(digits);
    }
}
