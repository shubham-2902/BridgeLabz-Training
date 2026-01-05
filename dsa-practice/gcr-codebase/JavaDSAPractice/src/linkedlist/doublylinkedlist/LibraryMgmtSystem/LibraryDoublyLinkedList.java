package linkedlist.doublylinkedlist.LibraryMgmtSystem;



public class LibraryDoublyLinkedList {

    private BookNode head;
    private BookNode tail;

    /* 1️⃣ Add at Beginning */
    public void addAtBeginning(int id, String title, String author,
                               String genre, boolean available) {

        BookNode newNode = new BookNode(id, title, author, genre, available);

        if (head == null) {
            head = tail = newNode;
        } else {
            newNode.next = head;
            head.prev = newNode;
            head = newNode;
        }
    }

    /* 2️⃣ Add at End */
    public void addAtEnd(int id, String title, String author,
                         String genre, boolean available) {

        BookNode newNode = new BookNode(id, title, author, genre, available);

        if (tail == null) {
            head = tail = newNode;
        } else {
            tail.next = newNode;
            newNode.prev = tail;
            tail = newNode;
        }
    }

    /* 3️⃣ Add at Specific Position (1-based) */
    public void addAtPosition(int pos, int id, String title,
                              String author, String genre, boolean available) {

        if (pos <= 1) {
            addAtBeginning(id, title, author, genre, available);
            return;
        }

        BookNode temp = head;
        for (int i = 1; i < pos - 1 && temp != null; i++) {
            temp = temp.next;
        }

        if (temp == null || temp.next == null) {
            addAtEnd(id, title, author, genre, available);
            return;
        }

        BookNode newNode = new BookNode(id, title, author, genre, available);
        newNode.next = temp.next;
        newNode.prev = temp;
        temp.next.prev = newNode;
        temp.next = newNode;
    }

    /* 4️⃣ Remove Book by ID */
    public void removeByBookId(int id) {
        BookNode temp = head;

        while (temp != null) {
            if (temp.bookId == id) {

                if (temp == head) {
                    head = head.next;
                    if (head != null) head.prev = null;
                } else if (temp == tail) {
                    tail = tail.prev;
                    tail.next = null;
                } else {
                    temp.prev.next = temp.next;
                    temp.next.prev = temp.prev;
                }

                System.out.println("Book removed successfully.");
                return;
            }
            temp = temp.next;
        }
        System.out.println("Book not found!");
    }

    /* 5️⃣ Search by Book Title */
    public void searchByTitle(String title) {
        BookNode temp = head;
        boolean found = false;

        while (temp != null) {
            if (temp.title.equalsIgnoreCase(title)) {
                displayBook(temp);
                found = true;
            }
            temp = temp.next;
        }

        if (!found)
            System.out.println("Book not found!");
    }

    /* 6️⃣ Search by Author */
    public void searchByAuthor(String author) {
        BookNode temp = head;
        boolean found = false;

        while (temp != null) {
            if (temp.author.equalsIgnoreCase(author)) {
                displayBook(temp);
                found = true;
            }
            temp = temp.next;
        }

        if (!found)
            System.out.println("No books found for this author.");
    }

    /* 7️⃣ Update Availability Status */
    public void updateAvailability(int id, boolean status) {
        BookNode temp = head;

        while (temp != null) {
            if (temp.bookId == id) {
                temp.isAvailable = status;
                System.out.println("Availability updated.");
                return;
            }
            temp = temp.next;
        }
        System.out.println("Book not found!");
    }

    /* 8️⃣ Display Forward */
    public void displayForward() {
        if (head == null) {
            System.out.println("Library is empty.");
            return;
        }

        BookNode temp = head;
        while (temp != null) {
            displayBook(temp);
            System.out.println("------------------");
            temp = temp.next;
        }
    }

    /* 9️⃣ Display Reverse */
    public void displayReverse() {
        if (tail == null) {
            System.out.println("Library is empty.");
            return;
        }

        BookNode temp = tail;
        while (temp != null) {
            displayBook(temp);
            System.out.println("------------------");
            temp = temp.prev;
        }
    }

    /* 🔟 Count Total Books */
    public void countBooks() {
        int count = 0;
        BookNode temp = head;

        while (temp != null) {
            count++;
            temp = temp.next;
        }
        System.out.println("Total Books in Library: " + count);
    }

    /* Helper Method */
    private void displayBook(BookNode b) {
        System.out.println("Book ID: " + b.bookId);
        System.out.println("Title: " + b.title);
        System.out.println("Author: " + b.author);
        System.out.println("Genre: " + b.genre);
        System.out.println("Available: " + (b.isAvailable ? "Yes" : "No"));
    }
}