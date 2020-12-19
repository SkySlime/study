import java.util.HashMap;
public class OOP16_HashMap {
    public static void main(String[] args) {
        HashMap<String,String> capitalCities = new HashMap<String,String>();
        capitalCities.put("England","London");
        capitalCities.put("Germany","Berlin");
        capitalCities.put("Thailand","Bangkok");
        System.out.println(capitalCities);
        System.out.println(capitalCities.get("Thailand"));

        for (String i : capitalCities.keySet()) {
            System.out.println("key "+i+" value "+capitalCities.get(i));
        }

        for (String a : capitalCities.values()) {
            System.out.println(a);
        }

        HashMap<Long,String> students = new HashMap<Long, String>();
        students.put(6133544323L,"Amonnut");
        students.put(6133544423L,"Amanut");

        for (long a : students.keySet()) {
            System.out.println("no: "+a+" name: "+students.get(a));
        }
    }
}
