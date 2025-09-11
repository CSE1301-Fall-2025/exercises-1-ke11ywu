package module3._3foreach;

public class E01ForEachDemo {
	
	//Exercise 1: After running the program, add another score and name to the arrays
	//and run it again.
	public static void main(String[] args) {
		int[] highScores = { 10, 9, 8, 8, 23};
		String[] names = {"Jamal", "Emily", "Destiny", "Mateo", "Imhotep"};
		// for each loop with an int array
		for (int value : highScores) {
			System.out.println( value );
		}
		// for each loop with a String array
		for (String value : names) {
			System.out.println(value); // this time it's a name!
		}
	}
}

