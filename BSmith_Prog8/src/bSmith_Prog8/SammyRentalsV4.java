package bSmith_Prog8;
import java.util.Scanner;
public class SammyRentalsV4 
{
	public static void main (String [] args)
	{
		printWelcome();
		
		do
		{
			getItem(userItem);
			getHours(hoursRented);
			getMinutes(minutes);
			calculateRate(userItem,item);
			calculateCost(hoursRented,item,minutes,perMin);
			printCost(userItem,hoursRented,minutes,itemCost);
			repeat(userItem2);
		}while(userItem2.equalsIgnoreCase("Yes"));
		
		printThankYou();
		scnr.close();	
	}	
		public static Scanner scnr = new Scanner (System.in);
		public static int minutes = 0;
		public static int hoursRented = 0;
		public static double itemCost = 0;
		public static double item = 0;
		public static double perMin = 1.50;
		public static String userItem = "";
		public static String userItem2 = "";
		
		
		public static void printWelcome()
		{
			System.out.println("Welcome to Sammy's Seashore Supplies where it's always a Sunny day at the beach!");
		}
		
		public static String getItem(String userItem1)
		{
			System.out.print("\nWhat item did you rent?  ");
	    		userItem = scnr.nextLine();
	    		return userItem;		
		}
		
		public static int getHours (int hours1)
		{
			System.out.print("How many hours?  ");
	    		hoursRented = scnr.nextInt();
	    		while (hoursRented < 0)
	    		{
	    			System.out.println("That is not a valid number.  Try again.");
	    			System.out.print("How many hours?  ");
		    		hoursRented = scnr.nextInt();
	    		}
	    		return hoursRented;
		}
		
		public static int getMinutes(int minutes1)
		{
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
	    		 return minutes;
		}
		
		public static double calculateRate(String userItem1, double item1)
		{
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
			 return item;	
		}
		
		public static double calculateCost(int hours1, double item1, int minutes1, double perMin)
		{
			itemCost = (hours1 * item1) + (minutes1 * perMin);
			return itemCost;
		}
		
		public static void printCost(String newString , int newInt1, int newInt2, double newDouble)
		{
			 System.out.printf("\nThe cost for renting a " + "%s" + " for " + "%d" + " hours and " + "%d" + " minutes is $" + "%.2f" + ".\n",newString,newInt1,newInt2,newDouble);
		}
		
		public static String repeat(String nextItem)
		{
			 System.out.print("\nDid you rent another item?  ");
	    		 scnr.nextLine();
	    		 userItem2 = scnr.nextLine(); 
	    		 return userItem2;
		}
		
		public static void printThankYou()
		{
			System.out.println("\nThank you for your business.");
		}
}
