import java.util.regex.Pattern;
import java.util.regex.Matcher;
import java.util.Scanner;

public class OOP22_Regex {
    public static void main(String[] args) {
        System.out.println("Enter name");
        Scanner sc = new Scanner(System.in);
        String s = sc.nextLine();
        Pattern pattern = Pattern.compile("\\?|\"", Pattern.CASE_INSENSITIVE);
        Matcher matcher = pattern.matcher(s);
        boolean matchFound = matcher.find();
        //System.out.println(matcher);
        if (matchFound) System.out.println("match found");
        else System.out.println("no match found");
    }
}
