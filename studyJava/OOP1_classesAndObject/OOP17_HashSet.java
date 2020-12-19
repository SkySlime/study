import java.util.HashSet;
// HashSet elements must be unique
public class OOP17_HashSet {
    public static void main(String[] args) {
        HashSet<String> cars = new HashSet<String>();
        cars.add("Volvo");
        cars.add("BMW");
        cars.add("BMW");
        System.out.println(cars);

        HashSet<Integer> num = new HashSet<Integer>();
        num.add(3);
        num.add(2);
        
        for (int i = 0; i<10; i++) {
            if (num.contains(i)) {
                System.out.println(i+" is in the HashSet");
            }
        }
    }
}
