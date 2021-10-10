package oop;

public class Main
{

    public static void main(String[] args){
        ExampleClass a, b, c;
        a = new ExampleClass();
        b = new ExampleClass(5);
        c = a;
        c.x = 15;
        a.showValue(b);
        b.showValue(c);
        System.out.println("X = " + a.x);
       }

}

