package module2._10exercises;

public class E01PrintEven {

	//Exercise 1: This code should generate a random number
	//and print it if it is even, however there is an error.
	//Find the error and fix it!
	public static void main(String[] args) {
		int num = (int)(Math.random() * 10);
		System.out.println(num);
		if (num % 2 == 0) {
			System.out.println("Your number is even");
		} else {
			System.out.println("Your number is odd.");
		}
	}
}
