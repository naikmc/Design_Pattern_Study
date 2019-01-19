package com.example.mahesh.designpattern.model;

public class UserModel {
    private User user;

    public UserModel() {
        user = new User("Mahesh", "Naik", 18);
    }

    public String getUserData(){
       return user.getLastName()+" ,"+user.getFirstName();
    }

}
