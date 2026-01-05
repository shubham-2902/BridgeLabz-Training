package hashmapandhashfunctions.customhashmap;

public class CustomHashMap<K,V> {
	
	

	    private int capacity = 10;
	    private HashNode<K, V>[] buckets;

	    @SuppressWarnings("unchecked")
	    CustomHashMap() {
	        buckets = new HashNode[capacity];
	    }

	    /* Hash Function */
	    private int getBucketIndex(K key) {
	        return Math.abs(key.hashCode()) % capacity;
	    }

	    /* PUT operation */
	    public void put(K key, V value) {
	        int index = getBucketIndex(key);
	        HashNode<K, V> head = buckets[index];

	        // Check if key already exists
	        while (head != null) {
	            if (head.key.equals(key)) {
	                head.value = value; // update
	                return;
	            }
	            head = head.next;
	        }

	        // Insert at beginning
	        HashNode<K, V> newNode = new HashNode<>(key, value);
	        newNode.next = buckets[index];
	        buckets[index] = newNode;
	    }

	    /* GET operation */
	    public V get(K key) {
	        int index = getBucketIndex(key);
	        HashNode<K, V> head = buckets[index];

	        while (head != null) {
	            if (head.key.equals(key)) {
	                return head.value;
	            }
	            head = head.next;
	        }
	        return null;
	    }

	    /* REMOVE operation */
	    public void remove(K key) {
	        int index = getBucketIndex(key);
	        HashNode<K, V> head = buckets[index];
	        HashNode<K, V> prev = null;

	        while (head != null) {
	            if (head.key.equals(key)) {
	                if (prev == null) {
	                    buckets[index] = head.next;
	                } else {
	                    prev.next = head.next;
	                }
	                return;
	            }
	            prev = head;
	            head = head.next;
	        }
	    }
	}


