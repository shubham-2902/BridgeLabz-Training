package hashmapandhashfunctions.checkpair;
import java.util.HashSet;
import java.util.Set;

public class PairWithGivenSum {

	    public static boolean hasPairWithSum(int[] arr, int target) {
	        Set<Integer> seen = new HashSet<>();

	        for (int num : arr) {
	            int required = target - num;
	            if (seen.contains(required)) {
	                return true;
	            }
	            seen.add(num);
	        }
	        return false;
	    }
	}

