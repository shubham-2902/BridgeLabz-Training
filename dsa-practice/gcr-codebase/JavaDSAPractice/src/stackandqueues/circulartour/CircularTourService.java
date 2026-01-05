package stackandqueues.circulartour;
import java.util.LinkedList;
import java.util.Queue;


	
	

	 public class CircularTourService {

	    public int findStartingPump(PetrolPump[] pumps) {

	        int n = pumps.length;
	        Queue<Integer> queue = new LinkedList<>();

	        int surplus = 0;
	        int startIndex = 0;

	        // Traverse twice to simulate circular nature
	        for (int i = 0; i < 2 * n; i++) {
	            int index = i % n;

	            surplus += pumps[index].petrol - pumps[index].distance;
	            queue.add(index);

	            // If petrol becomes insufficient, reset
	            if (surplus < 0) {
	                queue.clear();
	                surplus = 0;
	                startIndex = index + 1;
	            }

	            // If we successfully covered all pumps
	            if (queue.size() == n) {
	                return startIndex % n;
	            }
	        }
	        return -1;
	    }
	}
