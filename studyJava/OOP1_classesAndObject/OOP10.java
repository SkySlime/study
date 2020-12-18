// Abstract classes and methods
// Data Abstraction is the process of hiding certain details
// and showing essential information to the user.
// Abstraction can be abstract "classes" or "interfaces"

// Abstract class 
// is a restricted class that cannot be used to create objects
// To access an abstract class, it must be inherited from another class.

// Abstract method
// can only be used in an abstract class
// It does not have a body
// The body is provided by the subclass

abstract class Animal {
    public abstract void animalSound();
    public void sleep() {
        System.out.println("Zzzzz");
    }
}

class Pig extends Animal {
    public void animalSound() {
        System.out.println("The pig says: wee wee");
    }
}

class OOP10 {
    public static void main(String[] args) {
        Pig myPig = new Pig();
        myPig.animalSound();
        myPig.sleep();
    // main method must be in the class of the same name of the file name
    }
}