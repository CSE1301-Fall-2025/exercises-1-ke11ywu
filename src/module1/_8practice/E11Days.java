package module1._8practice;

public class E11Days {
	
	//Exercise 11: This code is attempting to compute the number of
	//whole days in 320893 seconds but there are errors. Fix them!
    public static void main(String[] args) {
        int numSecs = 320893;
        double numHours = numSecs / 3600.0;
        double numDays = numHours / 24;
        System.out.println((int)(numDays));
    }
}
