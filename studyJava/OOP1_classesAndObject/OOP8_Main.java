public class OOP8_Main {
    public static void main(String[] args) {
        OOP8_Animal myAnimal = new OOP8_Animal();
        OOP8_Animal myPig = new OOP8_Pig();
        OOP8_Animal myDog = new OOP8_Dog(); // What is the difference?
        OOP8_Dog myDog2 = new OOP8_Dog(); // between here and the previous line
        OOP8_Animal myRat = new OOP8_Rat();
        OOP8_Rat myRat2 = new OOP8_Rat();

        myAnimal.animalSound();
        myPig.animalSound();
        myDog.animalSound();
        myDog2.animalSound();
        myRat.animalSound();
        myRat2.animalSound();
        // OOP8_Rat.java doesn't have the method named animalSound
        // So Rats use the method from its superclass
    }
}
