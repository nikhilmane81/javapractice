package com.nikhil.Jforce;


import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

class User{
    private int id;
    private String username;
    private int age;

    public User(int id, String username, int age) {
        this.id = id;
        this.username = username;
        this.age = age;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }
}
public class StreamDemo
{
    public static void main(String[] args) {
        User obj1 = new User(1,"nikhil",45);


        List<User> list = new ArrayList<>();
        list.add(obj1);

        List<String>list1 = list.stream().map(User::getUsername).collect(Collectors.toList());

        System.out.println(list);
        System.out.println(list1);
    }
}
