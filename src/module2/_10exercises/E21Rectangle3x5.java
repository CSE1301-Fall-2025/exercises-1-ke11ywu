package module2._10exercises;

public class E21Rectangle3x5 {
	//Exercise 21: Complete the program to print a rectangle of stars (*)
	//with 3 rows of stars and 5 stars per row
    public static void main(String[] args) {
        for (int row = 1; row <= 3; row++){
            for (int col = 1; col <= 5; col++){
                System.out.print("*");
            }
            System.out.println("");
        }
    }
}
