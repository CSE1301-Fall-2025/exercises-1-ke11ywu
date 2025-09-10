package module2._10exercises;

public class E08LoopRewrite1 {

	//Exercise 8: Rewrite the following to use a while loop
	//instead of a for loop
	public static void main(String[] args) {
		//for (int x = 1; x <= 10; x++) {
		//	System.out.println(x);
		//}
		int x = 1;
		while (x <= 10) {
			System.out.println(x);
			x++;
		}
	}
}
