package Abstract;

// If class is abstract it is not mandatory to have abstract method in it.

// If your class has one abstract method it is mandatory to have class to be abstract

// Default implementation in an interface came in JAVA 8 , before that if we wanted a common functionality
// we could have added in abstract class and specific functionality will go to the implementation classes.

// Abstract classes have a default Constructor and when we create object of implementation class
// First it will create object of implementation class and go through the constructor of implementation class
// From that class it will make a call to parent class constructor.

// It will go to child class constructor which will internally call super and it will call Parent class constructor.

// Abstract class -- Object cant be created  Method -- Need to be implemented in the implementation class
// Variable -- Java doesn't support abstract variables.In java only classes and methods can be abstract.


public abstract class Car
{
    protected int num;

    protected Car(int num) {
        this.num = num;
        System.out.println("M in car constructor");
    }
    public void drive (){}

    public abstract void buy();

}
