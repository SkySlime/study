import java.util.ArrayList;
import java.util.Collections;
public class OOP15_ArrayList {
    public static void main(String[] args) {
      ArrayList<String> cars = new ArrayList<String>();
      cars.add("Volvo");
      cars.add("BMW");
      System.out.println(cars);
      System.out.println(cars.get(0));
      cars.set(0, "Opel");
      System.out.println(cars.get(0));
      cars.remove(0);
      System.out.println(cars.get(0));
      cars.clear();
      System.out.println(cars); // []
      cars.add("Volvo");
      cars.add("BMW");
      cars.add("Nissan");
      cars.add("Suzuki");
      System.out.println(cars.size());
      
      Collections.sort(cars);
      System.out.println("\n\n\n");

      for (int i=0; i<cars.size(); i++) {
          System.out.println(cars.get(i));
      }

      for (String a : cars) {
          System.out.println(a);
      }

      ArrayList<Long> studentNumbers = new ArrayList<Long>();
      studentNumbers.add(6133544323L);
      studentNumbers.add(6133544423L);

      for (long a : studentNumbers) {
          System.out.println(a);
      }

      ArrayList<Integer> num = new ArrayList<Integer>();
      num.add(34);
      num.add(44);
      num.add(4);
      num.add(3);
      num.add(54);
      num.add(884);

      Collections.sort(num);
      for (int riri : num) {
          System.out.println(riri);
      }
      System.out.println(num);
    }
}
