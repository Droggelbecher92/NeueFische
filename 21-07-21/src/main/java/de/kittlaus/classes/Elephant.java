package de.kittlaus.classes;

public class Elephant extends Animals{
    private double trunkLength;

    public Elephant(int numberOfLegs, double trunkLength) {
        super(numberOfLegs);
        this.trunkLength = trunkLength;
    }

    @Override
    public void eat() {
        System.out.println("It´s eating with it´s mouth.");
    }

    @Override
    public void move() {
        System.out.println("It´s walzing");
    }

    @Override
    public void shouldIPetIt() {
        System.out.println("Yes, but it`s quiet large");
    }
}
