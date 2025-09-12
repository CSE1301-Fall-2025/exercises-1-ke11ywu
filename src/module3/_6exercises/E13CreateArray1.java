package module3._6exercises;

public class E13CreateArray1 {
	//Exercise 13: Write code to declare and create a two-dimensional 
	//array of integers numbers with the numbers (1,2,3) in 
	//the first row, and the numbers (4,5,6) in the second row. 
	//Then loop through the two-dimensional array, printing 
	//out the values in the first row followed by those in the 
	//second row.
    public static void main(String[] args) {
        // ADD CODE HERE //
		int[][] array = {
			{1,2,3},
			{4,5,6}
		};

		for (int[] i : array){
			for (int j : i){
				System.out.print(j + " ");
			}
		}

    }
}

