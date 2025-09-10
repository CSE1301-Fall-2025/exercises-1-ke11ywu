package module2._10exercises;

public class E22NumberTriangle {
	//Exercise 22: Complete the program below to print:
	
	//55555
	//4444
	//333
	//22
	//1
	
	//Use loops to accomplish this!
    public static void main(String[] args) {
		String number;
		for (int i = 5; i >= 1; i--){
			number = String.valueOf(i);
			String repeatedNumber = number.repeat(i);
			System.out.println(repeatedNumber);
		}
    }
}
