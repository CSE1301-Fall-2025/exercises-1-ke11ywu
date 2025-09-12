package module3._6exercises;

public class E12SumDiagonal {

	//Exercise 12: Write code to compute and print the
	//sum of the values on the diagonal of the given array
	//from top left to bottom right.
    public static void main(String[] args) {
        int[][] array = {
            {1,2,3},
            {-1,-2,-3},
            {4,5,6}
        };

        //ADD CODE HERE
        int sum = array[0][0] + array[1][1] + array[2][2];
        System.out.println(sum);

    }
}

