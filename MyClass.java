public class MyClass {
	public static void main(String[] args){
		System.out.println("Hello World");

		String name = "john"; //String with capital letter S
		System.out.println(name);
		int myNum, numnum;
		myNum = 15;
		numnum = 12;
		System.out.println(myNum + numnum);
		myNum = 20; //changable value
		System.out.println(myNum);
		float myFloat = 5.99f; //neccessary to write f?
		System.out.println(myFloat + "Hello"); //combining text and variable
		String lastName = "Doe";
		String fullName = lastName + name;
		System.out.println(fullName);
		System.out.println(name + lastName);	

		final int num = 15;
		//num = 3; --> error: cannot assign a value to final variable num
		System.out.println(num);
	}
}
//Single line comment
/*Multiple
lines
comment*/