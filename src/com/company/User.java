package com.company;

public class User {

    private String name;
    private String password;
    private String login;
    private int userId;

    private static int currentUserId = 1;

    public User(String name) {
        this.name = name;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public void setLogin(String login){
        this.login = login;
    }

    public String getName() {
        return name;
    }


}
