public class Ifelse{
    public static void main(String[] args){

        // Normal if else
        if(20>18){
            System.out.println("20 is greater than 18");
        }
        int x = 18;
        int y = 18;
        if(x>y) {
            System.out.println("x is greater than y");
        }
        else if(x<y) {
            System.out.println("x is smaller than y");
        }
        else {
            System.out.println("x is equal to y");
        }

        // Short hand if else (Ternary Operator)
        String result = (x<20) ? "Good" : "Bad";
        System.out.println(result);
    }
}