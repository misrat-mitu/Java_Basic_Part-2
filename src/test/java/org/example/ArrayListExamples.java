package org.example;

import java.util.ArrayList;

public class ArrayListExamples {
    public static void main(String[] args){

        //Array List Declaration --> ArrayList<DataType> name = new ArrayList<DataType>();
        ArrayList<String> names = new ArrayList<>();

        System.out.println("ArrayList: " + names);
        System.out.println("ArrayList Size: " + names.size());

        //Data Add
        names.add("Misrat");
        names.add("Mitu");

        System.out.println("ArrayList: " + names);
        System.out.println("ArrayList Size: " + names.size());
        System.out.println("Is ArrayList Empty?: " + names.isEmpty());

        //for showing specific index data
        System.out.println("Index-2: " + names.get(1));

/*
        //How to remove data
        names.remove("Misrat");
        System.out.println("ArrayList: " + names);

        //For Full ArrayList clear
        names.clear();
        System.out.println("ArrayList: " + names);
*/

        for(String name : names){
            System.out.println(name);
        }


    }
}
