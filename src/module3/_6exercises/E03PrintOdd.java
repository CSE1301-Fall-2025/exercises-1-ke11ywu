package module3._6exercises;

public class E03PrintOdd {
    //Exercise 3: Complete the code below to print
	//all odd values in the array.
	public static void main(String[] args) {
        int[] a1 = {0, 3, 6, 7, 9, 10};
        for (int value : a1) {
            if (value % 2 != 0){
                System.out.println(value);
            }
        }
    }
}
