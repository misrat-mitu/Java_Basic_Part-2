package org.example;

public class ForLoopExamples {
    public static void main(String[] args){


        //For Loop Syntax--- for(init; condition; inc/dec)
/*
        for(int i = 1; i<10; i++){
            System.out.println("i = " + i);
        }
*/

        //For Each Loop:
         int[] numbers = {1,2,3,4,5,6,7,8,9,10};
//         for(int i = 0; i<numbers.length; i++){
//             System.out.println(numbers[i]);
//         }

/*
         //easy way
         for(int number: numbers){
             System.out.println("Count: " + number);
         }
*/
        //Even number
        for(int number : numbers){
            if(number % 2 == 0){
                System.out.println(number);
            }
        }
    }
}
