package hashmapandhashfunctions.allsubarraywithzerosum;
import java.util.*;

public class ZeroSumSubarrays {

    public static void findAllZeroSumSubarrays(int[] arr) {

        Map<Integer, List<Integer>> map = new HashMap<>();
        int prefixSum = 0;
        boolean found = false;   //  flag

        map.put(0, new ArrayList<>());
        map.get(0).add(-1);

        for (int i = 0; i < arr.length; i++) {
            prefixSum += arr[i];

            if (map.containsKey(prefixSum)) {
                for (int startIndex : map.get(prefixSum)) {
                    System.out.println(
                        "Zero-sum subarray found from index " +
                        (startIndex + 1) + " to " + i
                    );
                    found = true;   //  mark found
                }
            }

            map.putIfAbsent(prefixSum, new ArrayList<>());
            map.get(prefixSum).add(i);
        }

        //  if no subarray found
        if (!found) {
            System.out.println("No zero-sum subarray found");
        }
    }
}
