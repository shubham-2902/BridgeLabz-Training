package com.designpattern.smartuniversitylibrary;
interface User extends Observer {
    void showRole();
}

class Student implements User {
    String name;
    public Student(String name){ this.name=name; }
    public void showRole(){ System.out.println(name+" is Student"); }
    public void update(String msg){ System.out.println(name+" notified: "+msg); }
}

class Faculty implements User {
    String name;
    public Faculty(String name){ this.name=name; }
    public void showRole(){ System.out.println(name+" is Faculty"); }
    public void update(String msg){ System.out.println(name+" notified: "+msg); }
}

class Librarian implements User {
    String name;
    public Librarian(String name){ this.name=name; }
    public void showRole(){ System.out.println(name+" is Librarian"); }
    public void update(String msg){ System.out.println(name+" notified: "+msg); }
}

class UserFactory {
    public static User createUser(String type, String name) {
        switch(type.toLowerCase()) {
            case "student": return new Student(name);
            case "faculty": return new Faculty(name);
            case "librarian": return new Librarian(name);
            default: throw new IllegalArgumentException("Invalid type");
        }
    }
}
