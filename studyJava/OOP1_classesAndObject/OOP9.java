// It is possible to nest classes
// the purpose is to group the classes that belong together
// make the code more readable and maintainable

// We can have another class that the name doesn't match the file name
// before the public class that the name matches the file name
class OuterClass {
    int x = 10;

    // create an inner class inside another class
    class InnerClass {
        int y = 5;
        public int myInnerMethod() {
            return x;
            // This x is the attribute of OuterClass.
            // Method inside an InnerClass of the OuterClass can reach attribute of the Outer Class
        }
    }
// object of OuterClass cannot access attribute of InnerClass
// object of InnerClass cannot access attribute of OuterClass either

    static class InnerClass2 {
        int z = 4;
    }
}

public class OOP9 {
    public static void main(String[] args) {
        OuterClass myOuter = new OuterClass();
        // When you want to create instance of InnerClass,
        // You need to create instance of the outerClass first
        OuterClass.InnerClass myInner = myOuter.new InnerClass();
        System.out.println(myInner.y + myOuter.x);
        // Keyword "new" belongs to OuterClass
        System.out.println(myInner.myInnerMethod());

        // If the inner class is static,
        // No need to create the instance of the OuterClass
        OuterClass.InnerClass2 myInner2 = new OuterClass.InnerClass2();
        System.out.println(myInner2.z);
        // Keyword "new" doesn't belong to OuterClass
    }
}