public class OOP3_ClassMethods {
    // method can be either "static" or "public"

    // static method can be called without being under instance
    static void staticMethod() {
        System.out.println("Static method");
    }

    // non-static method must be called under the name of an instance
    void nonStaticMethod() {
        System.out.println("Non-static method");
    }

    public static void main(String[] args) {
        // call an static method
        staticMethod();

        // call a non-static method
        /* nonStaticMethod();
        error: non-static method publicMethod() cannot be referenced from a static context
        publicMethod();
        ^
        */

        OOP3_ClassMethods insKun = new OOP3_ClassMethods();
        insKun.nonStaticMethod();
        // use dot (.) to access both attribute and method.
    }
     // It is a good practice to create methods in a class
     // And call those methods in another class in the same directory.

}
