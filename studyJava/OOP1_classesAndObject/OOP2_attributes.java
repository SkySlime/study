public class OOP2_attributes {
    final int y = 5;
    int x = 3;
    public static void main(String[] args) {
        OOP2_attributes ins1 = new OOP2_attributes();
        ins1.x = 4; // can be overwritten
        // ins1.y = 30;
        /* error: cannot assign a value to final variable y
        ins1.y = 30;
            ^
        */
        // final variable cannot be given new value
        System.out.println(ins1.x);
        System.out.println(ins1.y);
    }
}