public class Recursion {
    // making a function call itself
    public static void main(String[] args) {
        int result = sum(10);
        System.out.println(result);
        System.out.println(factorial(5));
        
    }


    static int sum(int k) {
        if (k>0) {
            return k + sum(k-1);
        } else {
            return 0; // The program stops when k = 0 cuz it doesn't call itself further.
            // condition k = 0 makes it stop
            // so condition k = 0 is called "Halting Condition"
        }
    }

    public static int factorial(int x) {
        if (x > 1) return x*factorial(x-1);
        else return 1;
    }
}
