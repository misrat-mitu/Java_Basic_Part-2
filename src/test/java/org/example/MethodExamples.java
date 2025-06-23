package org.example;

public class MethodExamples {

    /*
            Static -->  Static Direct Access,       Non Static Access --> Must need a Object
            Non Static --> All Static and Non Static can Access without Object
     */

    // Non Static --> Static and Non Static Access
    int a = 10;
    static int b = 20;

    public void mul(){
        int c = a * b;
    }

    public void sum(int a, int b){
        int sum = a + b;
        System.out.println("Summation: " + sum);
    }

    public static void sub(int d, int b){
        int sub = d - b;
        System.out.println("Subtraction: " + sub);

        //non static k static er moddhe call kora
        MethodExamples obj = new MethodExamples();
        int c = obj. a * b;
    }

    public static void main(String[] args){

        //Object Declaration: ClassName then Object name = New ClassName();
        sub(19,2);
        MethodExamples obj = new MethodExamples();
        obj.sum(20,30);

    }
}
