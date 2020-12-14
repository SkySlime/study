public class Methods {
    static void myMethod() {
        System.out.println("myMethod got executed!");
    }

    static void myMethod2 (String fname) {
        System.out.println("Wang "+fname);
    }

    static void myMethod3 (String fname, int age) {
        System.out.println(fname+" is "+age);
    }

    static int myMethod4 (int x) {
        return 5+x;
    }

    public static void main(String[] args) {
        myMethod();
        myMethod2("Hangyi");
        myMethod2("Amonnut");
        myMethod3("Amonnut",20);

        System.out.println(myMethod4(5));
    }
}
