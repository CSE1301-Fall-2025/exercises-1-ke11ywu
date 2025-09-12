package module3._6exercises;

public class E08Print2DArray {
	
	//Exercise 8: Write loop(s) to traverse the 2D array
	//and print out the contents
	public static void main(String[] args) {
		String[][] arr = { {"Hey ", "there! "},{"I ", "hope "},
				{"you ", "are "}, {"doing ", "well"} };

		// ADD CODE HERE //
		for (String[] s : arr){
			for (String t : s){
				System.out.print(t);
			}
		}

	}
}

