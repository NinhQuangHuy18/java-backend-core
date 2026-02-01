package com.example.javabackendcore.service;

import com.example.javabackendcore.model.User;

import java.util.ArrayList;
import java.util.List;

public class UserService {
    private List<User> users = new ArrayList<>();

    // Them user
    public void addUser(User user){
        users.add(user);
    }

    // Hien thi danh sach user
    public void showAllUser(){
        if(users.isEmpty()){
            System.out.println("Danh sach trong");
            return;
        }

        for(User u : users){
            u.display();
        }
    }

    // Tim user theo ten
    public User findByUsername(String username){
        for(User u : users){
            if(u.getUsername().equals(username)){
                return u;
            }
        }
        return null;
    }

}
