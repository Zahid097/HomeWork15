package com.company;

public class Singer extends Person {
    String bandName;
//no arg constructor!
    public Singer(String name, String designation, String bandName) {
        super(name, designation);
        this.bandName = bandName;
    }
    
    //you should define toString() method at last
    @Override
    public String toString(){
        return name +" "+ designation +" "+ bandName;
    }

    public void singing() {
        System.out.println("Yrdaganda tim ele onuncho");
    }

    public void playGitar() {
        System.out.println("Gitarany ezetda ezet");
    }
   
    //getter & setter!!!
}
