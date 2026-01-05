package hashmapandhashfunctions.customhashmap;

public class CustomHashMapMain {
	
	    public static void main(String[] args) {

	        CustomHashMap<Integer, String> map = new CustomHashMap<>();

	        map.put(1, "Apple");
	        map.put(2, "Banana");
	        map.put(12, "Orange"); // collision example

	        System.out.println(map.get(1));   // Apple
	        System.out.println(map.get(12));  // Orange

	        map.remove(2);
	        System.out.println(map.get(2));   // null
	    }
	}

