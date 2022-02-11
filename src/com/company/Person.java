package com.company;

public class Person {
    String name;
    String designation;

    //create not arg constructor
    // public Person() {
    //}
    public Person(String name, String designation) {
        this.name = name;
        this.designation = designation;
    }

    public void learn() {
        System.out.println("Okugandy bilbeyt");

    }
    public void walk() {
        System.out.println("Semirip ketgendikten kop basat");

    }
    public void eat() {
        System.out.println("Nandy ayabay kop jep semirip ketti");

    }
    
    //you missed getters & setters
    // & you missed toString();
    
}
