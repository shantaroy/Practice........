package oop;
import java.util.Scanner;

public class Array {

    public static void main(String[] args) {
        //user inputing
        Scanner input = new Scanner(System.in);
        System.out.println(" Please enter the size of the array");
        int size = input.nextInt();
        int a[] = new int[size];
//        for (int i = 0; i < size; i++)
//        {
//            System.out.println(" Enter the value for " +i);
//            a[i] = input.nextInt();
//        }
        // Single Dimensional
         /* int a[] = new int[3];
          a[0] = 10;
          a[1] = 12;
          a[2] = 14;

          for(int i=0; i<a.length; i++)
          {
              System.out.println(a[i]);
          }*/
          // for each type
          for(int i:a)
          {
              System.out.println(i);
          }
        char c[] = new char[size]; // input character by user
        for (int i = 0; i < size; i++)
        {
            System.out.println(" Enter the value for " +i);
            c[i] = input.next().charAt(0);
        }
        for(char i:c)
        {
            System.out.println(i);
        }



    }

}
