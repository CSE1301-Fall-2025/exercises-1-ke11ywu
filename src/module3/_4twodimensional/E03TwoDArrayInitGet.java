package module3._4twodimensional;

public class E03TwoDArrayInitGet {
	//Exercise 3: Add another row with your name and a friend's name.
	//Get these names out with the correct indices and print them
	public static void main(String[] args) {
		String[][] seatingInfo = { {"Jamal", "Maria"},
				{"Jake", "Suzy"},
				{"Emma", "Luke"},
				{"Name1", "Name2"} };
		String name = seatingInfo[0][0];
		System.out.println(name + " is at [0,0]");
		String name2 = seatingInfo[3][0];
		System.out.println(name2 + " is at [3,3]");

	}
}

