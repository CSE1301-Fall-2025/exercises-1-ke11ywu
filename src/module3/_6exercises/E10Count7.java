package module3._6exercises;

public class E10Count7 {

	//Exercise 10: Complete the given code to count the number of 7's
	//in the 2D array. Add another row to the array and retest your code.
	public static void main(String[] args) {
		int[][] array = { {4,7,8},{8,8,7},{7,0,7} };
		int sevenCount = 0;

		//ADD CODE HERE
		for (int[] s : array){
			for (int t : s){
				if (t == 7){
					sevenCount++;
				}
			}
		}
		
		System.out.print(sevenCount);

	}
}

