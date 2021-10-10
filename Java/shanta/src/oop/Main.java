package oop;

public class Main {
    public static void main(String[] args) {
        Student s1 = new Student();
        //Student.universityName ="Leading University";
        Student s2 = new Student("Shanta Roy");
        Student s3 = new Student("Shanta Roy",165);
        Student.universityName ="Leading University";
        s1.display();
        //Student.universityName ="Leading University";
    }
}
