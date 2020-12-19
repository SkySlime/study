import java.time.LocalDate;
import java.time.LocalTime;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;

class OOP14_date {
    public static void main (String[] args) {
        LocalDate a = LocalDate.now();
        System.out.println(a.getClass());

        String[] v = {"sd","sdsf"};
        System.out.println(v);

        int[] df = {3,4};
        System.out.println(df);

        double[] sdf = {(float)3.4,(float)3.4};
        System.out.println(sdf);

        LocalTime b = LocalTime.now();
        System.out.println(b);

        LocalDateTime c = LocalDateTime.now();
        System.out.println("Before Formatting" + c);

        DateTimeFormatter myFormat = DateTimeFormatter.ofPattern("dd-MM-yyyy HH:mm:ss");

        String formattedDate = c.format(myFormat);
        System.out.println("After formatting"+formattedDate);

    }

}