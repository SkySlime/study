import java.io.FileNotFoundException;
import java.util.Scanner;

public class OOP21_Exceptions {

    public static void tryNCatch() {
        try {
            String[] names = {"Ae", "Hangyi", "Eiei"};
            System.out.println(names[3]);
        } catch (Exception e) {
            System.out.println("Have and error"+e);
        }
        // Even though inside the try block has one error, the program still complied
    }

    public static void original() {
        System.out.println("Enter name");
        Scanner s = new Scanner(System.in);
        String name = s.nextLine(); //expect to read string
        // If you read string, the error will not occur
        int num = Integer.parseInt(name);
        System.out.println("name is "+name+" "+num);
        System.out.println("eiei");
        // If error occurs outside of try block,
        // the program will crash
    }

    public void tryNCatchNFinally() {
        try {
            System.out.println("Enter name");
            Scanner s = new Scanner(System.in);
            String name = s.nextLine(); //expect to read string
            // If you read string, the error will not occur
            int num = Integer.parseInt(name);
            System.out.println("name is "+name+" "+num);
            // If error occur before println, the println will not be read
            // Program will skip to the catch() block immediately
        } catch(Exception e) {
            System.out.println("Error occurs "+e);
        } finally {
            System.out.println("End of test");
        }
    }

    public static void throwException() {
        System.out.println("Enter age");
        Scanner s = new Scanner(System.in);
        int age = s.nextInt();
        if (age < 18) {
            throw new ArithmeticException("Too young!");
            // This "throw new" will make program to crash!
        } else {
            System.out.println("Welcome to the dark side");
        }
    }

    public static void throwException2() {
        System.out.println("Enter file name");
        Scanner s = new Scanner(System.in);
        String fileName = s.nextLine();
        if (fileName != "eieikrukrigigiha") {
            throw new ArrayIndexOutOfBoundsException("File not found");
        }
    }

    public static void main(String[] args) {
        
        //tryNCatch();

        // original();
        // OOP21_Exceptions c = new OOP21_Exceptions();
        // c.tryNCatchNFinally();
        
        // throwException();
        // throwException2();

        System.out.println("Finally You Reached Here Without Crashing!");
    }
}
