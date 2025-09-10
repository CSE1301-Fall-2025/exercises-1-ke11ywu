package module2._10exercises;

public class E07Temperature {
	
	//Exercise 7: Complete the code below to print "it is freezing"
	//if the temperature is below 30, "it is cold" if the temp is below 50
	//"it is nice out" if the temp is below 90, or "it is hot" if it is 90 or above
    public static void main(String[] args) {
        int temp = 100;
        if (temp < 30) {
            System.out.println("it is freezing");
        } else if (temp < 50) {
            System.out.println("It is cold");
        } else if (temp < 90) {
            System.out.println("it is nice out");
        } else {
            System.out.println("it is hot");
        }
    }
}
