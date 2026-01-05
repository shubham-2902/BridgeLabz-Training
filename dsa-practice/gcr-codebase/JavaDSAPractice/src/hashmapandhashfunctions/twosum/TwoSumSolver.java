package hashmapandhashfunctions.twosum;
import java.util.HashMap;
import java.util.Map;

class TwoSumSolver {

    public static int[] twoSum(int[] nums, int target) {

        Map<Integer, Integer> map = new HashMap<>();

        for (int i = 0; i < nums.length; i++) {
            int required = target - nums[i];

            if (map.containsKey(required)) {
                return new int[] { map.get(required), i };
            }

            map.put(nums[i], i);
        }
        return new int[] {}; // no solution
    }
}