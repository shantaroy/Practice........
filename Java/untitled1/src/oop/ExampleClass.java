package oop;

class ExampleClass{
    public int x;

    ExampleClass(){
        x = 0;
        System.out.println("an object has been created");
    }

    ExampleClass(int x){
        this.x = x;
        x = 10;
    }

    void showValue(ExampleClass e){
        System.out.println("X = "+ e.x);
    }
}




