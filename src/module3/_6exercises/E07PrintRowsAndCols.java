package module3._6exercises;

public class E07PrintRowsAndCols {

	//Exercise 7: Complete the code below to print the
	//number of rows and columns of the given array
    public static void main(String[] args) {
        String[][] arr = { {"hello","there","world"},
                          {"how","are","you"} };

        System.out.println("Rows:");
        // ADD CODE TO PRINT NUMBER OF ROWS HERE //
        System.out.println(arr.length);

        System.out.println("Columns:");
        // ADD CODE TO PRINT NUMBER OF COLUMNS HERE //
        System.out.println(arr[0].length);

    }
}

