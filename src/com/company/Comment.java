package com.company;



public class Comment {

    private String text;
    private User user;

    public Comment(User user, String text) {
        this.user = user;
        this.text = text;
    }

    public String getText() {
        return text;
    }

    public String getUserName() {
        return user.getName();
    }

    public String toString(){
        return user + ": " + text;
    }


}
