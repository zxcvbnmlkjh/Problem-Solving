package Abstraction;

abstract class Shape
{
    // we cant create object of abstract class but abstract class has constructor in it.
    // Use of constructor is if we want some common variable to be there in all the child classes.

    int val;
    Shape() {
        val = 100;
    }
    abstract void draw();

    void add() {
        System.out.println("M in parent class add method");
    }
}
