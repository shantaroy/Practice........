package oop;

public class Main {

    int multiply(int a, int b) // changing the number of argument
    {
        int result =a*b;
        return result;
    }
    int multiply(int a, int b, int c)
    {
        int result = a*b*c;
        return result;
    }
    int add ( int a, int b)    //change the datatype
    {
        int result = a+b;
        return result;
    }
    float add (float a, float b, float c)
    {
        float result= a+b+c;
        return result;

    }


    public static void main(String[] args) {
        Main main = new Main();
        System.out.println("Ans: "+main.add(22, 22, 10));

    }
}
