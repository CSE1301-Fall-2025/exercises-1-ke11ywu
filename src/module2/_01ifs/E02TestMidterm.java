package module2._01ifs;

import java.util.Scanner;
public class E02TestMidterm {
	
	//Exercise 2: Use the debugger to step through this program twice:
	//once with passedExam = true and once with passedExam = false
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);

		System.out.println("Did you pass the midterm exam? (true/false)");

		boolean passedExam = scan.nextBoolean();
		if (passedExam) {
			System.out.println("Good job studying!");
		}
		if (!passedExam) {
			System.out.println("Study harder next time.");
		}
	}
}
