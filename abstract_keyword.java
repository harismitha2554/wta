// DYNAMIC DISPATCH means RUNTIME POLYMORPHISM ( example : Method overriding )
// ABSTRACT class and ABSTRACT methods are covered

abstract class Car {
    Car() {
        System.out.println("Car is created");
    }

    abstract void display(); // overriding
}

class Benz extends Car {
    Benz() {
        System.out.println("Benz car is created and ready for the ride..weeeee.... ");
    }

    void display() {
        System.out.println("This is an abstract method");
    }
}

public class abstract_keyword{
    public static void main(String[] args) {
        Benz car1 = new Benz();
        car1.display();
    }
}