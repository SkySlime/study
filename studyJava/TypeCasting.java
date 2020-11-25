public class TypeCasting {
	public static void main(String[] args) {
		//Windening
		int myInt = 9;
		double myDouble = myInt;
		System.out.println(myInt); //9
		System.out.println(myDouble); //9.0 (9 automatically becomes 9.0)

		//Narrowing
		double myDouble2 = 4.9999d;
		//int myInt2 = myDouble2; //error bc narrowing needs manual conversion
		int myInt2 = (int) myDouble2;
		System.out.println(myInt2); //Even you have .9999, Java still throws them away
	}
}
