package com.example.javabackendcore.app;

import com.example.javabackendcore.model.User;
import com.example.javabackendcore.service.UserService;

import java.util.List;

public class Main {
    public static void main(String[] args) {
        UserService userService = new UserService();

        // Them user
        userService.addUser(new User(1, "admin", "admin@gmail.com", 18));
        userService.addUser(new User(2, "user1", "user1@gmail.com", 20));
        userService.addUser(new User(3, "user2", "user2@gmail.com", 17)); // loi
        userService.addUser(new User(4, "admin", "abc@gmail.com", 25));   // trung

        // Hien thi user
        System.out.println("===Danh sach user===");
        userService.showAll();

        // Tim user theo tuoi
        System.out.println("===Tim user theo tuoi >= 18===");
        for(User u : userService.findByAgeGreaterThan(18)){
            System.out.println(u);
        }

        // Xoa user theo id
        System.out.println("===Xoa user theo id = 2===");
        userService.deleteById(2);

        System.out.println("===Sau khi xoa===");
        userService.showAll();





    }
}