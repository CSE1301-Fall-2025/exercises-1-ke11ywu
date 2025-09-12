package module3._6exercises;

public class E01PrintBackwards {
	//Exercise 1: This code is trying to print the values of the array
	//backwards, but there are errors. Fix them!
    public static void main(String[] args) {
        int[] a1 = {1, 3, 7, 9, 15};
        for (int i = a1.length - 1; i >= 0; i--) {
            System.out.print(a1[i] + ", ");
        }
    }
}

