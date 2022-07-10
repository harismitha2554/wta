Shortcuts simplify My Drive … 
In the coming weeks, items in more than one folder will be replaced by shortcuts. Access to files and folders won't change.Learn more
// HIERARCHIAL INHERITANCE ,  FINAL and SUPER keywords , METHOD OVERRIDING

class Car {
    final int CAR_PRICE = 5000000;
    Car() {
        System.out.println("This is a car");
    }

    void displayDetails() {
        System.out.println("This is Blue Print of a CAR object");
    }
}

class Benz extends Car {
    Benz() {
        System.out.println("This is a Benz car");
    }
    void displayDetails() {
        System.out.println("This is Benz CAR object and Price = " + CAR_PRICE);
    }

    void display() {
        displayDetails(); // INVOKES CURRENT CLASS METHOD 
        super.displayDetails(); // INVOKES PARENT CLASS METHOD
    }
}

class BMW extends Car {
    BMW() {
        System.out.println("This is a BMW car");
    }

    void displayDetails() {
        System.out.println("This is  BMW CAR object and Price = " + CAR_PRICE);
    }
}

public class hierarchial_inheritance {
    public static void main(String[] args) {
        Benz car1 = new Benz();
        car1.display();
    }
}