package linkedlist.singlylinkedlist.inventorymgmtsystem;

public class InventoryMgmtMain {
	    public static void main(String[] args) {

	        InventoryLinkedList inventory = new InventoryLinkedList();

	        inventory.addAtEnd(101, "Keyboard", 10, 800);
	        inventory.addAtEnd(102, "Mouse", 25, 400);
	        inventory.addAtBeginning(103, "Monitor", 5, 12000);
	        inventory.addAtPosition(2, 104, "CPU", 3, 25000);

	        System.out.println("Inventory Items:");
	        inventory.displayAll();

	        System.out.println("\nSearch by ID 102:");
	        inventory.searchById(102);

	        System.out.println("\nUpdate Quantity of ID 101:");
	        inventory.updateQuantity(101, 15);

	        System.out.println("\nTotal Inventory Value:");
	        inventory.calculateTotalValue();

	        System.out.println("\nSort by Name (Ascending):");
	        inventory.sortByName(true);
	        inventory.displayAll();

	        System.out.println("\nSort by Price (Descending):");
	        inventory.sortByPrice(false);
	        inventory.displayAll();

	        System.out.println("\nRemove Item ID 103:");
	        inventory.removeByItemId(103);
	        inventory.displayAll();
	    }
	}


