package Abstraction;

    // Main.java
    public class Main {
        public static void main( String[] args ) {
            // accessing the public class
            Car car = new Car();

            Car car1 = new Car();
            // accessing the public variable
            car.tireCount = 4;

            car1.tireCount = 5;
            // accessing the public method
            car.display();

            car1.display();
        }
    }

