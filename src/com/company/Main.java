package com.company;

import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        // write your code here

        Scanner keybd = new Scanner( System.in );
        Animal animal = new Animal();

        String animalType;
        String name;
        String Description;
        boolean x;

        boolean list = true;

        while (list){
            System.out.println( ".......List of Animals........." );

            System.out.println( "Please enter a name ?" );
            String nam = keybd.nextLine();
            animal.setName(nam);

            System.out.println( "Please enter animalType ?" );
            String animaltyp = keybd.nextLine();
            animal.setType(animaltyp );

            System.out.println( "Please enter description ?" );
            String description = keybd.nextLine();
           animal.setDescription(description);

       //   animal= new Animal(nam,animaltyp, animaltyp);

//            animal.toString();

 //          System.out.println("Aniaml name  "+nam +" Type  " +animaltyp +" Description  "+ description);
            System.out.println("Animal name  "+animal.getName() +" Type  " +animal.getType() +" Description  "+ animal.getDescription());
            System.out.println( "Do you want to create animal list again?" );
            String input = keybd.nextLine();


            if (input.equals("yes")) {
             //   System.out.println( "Do you want to create animal list ?" );
                list=true;

            }
            else {
                list=false;
            }



        }

    }


}




