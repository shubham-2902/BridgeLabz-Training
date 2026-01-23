package com.day10.hospitalqueuemgmt;
public class PatientAVLTree {

    private PatientNode root;

    // Comparator: primary = checkInTime, secondary = patientName
    // Secondary needed because two patients can arrive at same time.
    private int compare(int t1, String n1, int t2, String n2) {
        if (t1 != t2) return Integer.compare(t1, t2);
        return n1.compareTo(n2);
    }

    private int height(PatientNode node) {
        return (node == null) ? 0 : node.height;
    }

    private int getBalance(PatientNode node) {
        return (node == null) ? 0 : height(node.left) - height(node.right);
    }

    // LL Rotation
    private PatientNode rightRotate(PatientNode y) {
        PatientNode x = y.left;
        PatientNode T2 = x.right;

        x.right = y;
        y.left = T2;

        y.height = 1 + Math.max(height(y.left), height(y.right));
        x.height = 1 + Math.max(height(x.left), height(x.right));

        return x;
    }

    // RR Rotation
    private PatientNode leftRotate(PatientNode x) {
        PatientNode y = x.right;
        PatientNode T2 = y.left;

        y.left = x;
        x.right = T2;

        x.height = 1 + Math.max(height(x.left), height(x.right));
        y.height = 1 + Math.max(height(y.left), height(y.right));

        return y;
    }

    // ==========================
    // Register Patient
    // ==========================
    public void registerPatient(int checkInTime, String patientName) {
        root = insert(root, checkInTime, patientName);
    }

    private PatientNode insert(PatientNode node, int time, String name) {

        if (node == null) return new PatientNode(time, name);

        int cmp = compare(time, name, node.checkInTime, node.patientName);

        if (cmp < 0) node.left = insert(node.left, time, name);
        else if (cmp > 0) node.right = insert(node.right, time, name);
        else return node; // exact duplicate not allowed

        node.height = 1 + Math.max(height(node.left), height(node.right));
        int balance = getBalance(node);

        // LL
        if (balance > 1 && compare(time, name, node.left.checkInTime, node.left.patientName) < 0)
            return rightRotate(node);

        // RR
        if (balance < -1 && compare(time, name, node.right.checkInTime, node.right.patientName) > 0)
            return leftRotate(node);

        // LR
        if (balance > 1 && compare(time, name, node.left.checkInTime, node.left.patientName) > 0) {
            node.left = leftRotate(node.left);
            return rightRotate(node);
        }

        // RL
        if (balance < -1 && compare(time, name, node.right.checkInTime, node.right.patientName) < 0) {
            node.right = rightRotate(node.right);
            return leftRotate(node);
        }

        return node;
    }

    // ==========================
    // Discharge Patient (Delete)
    // ==========================
    public void dischargePatient(int checkInTime, String patientName) {
        root = delete(root, checkInTime, patientName);
    }

    private PatientNode minValueNode(PatientNode node) {
        while (node.left != null) node = node.left;
        return node;
    }

    private PatientNode delete(PatientNode node, int time, String name) {

        if (node == null) return null;

        int cmp = compare(time, name, node.checkInTime, node.patientName);

        if (cmp < 0) node.left = delete(node.left, time, name);
        else if (cmp > 0) node.right = delete(node.right, time, name);
        else {

            // node found
            if (node.left == null || node.right == null) {
                node = (node.left != null) ? node.left : node.right;
            } else {
                PatientNode temp = minValueNode(node.right);
                node.checkInTime = temp.checkInTime;
                node.patientName = temp.patientName;
                node.right = delete(node.right, temp.checkInTime, temp.patientName);
            }
        }

        if (node == null) return null;

        node.height = 1 + Math.max(height(node.left), height(node.right));
        int balance = getBalance(node);

        // LL
        if (balance > 1 && getBalance(node.left) >= 0) return rightRotate(node);

        // LR
        if (balance > 1 && getBalance(node.left) < 0) {
            node.left = leftRotate(node.left);
            return rightRotate(node);
        }

        // RR
        if (balance < -1 && getBalance(node.right) <= 0) return leftRotate(node);

        // RL
        if (balance < -1 && getBalance(node.right) > 0) {
            node.right = rightRotate(node.right);
            return leftRotate(node);
        }

        return node;
    }

    // ==========================
    // Display Patients by Time
    // ==========================
    public void displayByArrivalTime() {
        if (root == null) {
            System.out.println("No patients in queue.");
            return;
        }

        System.out.println("\n--- PATIENT QUEUE (BY ARRIVAL TIME) ---");
        inorder(root);
    }

    private void inorder(PatientNode node) {
        if (node == null) return;
        inorder(node.left);
        System.out.println(formatTime(node.checkInTime) + " -> " + node.patientName);
        inorder(node.right);
    }

    // Helper to format time (930 => 09:30)
    public static String formatTime(int time) {
        int h = time / 100;
        int m = time % 100;
        return String.format("%02d:%02d", h, m);
    }
}
