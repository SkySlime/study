public class WhileLoop {
    public static void main(String[] args) {
        int i = 1;
        System.out.println("i");
        while (i<5) {
            System.out.println(++i); // increment before printing
        }

        int j = 1;
        System.out.println("j down here---------------");
        while (j<5) {
            System.out.println(j++); //printing before increment
        }

        i = 2;
        int a = i++; // a = 2, i = 3
        j = 6;
        int b = ++j; // b = 7, j = 7
        System.out.printf("%d,%d,%d,%d",i,a,j,b);

        i = 0;
        System.out.println("\n");
        do
        {
            System.out.println(i);
            i++;
        }
        while (i<5);
    }
}
