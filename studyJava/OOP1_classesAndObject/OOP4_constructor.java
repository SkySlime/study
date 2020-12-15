public class OOP4_constructor {
    
    int x; // a class attribute x

    // constructor is a special method that is called when an instance is created
    // constructor method must have the same name as the class name
    // This is to say 
    // The method with the same name as its class will work specially when you initialize an instance
    public OOP4_constructor(int y) {
        x = y;
        System.out.println("Constructor of the same name of the class is called!");
    }

    public static void main(String[] args) {
        OOP4_constructor instanceeiei = new OOP4_constructor(30);
        System.out.println(instanceeiei.x);
    }


}
