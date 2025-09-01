package module1._5casting;

public class E02NearestInt {
	//Exercise 2: Run this code to see how integers get truncated
	public static void main(String[] args) {
		double number = 5.0 / 3; // double 1.666
		int nearestInt = (int)(number + 0.5); // number + 0.5 = 2.166, so nearestInt = 2
		System.out.println("5.0/3 = " + number); // print 5.0/3 = 1.666
		System.out.println("5/3 truncated: " + (int)number ); // print 5/3 truncated: 1
		System.out.println("5.0/3 rounded to nearest int: " + nearestInt); // print 5.0/3 rounded to nearest int: 2
		double negNumber = -number; // double -1.666
		int nearestNegInt = (int)(negNumber - 0.5); // negNumber - 0.5 = -2.166, so nearestNegInt = -2
		System.out.println("-5.0/3 rounded to nearest negative int: " + nearestNegInt); // print -5.0/3 rounded to nearest negative int: -2
	}
}
