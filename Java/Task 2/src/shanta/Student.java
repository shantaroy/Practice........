package shanta;

public class Student {
    String name;
    int id;
    static String universityName;
    Student(){
        System.out.println("Default Constractor");
    }

    Student (String name){
        this.name = name;
        System.out.println("Name: "+this.name);

    }

    Student (String name,int id){
        this.name = name;
        this.id = id;
        System.out.println("Id: "+this.id);
    }

    void display(){
        System.out.println("University name:"+universityName);
    }

}
/*
      Name: Shotabdi Roy Shanta
      ID : 2012020165
      Section : D
      Email : cse_2012020165@lus.ac.bd
      Date : 06.08.2021
 */
