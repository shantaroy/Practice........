package oop;

public class Student {
    String name,gender;
    int phone;
    Student(){
        System.out.println("No value");
    }
    Student(String n,String g, int phn){
        name = n;
        gender = g;
        phone = phn;
    }
    void display(){
        System.out.println("Name: " +name);
        System.out.println("Gender: " +gender);
        System.out.println("Phone :"+phone);
    }
}
