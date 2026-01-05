package linkedlist.singlylinkedlist.inventorymgmtsystem;

public class InventoryLinkedList {

    private ItemNode head;

    /* Add at Beginning */
    public void addAtBeginning(int id, String name, int qty, double price) {
        ItemNode newNode = new ItemNode(id, name, qty, price);
        newNode.next = head;
        head = newNode;
    }

    /* Add at End */
    public void addAtEnd(int id, String name, int qty, double price) {
        ItemNode newNode = new ItemNode(id, name, qty, price);

        if (head == null) {
            head = newNode;
            return;
        }

        ItemNode temp = head;
        while (temp.next != null) {
            temp = temp.next;
        }
        temp.next = newNode;
    }

    /* Add at Specific Position (1-based) */
    public void addAtPosition(int pos, int id, String name, int qty, double price) {
        if (pos <= 1) {
            addAtBeginning(id, name, qty, price);
            return;
        }

        ItemNode temp = head;
        for (int i = 1; i < pos - 1 && temp != null; i++) {
            temp = temp.next;
        }

        if (temp == null) {
            System.out.println("Invalid position!");
            return;
        }

        ItemNode newNode = new ItemNode(id, name, qty, price);
        newNode.next = temp.next;
        temp.next = newNode;
    }

    /*Remove Item by ID */
    public void removeByItemId(int id) {
        if (head == null) {
            System.out.println("Inventory empty!");
            return;
        }

        if (head.itemId == id) {
            head = head.next;
            System.out.println("Item removed.");
            return;
        }

        ItemNode temp = head;
        while (temp.next != null && temp.next.itemId != id) {
            temp = temp.next;
        }

        if (temp.next == null) {
            System.out.println("Item not found!");
        } else {
            temp.next = temp.next.next;
            System.out.println("Item removed.");
        }
    }

    /* Update Quantity by Item ID */
    public void updateQuantity(int id, int newQty) {
        ItemNode temp = head;

        while (temp != null) {
            if (temp.itemId == id) {
                temp.quantity = newQty;
                System.out.println("Quantity updated.");
                return;
            }
            temp = temp.next;
        }
        System.out.println("Item not found!");
    }

    /*  Search by Item ID */
    public void searchById(int id) {
        ItemNode temp = head;

        while (temp != null) {
            if (temp.itemId == id) {
                displayItem(temp);
                return;
            }
            temp = temp.next;
        }
        System.out.println("Item not found!");
    }

    /*  Search by Item Name */
    public void searchByName(String name) {
        ItemNode temp = head;
        boolean found = false;

        while (temp != null) {
            if (temp.itemName.equalsIgnoreCase(name)) {
                displayItem(temp);
                found = true;
            }
            temp = temp.next;
        }

        if (!found)
            System.out.println("Item not found!");
    }

    /*  Calculate Total Inventory Value */
    public void calculateTotalValue() {
        double total = 0;
        ItemNode temp = head;

        while (temp != null) {
            total += temp.price * temp.quantity;
            temp = temp.next;
        }

        System.out.println("Total Inventory Value: ₹" + total);
    }

    /* Sort by Name (Ascending / Descending) */
    public void sortByName(boolean ascending) {
        for (ItemNode i = head; i != null; i = i.next) {
            for (ItemNode j = i.next; j != null; j = j.next) {
                if ((ascending && i.itemName.compareToIgnoreCase(j.itemName) > 0) ||
                    (!ascending && i.itemName.compareToIgnoreCase(j.itemName) < 0)) {
                    swap(i, j);
                }
            }
        }
        System.out.println("Inventory sorted by name.");
    }

    /*Sort by Price (Ascending / Descending) */
    public void sortByPrice(boolean ascending) {
        for (ItemNode i = head; i != null; i = i.next) {
            for (ItemNode j = i.next; j != null; j = j.next) {
                if ((ascending && i.price > j.price) ||
                    (!ascending && i.price < j.price)) {
                    swap(i, j);
                }
            }
        }
        System.out.println("Inventory sorted by price.");
    }

    /* Display All Items */
    public void displayAll() {
        if (head == null) {
            System.out.println("Inventory empty.");
            return;
        }

        ItemNode temp = head;
        while (temp != null) {
            displayItem(temp);
            System.out.println("------------------");
            temp = temp.next;
        }
    }

    /* Helper Methods */
    private void swap(ItemNode a, ItemNode b) {
        int id = a.itemId;
        String name = a.itemName;
        int qty = a.quantity;
        double price = a.price;

        a.itemId = b.itemId;
        a.itemName = b.itemName;
        a.quantity = b.quantity;
        a.price = b.price;

        b.itemId = id;
        b.itemName = name;
        b.quantity = qty;
        b.price = price;
    }

    private void displayItem(ItemNode i) {
        System.out.println("Item ID: " + i.itemId);
        System.out.println("Name: " + i.itemName);
        System.out.println("Quantity: " + i.quantity);
        System.out.println("Price: ₹" + i.price);
    }
}