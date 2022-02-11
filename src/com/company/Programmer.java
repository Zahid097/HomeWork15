package com.company;

public class Programmer extends Person {
    String companyName;

    public Programmer() {

    }

    public Programmer(String name, String designation, String companyName) {
        super(name, designation);
        this.companyName = companyName;
    }

    public void coding() {
        System.out.println("Kod jazyp tajabayt");
    }

    public String getCompanyName() {
        return companyName;
    }

    public void setCompanyName(String companyName) {
        this.companyName = companyName;
    }

    @Override
    public String toString() {
        return name + " " + designation + " " + companyName;
    }

}
