package stringbufferandbuilderpluslinearsearchandbinarysearch.linearsearch.firstnegativenumber;
public class FirstNegativeLinearSearch {

    // returns index of first negative number, else -1
    public static int firstNegativeIndex(int[] arr) {
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] < 0) {
                return i;   // first negative found
            }
        }
        return -1; // no negative number
    }

    public static void main(String[] args) {
        int[] arr = {5, 10, 0, 7, -3, -9, 2};

        int index = firstNegativeIndex(arr);

        System.out.println("Index of first negative number: " + index);

        if (index != -1) {
            System.out.println("First negative number is: " + arr[index]);
        } else {
            System.out.println("No negative number found!");
        }
    }
}
