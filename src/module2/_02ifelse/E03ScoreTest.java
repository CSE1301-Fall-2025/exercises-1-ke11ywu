package module2._02ifelse;

public class E03ScoreTest {
	//Exercise 3: Add an else statement that prints out "good job!"
	//if the score is greater than 9.
	public static void main(String[] args) {
		// set score to random number between 1 and 15
		int score = (int)(Math.random()*15 + 1);

		System.out.println("Your score is " + score + ".");
		if (score <= 9) {
			System.out.println("Try for a higher score!");
		}
		else {
			System.out.println("Good job!");
		}
	}
}
