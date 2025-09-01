package module1._8practice;

public class E08MilesPerGallon1 {
	//Exercise 8: This code is attempting to compute the miles per
	//gallon of a recent car trip but there are errors. Fix them!
	public static void main(String[] args) {
		int tripMiles = 300;
		double pricePerGallon = 2.50;
		int milesPerGallon = 30;
		double numberOfGallons = 1.0 * tripMiles / milesPerGallon;
		double totalCost = numberOfGallons * pricePerGallon;


		// use a regex pattern to format it to 2 decimal places
		String formattedCost = String.format("%.2f", totalCost);

		System.out.println("The total cost of gas is $" + formattedCost + ".");
	}
}
