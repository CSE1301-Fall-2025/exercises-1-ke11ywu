package module2._06for;

public class E02ForLoopFromWhile {

	//Exercise 2: Write a for loop that works exactly the same
	//as the given while loop
	public static void main(String[] args) {
		int count = 5;
		while (count <= 10) {
			System.out.println(count);
			count++;
		}

		for (int count2 = 5; count2 <= 10; count2++) {
			System.out.println(count2);
		}
	}
}
