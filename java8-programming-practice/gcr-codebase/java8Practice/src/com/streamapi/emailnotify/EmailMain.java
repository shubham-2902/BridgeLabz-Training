package com.streamapi.emailnotify;
import java.util.*;

public class EmailMain {

    public static void sendEmailNotification(String email) {
        System.out.println("Sending email to: " + email);
    }

    public static void main(String[] args) {
        List<User> users = Arrays.asList(
            new User("a@gmail.com"),
            new User("b@gmail.com"),
            new User("c@gmail.com")
        );

        users.forEach(user -> sendEmailNotification(user.getEmail()));
    }
}
