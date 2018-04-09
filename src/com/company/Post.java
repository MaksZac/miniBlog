package com.company;

import com.company.Comment;
import com.company.User;

import java.util.ArrayList;
import java.util.List;

public class Post {

    private String title;
    private String content;
    private List<Comment> list = new ArrayList<>();
    private User author;
    private int id;

    private static int idCurrent =1; // niezaleznie od obuiekt

    public Post(User author, String title) {
        this.title = title;
        this.author = author;
        this.id=idCurrent++;
    }

    public Post( User author, String title, String content) {
        this.title = title;
        this.content = content;
        this.author = author;
        this.id = idCurrent++;
    }

    public String getContent() {

        return content;
    }

    public int getId() {
        return id;
    }

    public void setContent(String content) {
        this.content = content;
    }

    public void setComment(Comment comment) {
        list.add(comment);
    }

    public String getTitle() {
        return title;
    }

    public String getAuthor() {
        return author.getName();
    }

    public  String toString(){
        return id+" "+author.getName()+" "+title;
    }

    public List<Comment> getComments() {
        return list;
    }
}
