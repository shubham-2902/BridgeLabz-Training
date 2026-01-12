package com.day1.bookshelf;
import java.util.*;
public class BookShelfMain {
	

	    public static void main(String[] args) {

	        Scanner sc = new Scanner(System.in);
	        Library library = new Library();

	        while (true) {
	            System.out.println("\n------ Library Organizer ------");
	            System.out.println("1. Add Book");
	            System.out.println("2. Borrow Book");
	            System.out.println("3. Display Catalog");
	            System.out.println("4. Exit");
	            System.out.print("Enter choice: ");

	            int choice = sc.nextInt();
	            sc.nextLine(); // consume leftover newline

	            switch (choice) {
	                case 1:
	                    System.out.print("Enter Book ID: ");
	                    String id = sc.nextLine();

	                    System.out.print("Enter Title: ");
	                    String title = sc.nextLine();

	                    System.out.print("Enter Author: ");
	                    String author = sc.nextLine();

	                    System.out.print("Enter Genre: ");
	                    String genre = sc.nextLine();

	                    Book book = new Book(id, title, author, genre);
	                    library.addBook(book);
	                    break;

	                case 2:
	                    System.out.print("Enter Book ID to borrow: ");
	                    String bookId = sc.nextLine();
	                    library.borrowBook(bookId);
	                    break;

	                case 3:
	                    library.displayCatalog();
	                    break;

	                case 4:
	                    System.out.println("Exiting program.");
	                    sc.close();
	                    return;

	                default:
	                    System.out.println("Invalid choice. Try again.");
	            }
	        }
	    }
	}
