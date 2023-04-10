package com.nikhil.collection;

import java.util.Arrays;

class Student implements Comparable<Student>
{
    int rollno;
    String name;

    int age;

    public Student(int rollno, String name, int age) {
        this.rollno = rollno;
        this.name = name;
        this.age = age;
    }

    @Override
    public String toString() {
        return this.rollno+" "+this.name+" "+this.age;
    }

    @Override
    public int compareTo(Student o) {
        return Integer.compare(age, o.age);
    }
}
public class ComparableDemo
{
    public static void main(String[] args) {
        Student s1 = new Student(1,"Nikhil", 27);
        Student s2 = new Student(23,"Aish", 26);
        Student s3 = new Student(12,"Nisur", 34);
        Student s4 = new Student(45, "Rawam", 34);
        Student[] arr = {s1,s2,s3,s4};
        Arrays.sort(arr);
        for (Student student : arr) {
            System.out.println(student);
        }
    }
}
