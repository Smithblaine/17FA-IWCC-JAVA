package bSmith_Prog5;
import java.util.Scanner;
public class SammyRentals 
{
	public static void main (String args[])
	{
		Scanner scnr = new Scanner(System.in);
		int hours = 40;
		int minutes = 0;
		int timeRent =0;
		int itemCost = 0;
		String item ="";
		
		System.out.println("Welcome to Sammy's Seashore Supplies where it's always a Sunny day at the beach!");
		System.out.println();
		
		System.out.print("What item did you rent?  ");
		item = scnr.nextLine();
		
		System.out.print("How many hours?  ");
		timeRent = scnr.nextInt();
		
		System.out.print("How many minutes?  ");
		minutes = scnr.nextInt();
		scnr.close();
		
		itemCost = timeRent * hours + minutes;
		System.out.println();
		System.out.println("The cost for renting a " + item + " for " + timeRent + " hours and " + minutes + " minutes is $" + itemCost + ".");
		System.out.println();
		System.out.println("Thank you for your business.");
	}
}
