package module2._10exercises;

public class E02CheckGuess {

	//Exercise 2: This code should check your guess against
	//an answer, but there are errors. Find them and fix them!
	public static void main(String[] args) {
		int guess = 7;
		int answer = 9;
		if (guess < answer) {
			System.out.println("Your guess is too low");
		} else if (guess == answer) {
			System.out.println("You are right!");
		} else {
			System.out.println("Your guess is too high");
		}
	}
}

