package linkedlist.doublylinkedlist.moviemgmtsystem;

public class MovieNode {
	
		
		//Declaration of the variables
	    String title;
	    String director;
	    int year;
	    double rating;

	    MovieNode prev;
	    MovieNode next;

	    //Constructor
	    MovieNode(String title, String director, int year, double rating) {
	        this.title = title;
	        this.director = director;
	        this.year = year;
	        this.rating = rating;
	        this.prev = null;
	        this.next = null;
	    }
	}


