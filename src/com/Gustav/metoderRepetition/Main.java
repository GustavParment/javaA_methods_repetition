package com.Gustav.metoderRepetition;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

       // Object Creation AKA Instantiation
        Student benny = new Student(15,"Benny", true);
        Student frida = new Student(22,"Frida",false);



        // Set Object Values

        Object banana = benny.showIfSleepy();
        System.out.println(banana);
        // Print Object Values

        System.out.println(benny.name);
        System.out.println(benny.age);
        System.out.println(frida.name);
        System.out.println(frida.age);





        }




    }

