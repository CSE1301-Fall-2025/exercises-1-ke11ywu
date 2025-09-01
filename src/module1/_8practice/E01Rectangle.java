package module1._8practice;

public class E01Rectangle {
	//Exercise 1: Calculate and print the perimeter of a rectangle
	//having width 7 and height 9. Add another statement to calculate 
	//and print the area of the rectangle on a separate line.
    public static void main(String[] args) {
		int width = 7;
		int height =  9;
		int perimeter = 2 * (width + height);
		int area = width * height;
		System.out.println("Perimeter: " + perimeter);
		System.out.println("Area: " + area);
    }
}
