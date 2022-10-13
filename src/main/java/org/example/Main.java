package org.example;

import org.example.frame.LoginFrame;
import org.example.frame.RegisterFrame;
import org.example.user.User;
import org.example.user.UserService;

import javax.swing.*;

public class Main {
    public static void main(String[] args) {
        UserService userService = new UserService();
        LoginFrame loginFrame = new LoginFrame(userService);
    }
}