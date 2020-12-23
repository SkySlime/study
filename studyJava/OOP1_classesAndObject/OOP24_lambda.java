import java.util.ArrayList;
// Lambda Expressions express instances of functional interfaces
// An interface with single abstract method is called functional interface

interface StringFunction {
    String run(String str); //method that inputs String and returns String
}
// Interface here is not constructed to be implemented by any class
// We will just use its instance

public class OOP24_lambda {
    public static void main(String[] args) {
        lambda1();

        // declare variable of the type StringFunction
        // Let these variables keep lambda expressions
        // These lambda expressions are function from String to String
        // It means we override the run method
        StringFunction exclaim = s -> s+"!";
        StringFunction ask = s -> s+"?";
        String word = exclaim.run("Hello");
        System.out.println(word);
        printFormatted("Hello", exclaim);
        printFormatted("Hello", ask);
    }

    static void printFormatted(String str, StringFunction format) {
        String result = format.run(str);
        // "format" here has the type of that interface
        // so this format variable can call the method from the interface
        System.out.println(result);
    }    

    static void lambda1() {
        ArrayList<Integer> numbers = new ArrayList<Integer>();
        numbers.add(5);
        numbers.add(9);
        numbers.add(8);
        numbers.add(1);
        numbers.forEach( n -> {n=n+1; System.out.println(n);});
    }

}