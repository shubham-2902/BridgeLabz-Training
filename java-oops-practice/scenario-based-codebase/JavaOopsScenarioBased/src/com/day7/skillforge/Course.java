package com.day7.skillforge;
public class Course {

    private String title;
    private Instructor instructor;
    private String[] modules;

    private double rating;          // protected logic
    private int totalReviews;        // internal, read-only

    // Constructor with default modules
    public Course(String title, Instructor instructor) {
        this(title, instructor, new String[]{"Intro", "Basics", "Final Project"});
    }

    // Constructor with custom modules
    public Course(String title, Instructor instructor, String[] modules) {
        this.title = title;
        this.instructor = instructor;
        this.modules = modules;
        this.rating = 0.0;
        this.totalReviews = 0;
    }

    // Encapsulated rating logic
    public void addReview(int stars) {
        rating = (rating * totalReviews + stars) / (++totalReviews);
    }

    public double getRating() {
        return rating; // read-only access
    }

    public int getModuleCount() {
        return modules.length;
    }

    public String getTitle() {
        return title;
    }

    public void showCourseDetails() {
        System.out.println("Course: " + title);
        System.out.println("Instructor: " + instructor.getName());
        System.out.println("Rating: " + rating);
        System.out.println("Modules:");
        for (String m : modules) {
            System.out.println("- " + m);
        }
    }
}
