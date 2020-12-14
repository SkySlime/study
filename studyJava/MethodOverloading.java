public class MethodOverloading {
    static int plusMethod(int x, int y) {
        return x+y;
    }
    static double plusMethod(double x, double y) {
        return x+y;
    }
    // define the same name two times to deal with different type of input and output
    public static void main(String[] args) {
        int myNum1 = plusMethod(5,3);
        double myNum2 = plusMethod(5.4,3.2);
        System.out.printf("%d,%f",myNum1,myNum2);
    }
}
