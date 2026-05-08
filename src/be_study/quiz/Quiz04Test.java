package be_study.quiz;

public class Quiz04Test {
	public static void main(String[] args) {
		int x = 2;
		int y = 3;
		int z;

		System.out.println("x=" + x + " y=" + y);
		System.out.println(x + y);
		System.out.println(x++ + y++);
		System.out.println("x=" + x + " y=" + y);
		z = ++x + ++y;
		System.out.println("x=" + x + " y=" + y);
		z--;
		x += --y;

		System.out.println("x=" + x + " y=" + y + " z=" + z);
		x = 10;
		z = x / y++;
		System.out.println("x=" + x + " y=" + y + " z=" + z);
		System.out.println("x=" + (x * 2) + " y=" + ++y + " z=" + z);
		System.out.println("x=" + x + " y=" + y + " z=" + z);

		int a = 1;
		int b = 2;
		int c = 3;
		System.out.println((a < b) && (c >= a));
		System.out.println((a == b) || (a >= b) || (c > 10));
		boolean result = !(c == 3);
		System.out.println(result);
	}
}
