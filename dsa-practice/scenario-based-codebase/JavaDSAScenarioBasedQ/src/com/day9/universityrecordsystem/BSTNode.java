package com.day9.universityrecordsystem;

public class BSTNode {
    Student student;
    BSTNode left;
    BSTNode right;

    public BSTNode(Student student) {
        this.student = student;
        this.left = null;
        this.right = null;
    }
}
