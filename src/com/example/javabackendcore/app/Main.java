package com.example.javabackendcore.app;

import com.example.javabackendcore.model.User;
import com.example.javabackendcore.service.UserService;

public class Main {
    public static void main(String[] args) {
        UserService userService = new UserService();

        // Them user
        userService.addUser(new User(1, "admin", "admin@gmail.com", "ACTIVE"));
        userService.addUser(new User(2, "user1", "user1@gmail.com", "ACTIVE"));
        userService.addUser(new User(3, "user2", "user2@gmail.com", "ACTIVE"));

        // Hien thi user
        System.out.println("===Danh sach user===");
        userService.showAllUser();

        // Tim user
        System.out.println("===Tim user===");
        User found = userService.findByUsername("admin");

        if(found != null){
            found.display();
        }else{
            System.out.println("Khong tim thay user");
        }

    }
}