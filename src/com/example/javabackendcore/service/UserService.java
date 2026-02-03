package com.example.javabackendcore.service;

import com.example.javabackendcore.model.User;

import java.util.ArrayList;
import java.util.List;

public class UserService {
    private List<User> users = new ArrayList<>();

    // Them user
    public void addUser(User user){
        if(user.getUsername() == null || user.getUsername().isEmpty()){
            System.out.println("User khong duoc rong");
            return;
        }

        if(!user.getEmail().contains("@")){
            System.out.println("Email khong hop le");
            return;
        }

        if(user.getAge() < 18){
            System.out.println("Tuoi phai >= 18");
            return;
        }

        for(User u : users){
            if(u.getUsername().equals(user.getUsername())){
                System.out.println("Username da ton tai");
                return;
            }
        }

        users.add(user);
        System.out.println("Them user thanh cong");
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

    // Tim thong tin theo tuoi
    public List<User> findByAgeGreaterThan(int age){
        List<User> result = new ArrayList<>();
        for(User u : users){
            if(u.getAge() > age){
                result.add(u);
            }
        }
        return result;
    }

    // Xoa theo id
    public boolean deleteById(int id){
        return users.removeIf(u -> u.getId() == id);
    }

    // Hien thi danh sach
    public void showAll(){
        if(users.isEmpty()){
            System.out.println("Danh sach rong");
            return;
        }

        for(User u : users){
            System.out.println(u);
        }
    }
}
