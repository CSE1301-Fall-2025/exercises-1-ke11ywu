package module3._6exercises;

public class E14CreateArray2 {
	
	//Exercise 14: Write code to declare and create a 
	//two-dimensional array of integers numbers with 
	//the numbers (1,2,3) in the first row, the numbers 
	//(4,5,6) in the second row, and the numbers (7,8,9) 
	//in the third row. Then loop through the 
	//two-dimensional array, printing out the values in 
	//the first row followed by those in the second row 
	//and so on.
    public static void main(String[] args) {
        // ADD CODE HERE //
		int[][] array = {
			{1,2,3},
			{4,5,6},
			{7,8,9}
		};

		for (int[] i : array){
			for (int j : i){
				System.out.print(j + " ");
			}
		}

		// backwards
		for (int i = array.length - 1; i >= 0; i--){
			for (int j = array[i].length - 1; j >= 0; j--){
				System.out.print(array[i][j] + " "); // print array[i][j] for the value, not just j. this is a standard for loop so you need the array[i][j] to access the values
			}
		}

    }
}

