public class Scope {
    public static void main(String[] args) {

        {
            int x = 3;

        }
        /*System.out.println(x);
        Scope.java:8: error: cannot find symbol
        System.out.println(x);
                           ^  
        symbol:   variable x        
        location: class Scope
        */
        // int x that is defined inside the block cannot be used outside that block.
    }
}
