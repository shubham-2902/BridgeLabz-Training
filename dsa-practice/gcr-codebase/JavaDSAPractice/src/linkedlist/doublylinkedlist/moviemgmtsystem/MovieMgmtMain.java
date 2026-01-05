package linkedlist.doublylinkedlist.moviemgmtsystem;

public class MovieMgmtMain {

    public static void main(String[] args) {

        MovieDoublyLinkedList movies = new MovieDoublyLinkedList();

        movies.addAtBeginning("3 Idiots", "Rajkumar Hirani", 2009, 9.2);
        movies.addAtEnd("Dangal", "Nitesh Tiwari", 2016, 9.0);
        movies.addAtEnd("Andhadhun", "Sriram Raghavan", 2018, 8.4);

        movies.addAtPosition(2, "Lagaan", "Ashutosh Gowariker", 2001, 8.8);

        System.out.println("All Movies (Forward):");
        movies.displayForward();

        System.out.println("\nMovies by Director Ashutosh Gowariker:");
        movies.searchByDirector("Ashutosh Gowariker");

        System.out.println("\nMovies with Rating >= 8.5:");
        movies.searchByRating(8.5);

        System.out.println("\nUpdating Rating of Dangal:");
        movies.updateRating("Dangal", 9.1);

        System.out.println("\nRemoving Lagaan:");
        movies.removeByTitle("Lagaan");

        System.out.println("\nAll Movies (Reverse):");
        movies.displayReverse();
    }
}
