package module3._6exercises;

public class E02RewriteLoop {

	//Exercise 2: Rewrite the loop below to use a foreach
	//style loop
	public static void main(String[] args) {
		int[] arr1 = {1, 3, 7, 9};
		for (int index = 0; index < arr1.length; index++){
			System.out.print(arr1[index] + ", ");
		}
	}
}
