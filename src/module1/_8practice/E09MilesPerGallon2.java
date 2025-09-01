package module1._8practice;

public class E09MilesPerGallon2 {

	//Exercise 9: This code is attempting to compute the miles per
	//gallon of a recent car trip but there are errors. Fix them!
    public static void main(String[] args) {
        double gallonPrice = 2.35;
        double milesPerGallon = 40;
        double totalFunds = 8.0;
        double numGallons = totalFunds / gallonPrice;
        double numMiles = numGallons * milesPerGallon;
        // cut miles decimals w regex
        String formattedMiles = String.format("%.3f", numMiles);
        System.out.println("A total of " + formattedMiles + " miles were traveled.");
    }
}
