package module1._8practice;

public class E12Savings {
	//Exercise 12: Complete the code to calculate and print
	//how many months it will take to save $200 if you earn $20 / week.
	//Assume that there are 4 weeks per month.
    public static void main(String[] args) {
      double goal = 200.0;
      double weeklyRate = 20.0;
      double numWeeks = goal / weeklyRate;
      double numMonths = numWeeks / 4;
      System.out.println("It will take " + numMonths + " months to save $200.");
    }
}
