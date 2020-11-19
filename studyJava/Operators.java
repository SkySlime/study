public class Operators {
	public static void main(String[] args) {
	int a = 9;
	System.out.printf("%s << %s = %s, which is %d", Integer.toBinaryString(9), Integer.toBinaryString(1), Integer.toBinaryString(9<<1), 9<<1);
	System.out.printf("\n%s >> %s = %s, which is %d", Integer.toBinaryString(9), Integer.toBinaryString(1), Integer.toBinaryString(9>>1), 9>>1);
	System.out.printf("\n%s >>> %s = %s, which is %d", Integer.toBinaryString(9), Integer.toBinaryString(1), Integer.toBinaryString(9>>>1), 9>>>1);
	System.out.printf("\n%s ^ %s = %s, which is %d", Integer.toBinaryString(9), Integer.toBinaryString(1), Integer.toBinaryString(9^1), 9^1);
	System.out.printf("\n~%s = %s, which is %d", Integer.toBinaryString(9), Integer.toBinaryString(~9), ~9);
	System.out.printf("\n%s | %s = %s, which is %d", Integer.toBinaryString(9), Integer.toBinaryString(1), Integer.toBinaryString(9|1), 9|1);
	System.out.printf("\n%s & %s = %s, which is %d", Integer.toBinaryString(9), Integer.toBinaryString(1), Integer.toBinaryString(9&1), 9&1);
    }
}
/* I got this output
1001 << 1 = 10010, which is 18
1001 >> 1 = 100, which is 4
1001 >>> 1 = 100, which is 4 //So >> quals to >>>
1001 ^ 1 = 1000, which is 8
~1001 = 11111111111111111111111111110110, which is -10 //Don't know why
1001 | 1 = 1001, which is 9
1001 & 1 = 1, which is 1*/