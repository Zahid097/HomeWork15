package com.company;

public class Person {
    String name;
    String designation;

    public Person() {

    }

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

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getDesignation() {
        return designation;
    }

    public void setDesignation(String designation) {
        this.designation = designation;
    }
}
