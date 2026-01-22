package com.day9.universityrecordsystem;

public class StudentBST {
    private BSTNode root;

    public StudentBST() {
        this.root = null;
    }

    // =========================
    // Scenario 1: INSERTION
    // =========================
    public void insert(Student student) {
        root = insertRec(root, student);
    }

    private BSTNode insertRec(BSTNode root, Student student) {
        if (root == null) {
            return new BSTNode(student);
        }

        int roll = student.getRollNo();
        int rootRoll = root.student.getRollNo();

        if (roll < rootRoll) {
            root.left = insertRec(root.left, student);
        } else if (roll > rootRoll) {
            root.right = insertRec(root.right, student);
        } else {
            // Duplicate roll numbers not allowed
            System.out.println("Duplicate roll number not allowed: " + roll);
        }
        return root;
    }

    // =========================
    // Scenario 3: SEARCH
    // =========================
    public Student search(int rollNo) {
        BSTNode node = searchRec(root, rollNo);
        return node == null ? null : node.student;
    }

    private BSTNode searchRec(BSTNode root, int rollNo) {
        if (root == null) return null;

        int rootRoll = root.student.getRollNo();

        if (rollNo == rootRoll) return root;
        if (rollNo < rootRoll) return searchRec(root.left, rollNo);
        return searchRec(root.right, rollNo);
    }

    // =========================
    // Scenario 3: DISPLAY SORTED (Inorder)
    // =========================
    public void displaySortedRollNumbers() {
        if (root == null) {
            System.out.println("No student records found.");
            return;
        }
        System.out.println("Sorted Student Roll Numbers (Inorder Traversal):");
        inorderRec(root);
        System.out.println();
    }

    private void inorderRec(BSTNode root) {
        if (root == null) return;
        inorderRec(root.left);
        System.out.println(root.student);
        inorderRec(root.right);
    }

    // =========================
    // Scenario 2: DELETION
    // =========================
    public void delete(int rollNo) {
        root = deleteRec(root, rollNo);
    }

    private BSTNode deleteRec(BSTNode root, int rollNo) {
        if (root == null) {
            System.out.println("Roll number not found: " + rollNo);
            return null;
        }

        int rootRoll = root.student.getRollNo();

        if (rollNo < rootRoll) {
            root.left = deleteRec(root.left, rollNo);
        } else if (rollNo > rootRoll) {
            root.right = deleteRec(root.right, rollNo);
        } else {
            // Node found - handle 3 cases:

            // Case 1: No child
            if (root.left == null && root.right == null) {
                return null;
            }

            // Case 2: One child
            if (root.left == null) return root.right;
            if (root.right == null) return root.left;

            // Case 3: Two children
            // Replace with inorder successor (smallest in right subtree)
            BSTNode successor = findMin(root.right);
            root.student = successor.student;
            root.right = deleteRec(root.right, successor.student.getRollNo());
        }
        return root;
    }

    private BSTNode findMin(BSTNode node) {
        BSTNode current = node;
        while (current != null && current.left != null) {
            current = current.left;
        }
        return current;
    }
}
