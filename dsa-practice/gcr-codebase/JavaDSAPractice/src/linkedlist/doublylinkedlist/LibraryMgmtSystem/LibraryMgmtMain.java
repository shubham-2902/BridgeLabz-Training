package linkedlist.doublylinkedlist.LibraryMgmtSystem;

public class LibraryMgmtMain {
	
	    public static void main(String[] args) {

	        LibraryDoublyLinkedList library = new LibraryDoublyLinkedList();

	        library.addAtBeginning(101, "Clean Code", "Robert Martin",
	                "Programming", true);

	        library.addAtEnd(102, "The Alchemist", "Paulo Coelho",
	                "Fiction", true);

	        library.addAtEnd(103, "Effective Java", "Joshua Bloch",
	                "Programming", false);

	        library.addAtPosition(2, 104, "1984", "George Orwell",
	                "Dystopian", true);

	        System.out.println("All Books (Forward):");
	        library.displayForward();

	        System.out.println("\n Search by Title '1984':");
	        library.searchByTitle("1984");

	        System.out.println("\n Search by Author 'Joshua Bloch':");
	        library.searchByAuthor("Joshua Bloch");

	        System.out.println("\n Update Availability of Book ID 103:");
	        library.updateAvailability(103, true);

	        System.out.println("\nAll Books (Reverse):");
	        library.displayReverse();

	        System.out.println("\nRemove Book ID 102:");
	        library.removeByBookId(102);

	        System.out.println("\nFinal Library:");
	        library.displayForward();

	        System.out.println();
	        library.countBooks();
	    }
	}


