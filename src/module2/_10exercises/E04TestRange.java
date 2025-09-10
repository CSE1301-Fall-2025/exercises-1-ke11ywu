package module2._10exercises;

public class E04TestRange {
	//Exercise 4: This code should verify the range of x, but there are errors.
	//Find them and fix them!
    public static void main(String[] args) {
        int x = 0;
        if (x >= 0 && x <= 10) {
            System.out.println("x is between 0 and 10 inclusive");
        } else {
            System.out.println("x is either less than 0 or greater than 10");    
        }
    }
}
