package module1._5casting;

public class E01OperatorTest {
	//Exercise 1: See if you can predict the results before running the code
	//What are the types of each of these results?
	public static void main(String[] args) {
		System.out.println(1 / 3); // int 0
		System.out.println(1.0 / 3); // double 0.33
		System.out.println(1 / 3.0); // double 0.33
		System.out.println((double) 1 / 3); // double 0.33
		System.out.println((double) (1 / 3)); // double 0.0
	}
}
