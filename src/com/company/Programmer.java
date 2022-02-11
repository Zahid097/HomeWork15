package com.company;

public class Programmer extends Person{
    String companyName;

    //no arg constructor
    public Programmer(String name, String designation, String companyName) {
        super(name, designation);
        this.companyName = companyName;
    }
    @Override
    public String toString(){
        return  name +" "+ designation +" "+ companyName;
    }

    public void coding() {
        System.out.println("Kod jazyp tajabayt");
    }
    
    //define getter & setter & toString() !
}
