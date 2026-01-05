package hashmapandhashfunctions.longestconsecutivesequence;
import java.util.HashSet;
import java.util.Set;

public class LongestConsecutiveSequence {

	    public static int findLongestConsecutive(int[] arr) {

	        if (arr.length == 0)
	            return 0;

	        Set<Integer> set = new HashSet<>();

	        // Add all elements to set
	        for (int num : arr) {
	            set.add(num);
	        }

	        int longest = 0;

	        for (int num : set) {

	            // Check if num is the start of a sequence
	            if (!set.contains(num - 1)) {

	                int currentNum = num;
	                int currentStreak = 1;

	                while (set.contains(currentNum + 1)) {
	                    currentNum++;
	                    currentStreak++;
	                }

	                longest = Math.max(longest, currentStreak);
	            }
	        }
	        return longest;
	    }
	}

