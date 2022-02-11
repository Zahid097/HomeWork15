package com.company;

public class Person {
    String name;
    String designation;
//missed no arg constructor!
    public Person(String name, String designation) {
        this.name = name;
        this.designation = designation;
    }

    public void learn() {
        System.out.println("Okugandy bilbeyt");
//there is not spaces (cleen code)
    }
    public void walk() {
        System.out.println("Semirip ketgendikten kop basat");
//there is not spaces (cleen code)
    }
    public void eat() {
        System.out.println("Nandy ayabay kop jep semirip ketti");
//there is not spaces (cleen code)
    }
    
    //you missed getters & setters
    // & you missed thString(); methods
}
