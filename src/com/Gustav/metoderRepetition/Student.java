package com.Gustav.metoderRepetition;

public class Student {
    // Variables
    public int age;
    public String name;
    public boolean isTierd;

    public Student(int age, String name, boolean isTierd) {
        this.age = age;
        this.name = name;
        this.isTierd = isTierd;
    }
    // Methods
    public String showIfSleepy(){
        if (isTierd == true){
            age = 15;
            return name + " is very tierd " ;

        }else {
            return name + "is NOT tired" ;
        }

        //
    }


    /*TODO-Create methods
     *
     */
}
