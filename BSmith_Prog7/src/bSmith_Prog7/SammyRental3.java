//This program asks for items rented and will calculate the total cost, Then will ask the user if they rented another item. The program will then go through another iteration and ask what was rented and so forth.

package bSmith_Prog7;
import java.util.Scanner;
public class SammyRental3 
{
	public static void main (String args[])
	{
		Scanner scnr = new Scanner (System.in);
		int minutes = 0;
		int hoursRented = 0;
		double itemCost = 0;
		double item = 0;
		double perMin = 1.50;
		String userItem = "";
		String userItem2 = "";
		
		System.out.println("Welcome to Sammy's Seashore Supplies where it's always a Sunny day at the beach!");
	    
	   do 
	    {	
	    		
	    		System.out.print("\nWhat item did you rent?  ");
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
	    		else 
	    		{
	    			item = 8.50;
	    		}
	    		
	    		
	    		
	    		System.out.print("How many hours?  ");
	    		hoursRented = scnr.nextInt();
	    		
	    		while (hoursRented < 0)
	    		{
	    			System.out.println("That is not a valid number.  Try again.");
	    			System.out.print("How many hours?  ");
		    		hoursRented = scnr.nextInt();
	    		}
	    		
	    		System.out.print("How many minutes?  "); 
	    		minutes = scnr.nextInt();
	    		
	    		while(minutes < 0)
	    		{
	    			System.out.println("That is not a valid number.  Try again.");
	    			System.out.print("How many minutes?  "); 
		    		minutes = scnr.nextInt();	
	    		}
	    		 while(minutes >= 59)
	    		{
	    			System.out.println("That is not a valid number.  Try again.");
	    			System.out.print("How many minutes?  "); 
		    		minutes = scnr.nextInt();
	    		}
	    		 while(minutes < 0)
		    	{
		    		System.out.println("That is not a valid number.  Try again.");
		    		System.out.print("How many minutes?  "); 
			    	minutes = scnr.nextInt();	
		    	}
	    		
	    		 itemCost = (hoursRented * item) + (minutes * perMin);
	    		 
	    		 System.out.printf("\nThe cost for renting a " + "%s" + " for " + "%d" + " hours and " + "%d" + " minutes is $" + "%.2f" + ".\n",userItem,hoursRented,minutes,itemCost);
	    		 

	    		 System.out.print("\nDid you rent another item?  ");
	    		 scnr.nextLine();
	    		 userItem2 = scnr.nextLine();
	    		 
	    	
	    }while (userItem2.equalsIgnoreCase ("Yes"));
	    
	    
		System.out.println("\nThank you for your business.");
		
		
		scnr.close();
	}
}
