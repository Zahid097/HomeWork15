package com.company;

public class Main {

    public static void main(String[] args) {
        Programmer programmer = new Programmer("Muhammed", "Razrabotchik", "Peaksoft");
        System.out.println(programmer);
        programmer.coding();
        programmer.learn();
        programmer.eat();
        programmer.walk();
        System.out.println();

        Dancer dancer = new Dancer("Daudali", "Biychi", "Kara Jorgo");
        System.out.println(dancer);
        dancer.dancing();
        dancer.learn();
        dancer.eat();
        dancer.walk();
        System.out.println();

        Singer singer = new Singer("Ulan", "Yrchy", "Non Stop");
        System.out.println(singer);
        singer.learn();
        singer.eat();
        singer.walk();
        singer.playGitar();
        singer.singing();

        // MAIN CLASS WAS AMAZING ! 👍🏻
    }
}
