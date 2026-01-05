package linkedlist.doublylinkedlist.undoredotexteditor;

public class TextEditor {
	

	    private TextState head;      // oldest state
	    private TextState tail;      // latest state
	    private TextState current;   // current text state
	    private int size;
	    private final int MAX_HISTORY = 10;

	    /* Add new text state */
	    public void addState(String content) {
	        TextState newState = new TextState(content);

	        // If undo was used, discard redo history
	        if (current != tail && current != null) {
	            TextState temp = current.next;
	            while (temp != null) {
	                size--;
	                temp = temp.next;
	            }
	            current.next = null;
	            tail = current;
	        }

	        if (head == null) {
	            head = tail = current = newState;
	            size = 1;
	        } else {
	            tail.next = newState;
	            newState.prev = tail;
	            tail = newState;
	            current = newState;
	            size++;
	        }

	        // Maintain history limit
	        if (size > MAX_HISTORY) {
	            head = head.next;
	            head.prev = null;
	            size--;
	        }
	    }

	    /* Undo operation */
	    public void undo() {
	        if (current != null && current.prev != null) {
	            current = current.prev;
	            System.out.println("Undo performed.");
	        } else {
	            System.out.println("No more undo available.");
	        }
	    }

	    /* Redo operation */
	    public void redo() {
	        if (current != null && current.next != null) {
	            current = current.next;
	            System.out.println("Redo performed.");
	        } else {
	            System.out.println("No more redo available.");
	        }
	    }

	    /* Display current text */
	    public void displayCurrentState() {
	        if (current != null) {
	            System.out.println("Current Text: " + current.content);
	        } else {
	            System.out.println("Editor is empty.");
	        }
	    }

	    /* Display full history (for debugging) */
	    public void displayHistory() {
	        TextState temp = head;
	        System.out.println("Text History:");
	        while (temp != null) {
	            if (temp == current)
	                System.out.println("👉 " + temp.content);
	            else
	                System.out.println("   " + temp.content);
	            temp = temp.next;
	        }
	    }
	}

