import java.util.ArrayList;
import java.util.Iterator;
class OOP19_Iterator {
    public static void main(String[] args) {
        ArrayList<String> cars = new ArrayList<String>();
        cars.add("BMW");
        cars.add("Volvo");
        cars.add("Ford");
        cars.add("Mazda");

        System.out.println(cars.iterator()); // java.util.ArrayList$Itr@372f7a8d
        // .iterator() is the method of ArrayList
        // In fact, no need to import java.util.Iterator
        System.out.println("Class of the iterator is "+cars.iterator().getClass());
        System.out.println("Simple name of the iterator is "+cars.iterator().getClass().getSimpleName());
        System.out.println("Name of the iterator is "+cars.iterator().getClass().getName());

        System.out.println(cars.iterator().next());

        // But if you want to store the java.util.ArrayList$Itr@372f7a8d
        // ArrayList<String> storeIt = cars.iterator(); This will throw an error
        /* error: incompatible types: Iterator<String> cannot be converted to ArrayList<String>
        ArrayList<String> storeIt = cars.iterator();
                                                 ^
        */
        // This is when you need to import java.util.Iterator
        // Because the type of cars.iterator() is Iterator<String>
        // Which is another class that we need to access via java.uit.Iterator

        Iterator<String> it = cars.iterator();
        //System.out.println(it.next());
        System.out.println("\n\n");

        //Looping through a collection
        while (it.hasNext()) {
            String a = it.next();
            System.out.println(a);
            if (a=="Ford") it.remove();
        }
        System.out.println(cars);
        // removing object from cars.iteration() results in removing cars' element
    }
}