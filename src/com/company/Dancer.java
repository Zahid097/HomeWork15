package com.company;

public class Dancer extends Person{
    String groupName;
//no arg constructor!!
    public Dancer(String name, String designation, String groupName) {
        super(name, designation);
        this.groupName = groupName;
    }
    
    //toSTring() should be at last
    @Override
    public String toString(){
        return name +" "+ designation +" "+ groupName;
    }
    public void dancing() {
        System.out.println("Biylegendi jakshy korot");

    }
    
    //getter & setter !!!
}
