package org.example;

public class MethodCalling {

    public void div(int a,int b){
        System.out.println("Division by " + a + "and " + b + "is: " + a/b);
    }


    public static void main(String[] args){
        MethodExamples obj = new MethodExamples();
        obj.sum(22,33);

        MethodCalling obj2 = new MethodCalling();
        obj2.div(5,9);
    }
}
