package mypack;

import java.util.Scanner;

public class OOP6 {
   public static void main(String[] args) {
       System.out.println("This is a class in my package");
       Scanner obj = new Scanner(System.in);
       System.out.println("Enter Username");

       String userName = obj.nextLine();
       System.out.println("Username is "+userName);
   }
// inside the newly created folder named mypack contains only .class file

// in Terminal
// javac OOP6.java
// javac -d . OOP6.java
// java mypack.OOP6
}
