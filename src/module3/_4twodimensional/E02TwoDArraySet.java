package module3._4twodimensional;

public class E02TwoDArraySet {
	//Exercise 2: What will this print? Write down your answer before
	//running the code to check. Can you add another row to each array?
	public static void main(String[] args) {
		// declare arrays
		int[][] ticketInfo;
		String[][] seatingChart;

		// create arrays
		ticketInfo = new int [2][3];
		seatingChart =  new String [3][2];

		// initialize the array elements
		ticketInfo[0][0] = 15;
		ticketInfo[0][1] = 10;
		ticketInfo[0][2] = 15;
		ticketInfo[1][0] = 25;
		ticketInfo[1][1] = 20;
		ticketInfo[1][2] = 25;
		seatingChart[0][0] = "Jamal";
		seatingChart[0][1] = "Maria";
		seatingChart[1][0] = "Jacob";
		seatingChart[1][1] = "Suzy";
		seatingChart[2][0] = "Emma";
		seatingChart[2][1] = "Luke";

		// print the contents --- these don't actually work because arrays are considered
		// objects in java. when the print command is called, the computer will convert the
		// array's contents to a string using the array.toString() method and print that instead.
		// System.out.println(ticketInfo);
		// System.out.println(seatingChart);

        System.out.println("Ticket Info:");
        for (int i = 0; i < ticketInfo.length; i++) {
            // Inner loop iterates through the columns of the current row
            for (int j = 0; j < ticketInfo[i].length; j++) {
                System.out.print(ticketInfo[i][j] + " ");
            }
            // Move to the next line after printing a row
            System.out.println();
        }

        System.out.println("\nSeating Chart:");
        // Outer loop iterates through the rows
        for (int i = 0; i < seatingChart.length; i++) {
            // Inner loop iterates through the columns of the current row
            for (int j = 0; j < seatingChart[i].length; j++) {
                System.out.print(seatingChart[i][j] + " ");
            }
            // Move to the next line after printing a row
            System.out.println();
	}
}
}

