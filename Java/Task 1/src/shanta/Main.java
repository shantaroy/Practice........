package shanta;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
	// write your code here
        Scanner input = new Scanner(System.in);
        System.out.println("Enter your section: ");
        String section = input.nextLine();

        Info info = new Info();
        Hobby hobby = new Hobby();

        System.out.println("Your section is: " + section);
        System.out.println("Your name is: " + info.name);
        System.out.println("Your id is: " + info.id);
        System.out.println("Here are your hobbies: " + hobby.hobbyName);

    }
}
/*
            Name: Shotabdi Roy Shanta
            ID : 2012020165
            Section : D
            Email : shantaroy7515@gmail.com, cse_2012020165@lus.ac.bd
            Date : 14.07.2021
 */