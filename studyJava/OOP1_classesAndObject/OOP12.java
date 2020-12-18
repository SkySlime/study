//enum outside a class
enum Level {
    LOW,
    MEDIUM,
    HIGH
}

public class OOP12 {
    // enum inside class
    enum Light {
        RED,
        GREEN,
        YELLOW
    }
    public static void main(String[] args) {
        // To access constants in enum,
        // First write it as if you're creating a variable of the type "Level"
        Level myLevel = Level.MEDIUM; 
        System.out.println(myLevel);
        System.out.println(Level.values()); //[LLevel;@2f92e0f4
        for (Level a : Level.values()) {
            System.out.println(a);
        }


        Light lightNow = Light.YELLOW;
        System.out.println(lightNow);

        switch (myLevel) {
            case LOW:
                System.out.println("low level");
                break;
            case MEDIUM:
                System.out.println("medium level");
                break;
            case HIGH:
                System.out.println("high level");
                break;
        }
    }
}
