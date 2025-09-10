package module2._10exercises;

public class E19CountX {
	//Exercise 19: Complete the code below to count the number of
	//"x"s in the String. Use indexOf() with a loop.
    public static void main(String[] args) {
        String message = "xyxxzax";
        System.out.println(message);
        int index = 0;
        int xCount = 0;
        while (index != -1){
            xCount++;
            index = message.indexOf("x", index + 1); // x = what to search for, index + 1 = where to start
        }
        System.out.println("there are " + xCount + " x's in this message.");
    }
}
