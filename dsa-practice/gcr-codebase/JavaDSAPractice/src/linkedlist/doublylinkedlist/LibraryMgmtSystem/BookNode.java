package linkedlist.doublylinkedlist.LibraryMgmtSystem;
public class BookNode {
	
	//Declaration of variables
    int bookId;
    String title;
    String author;
    String genre;
    boolean isAvailable;

    BookNode prev;
    BookNode next;

    //Constructor
    BookNode(int bookId, String title, String author, String genre, boolean isAvailable) {
        this.bookId = bookId;
        this.title = title;
        this.author = author;
        this.genre = genre;
        this.isAvailable = isAvailable;
        this.prev = null;
        this.next = null;
    }
}
