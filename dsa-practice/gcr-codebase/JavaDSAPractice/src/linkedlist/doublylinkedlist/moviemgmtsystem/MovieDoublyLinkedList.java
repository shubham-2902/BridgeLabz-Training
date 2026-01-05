package linkedlist.doublylinkedlist.moviemgmtsystem;

public class MovieDoublyLinkedList {

    private MovieNode head;
    private MovieNode tail;

    // Add at Beginning
    public void addAtBeginning(String title, String director, int year, double rating) {
        MovieNode newNode = new MovieNode(title, director, year, rating);

        if (head == null) {
            head = tail = newNode;
        } else {
            newNode.next = head;
            head.prev = newNode;
            head = newNode;
        }
    }

    // Add at End
    public void addAtEnd(String title, String director, int year, double rating) {
        MovieNode newNode = new MovieNode(title, director, year, rating);

        if (tail == null) {
            head = tail = newNode;
        } else {
            tail.next = newNode;
            newNode.prev = tail;
            tail = newNode;
        }
    }

    // Add at Specific Position (1-based index)
    public void addAtPosition(int position, String title, String director, int year, double rating) {
        if (position <= 1) {
            addAtBeginning(title, director, year, rating);
            return;
        }

        MovieNode temp = head;
        for (int i = 1; i < position - 1 && temp != null; i++) {
            temp = temp.next;
        }

        if (temp == null || temp.next == null) {
            addAtEnd(title, director, year, rating);
            return;
        }

        MovieNode newNode = new MovieNode(title, director, year, rating);
        newNode.next = temp.next;
        newNode.prev = temp;
        temp.next.prev = newNode;
        temp.next = newNode;
    }

    // Remove by Movie Title
    public void removeByTitle(String title) {
        MovieNode temp = head;

        while (temp != null) {
            if (temp.title.equalsIgnoreCase(title)) {

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

                System.out.println("Movie removed successfully.");
                return;
            }
            temp = temp.next;
        }
        System.out.println("Movie not found!");
    }

    // Search by Director
    public void searchByDirector(String director) {
        MovieNode temp = head;
        boolean found = false;

        while (temp != null) {
            if (temp.director.equalsIgnoreCase(director)) {
                displayMovie(temp);
                found = true;
            }
            temp = temp.next;
        }

        if (!found) {
            System.out.println("No movies found for this director.");
        }
    }

    // 6️⃣ Search by Rating (>= given rating)
    public void searchByRating(double rating) {
        MovieNode temp = head;
        boolean found = false;

        while (temp != null) {
            if (temp.rating >= rating) {
                displayMovie(temp);
                found = true;
            }
            temp = temp.next;
        }

        if (!found) {
            System.out.println("No movies found with this rating.");
        }
    }

    // Update Rating by Movie Title
    public void updateRating(String title, double newRating) {
        MovieNode temp = head;

        while (temp != null) {
            if (temp.title.equalsIgnoreCase(title)) {
                temp.rating = newRating;
                System.out.println("Rating updated successfully.");
                return;
            }
            temp = temp.next;
        }
        System.out.println("Movie not found!");
    }

    // Display Forward
    public void displayForward() {
        if (head == null) {
            System.out.println("No movie records available.");
            return;
        }

        MovieNode temp = head;
        while (temp != null) {
            displayMovie(temp);
            System.out.println("--------------------");
            temp = temp.next;
        }
    }

    // Display Reverse
    public void displayReverse() {
        if (tail == null) {
            System.out.println("No movie records available.");
            return;
        }

        MovieNode temp = tail;
        while (temp != null) {
            displayMovie(temp);
            System.out.println("--------------------");
            temp = temp.prev;
        }
    }

    // Helper Method
    private void displayMovie(MovieNode m) {
        System.out.println("Title: " + m.title);
        System.out.println("Director: " + m.director);
        System.out.println("Year: " + m.year);
        System.out.println("Rating: " + m.rating);
    }
}