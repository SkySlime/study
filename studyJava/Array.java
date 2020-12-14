public class Array {
    public static void main(String[] args) {
        String[] cars = {"Volvo", "BMW", "Nissan"};
        int[] myNum = {1, 2, 4};
        System.out.println(myNum[2]);

        myNum[0] = 56;
        System.out.println(myNum[0]);
        System.out.println(cars.length);

        for (String i : cars) {
            System.out.println(i+"44");
        }

        //Multidimensional array
        int[][] nums = {{1,2,3}, {4,5,6}};
        int c = nums[0][2];
        System.out.printf("%d\n\n",c);

        for (int[] a : nums) {
            System.out.println(a); // object's name? [I@19469ea2 [I@13221655
            for (int b : a) {
                System.out.println(b); // readable value
            }
        }

        System.out.println("\n\n");

        for (int j = 0; j < nums.length; j++) {
            for (int k = 0; k < nums[0].length; k++) {
                System.out.println(nums[j][k]);
            }
        }
    }
}
