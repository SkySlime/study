public class ForLoop {
    public static void main(String[] args){
        for (int i = 0; i<5; i++) {
            System.out.println(i);
        }

        for (int i = 0; i<=10; i=i+2) {
            System.out.println(i);
        }

        // i declared to count the loop is just a dummy. 
        // so System.out.println(i); outside the loop will cause error.
        //error: cannot find symbol
        //System.out.println(i);
        //                   ^


        //For-each loop: to use each element in an array
        String[] cars = {"Volvo", "BMW", "Ford", "Mazda"};
        for (String i : cars) {
            System.out.println(i);
        }

        int[] num = {1, 2, 3};
        for (int no : num) {
            System.out.println(no);
        }
    }
}
