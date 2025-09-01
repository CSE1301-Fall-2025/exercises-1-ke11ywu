package module1._3expressions;

import java.util.Scanner;

public class E11PizzaCalculatorInput {
	
	//Exercise 11: Add code to complete the program according to the flow chart given here:
	
	//https://131text.com/ns/books/published/csjava/Module1-Types-and-Names/topic-1-4-assignment.html#storing-user-input-in-variables
    public static void main(String[] args) {
        int pizzaSlices, numPeople, slicesPerPerson, leftoverSlices;
        Scanner scan = new Scanner(System.in);
        //add code to initialize pizzaSlices and numPeople from user input 
        System.out.print("Enter the number of pizza slices: ");
        pizzaSlices = scan.nextInt();
        System.out.print("Enter the number of people: ");
        numPeople = scan.nextInt();

        //add code to compute and print slicesPerPerson and leftoverSlices
        slicesPerPerson = pizzaSlices / numPeople;
        leftoverSlices = pizzaSlices % numPeople;
        System.out.println("Each person gets " + slicesPerPerson + " slices of pizza.");
        if (leftoverSlices == 1) {
            System.out.println("There is 1 leftover slice.");
        } else {
            System.out.println("There are " + leftoverSlices + " leftover slices.");
        }
        
    }

}
