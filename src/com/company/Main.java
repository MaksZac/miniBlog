package com.company;
import java.util.List;

import java.util.ArrayList;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

       List<Post> postList = new ArrayList<>();

        postList.add(new Post(new User("name1"), "title1"));
        postList.add(new Post(new User("name2"), "title2"));
        postList.add(new Post(new User("name3"), "title3", "content3"));




        Scanner scanner = new Scanner(System.in);
        while(true) {
            System.out.println("1 - Przegląd post"); // nasze utworzone posty ręcznie
            System.out.println("2 - Dodaj post");
            int n = scanner.nextInt();

            switch (n) {
                case 1:
                    case1(postList);
                    break;
                case 2:

            }
        }

    }

    public static void case1(List<Post> list){
        Scanner sc = new Scanner(System.in);
        for (Post e : list){
            System.out.println(e);
        }
        System.out.println("Wybierz post:");
        int id = sc.nextInt();
        for( Post e : list){
            if (id == e.getId()){
                System.out.println(e + "\n");
                System.out.println(e.getContent());
                System.out.println("Komentarze:");
                System.out.println(e.getComments());
                System.out.println("1 - Dodaj komentarz");
                int choice = sc.nextInt();
                if (choice == 1){
                    System.out.println("Podaj imie:");
                    String imie = sc.next();
                    System.out.println("Wpisz komentarz:");
                    String txt = sc.next();
                    User user = new User(imie);
                    Comment com = new Comment(user, txt);
                    e.setComment(com);
                }
            }
        }


    }
}
