
//This code will ask a user for the item that they rented with updated prices and output the total they will spend.
package bSmith_Prog6;
import java.util.Scanner;
public class SammyRentals2 
{
	public static void main (String args[])
	{
		Scanner scnr = new Scanner(System.in);
		int minutes = 1;
		int hoursRented = 0;
		int itemCost = 0;
		int item = 0;
		String userItem ="";
		
		
		System.out.println("Welcome to Sammy's Seashore Supplies where it's always a Sunny day at the beach!");
		System.out.println();
		
		System.out.print("What item did you rent?  ");
		userItem = scnr.nextLine();
		
		if (userItem.equalsIgnoreCase("Canoe"))
		{
			item = 40;
		}
		else if(userItem.equalsIgnoreCase("Kayak")) 
		{
			item = 20;
		}
		else if (userItem.equalsIgnoreCase("Surf board"))
		{
			item = 45;	
		}
		else if (userItem.equalsIgnoreCase("Beach chair"))
		{
			item = 10;
		}
		else if (userItem.equalsIgnoreCase("Umbrella"))
		{
			item = 12;
		}
		
		System.out.print("How many hours?  ");
		hoursRented = scnr.nextInt();
		
		System.out.print("How many minutes?  ");
		minutes = scnr.nextInt();
		scnr.close();
		
		itemCost = hoursRented * item + minutes;
		System.out.println();
		System.out.println("The cost for renting a " + userItem + " for " + hoursRented + " hours and " + minutes + " minutes is $" + itemCost + ".");
	    System.out.println();
		System.out.println("Thank you for your business.");
		
	}
}
