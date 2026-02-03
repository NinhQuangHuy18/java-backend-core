package com.example.javabackendcore.model;

public class User {
    private int id;
    private String username;
    private String email;
    private int age;

    //Constructor
    public User(int id, String username, String email, int age){
        this.id = id;
        this.username = username;
        this.email = email;
        this.age = age;
    }

    //Getter
    public int getId() {
        return id;
    }

    public String getUsername() {
        return username;
    }

    public String getEmail() {
        return email;
    }

    public int getAge() {
        return age;
    }

    //Hien thong tin
    public String toString(){
        return "ID: " + id
                + "  |  username: " + username
                + "  |  email: " + email
                + "  |  age: " + age;
    }

}
