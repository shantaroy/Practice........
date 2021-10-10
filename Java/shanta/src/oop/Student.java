package oop;

public class Student {
    String name;
    int id;
    static String universityName;
    Student(){
        System.out.println("Default constructor");
    }
    Student(String name){
        this.name = name;
        System.out.println("Name: "+this.name);
    }
    Student(String name, int id){
        this.name = name;
        this.id =id;
        System.out.println("Id: "+this.id);
    }
    void display(){
        System.out.println("University name: "+universityName);
    }

}
