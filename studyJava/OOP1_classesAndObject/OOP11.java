// An interface is a completely "abstract class"
// Interface is used to group related methods with empty bodies
interface Animal_interfaces {
    public void animalSound(); // Interface method (does not have a body)
    public void sleep(); // Interface method (does not have a body)
    int x = 5; // attribute in interface is by default final, static and public
}
// It is not possible to create "Animal" object
// Interface methods are by default abstract and public

interface LivingThing_interface {
    public void breath();
}

// For a class to inherit from interface,
// use the keyword "implements"
// On implementation of interfaces,
// you nedd to overwrite all of its method
class Pig implements Animal_interfaces, LivingThing_interface {
    public void animalSound() {
        System.out.println("The pig says: wee wee");
    }
    public void sleep() {
        System.out.println("Zzz");
    }
    // If you don't override all the methods from all interfaces you inherited,
    // An error will occur
    public void breath() {
        System.out.println("Breath!!!");
    }
}

class OOP11 {
    public static void main(String[] args) {
        Pig myPig = new Pig();
        myPig.animalSound();
        myPig.sleep();
        // myPig.x = 4;
        /* error: cannot assign a value to final variable x
        myPig.x = 4;
             ^
        */
        System.out.println(myPig.x);
    }
}

// A class can only inherit from one superclass
// But a class can implement multiple interfaces