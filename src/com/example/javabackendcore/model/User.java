package com.example.javabackendcore.model;

public class User {
    private int id;
    private String username;
    private String email;
    private String status;

    //Constructor
    public User(int id, String username, String email, String status){
        this.id = id;
        this.username = username;
        this.email = email;
        this.status = status;
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

    public String getStatus() {
        return status;
    }

    //Hien thong tin
    public void display(){
        System.out.println("ID: " + id
                + "  |  Username: " + username
                + "  |  Email: " + email
                + "  |  Status: " + status);
    }

}
