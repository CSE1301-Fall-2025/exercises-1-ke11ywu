package module3._6exercises;

public class E09Colors {
	//Exercise 9: declare and create a two-dimensional array 
	//of strings named colors. Put the colors (�red�, 
	//�yellow�, �blue�) in the first row, and the 
	//colors (�orange�, �green�, �purple�) in the second row. 
	//Then print every value in the array.
	public static void main(String[] args) {
		// ADD CODE HERE //
		String[][] colors = {{"red","yellow","blue"},{"orange","green","purple"}};
		for(String[] s : colors){
			for(String t : s){
				System.out.print(t + " ");
			}
		} 
	}
}

