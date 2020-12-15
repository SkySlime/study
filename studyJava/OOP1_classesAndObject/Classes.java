public class Classes {
    int x = 5;
    public static void main(String[] args) {
        /* System.out.println(x);
        Classes.java:4: error: non-static variable x cannot be referenced from a static context
        System.out.println(x);
                           ^
        */
        // int x there before this main method is not accessible

        Classes instanceKun = new Classes();
        System.out.println(instanceKun.x); 
        // x can be reached as an attribute of class named "Classes"
        // instanceKun inherit all the attributes of its class
    }
}
