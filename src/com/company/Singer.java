package com.company;

public class Singer extends Person {
    String bandName;

    public Singer() {

    }

    public Singer(String name, String designation, String bandName) {
        super(name, designation);
        this.bandName = bandName;
    }

    public void singing() {
        System.out.println("Yrdaganda tim ele onuncho");
    }

    public void playGitar() {
        System.out.println("Gitarany ezetda ezet");
    }

    public String getBandName() {
        return bandName;
    }

    public void setBandName(String bandName) {
        this.bandName = bandName;
    }

    @Override
    public String toString() {
        return name + " " + designation + " " + bandName;
    }


}
