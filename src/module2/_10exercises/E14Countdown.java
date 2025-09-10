package module2._10exercises;

public class E14Countdown {
	//Write a program that will count down from 100 to 0 by 10's
	//using a while loop.
    public static void main(String[] args) {
        int number = 100;
        while (number >= 0){
            System.out.println(number);
            number-=10;
        }
    }
}
