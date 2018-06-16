package bSmith_Prog12;
import java.util.Scanner;
public class CalorieCounter 
{
		static Scanner scnr = new Scanner (System.in);
		
		public static void main (String [] args)
		{
			Meal yourMeal = new Meal();
			
			printWelcome();
			String entreeChoice = getEntreeChoice();
			int mmCals = getCals (entreeChoice);
			String dessertChoice = getDessertChoice();
			int dCals = getCals (dessertChoice);
			
			yourMeal.setEntree (entreeChoice);
			yourMeal.setEntreeCals (mmCals);
			yourMeal.setDessert (dessertChoice);
			yourMeal.setDessertCals (dCals);
			
			yourMeal.setTotalCals ();
			
			int tCals = yourMeal.getTotalCals ();
			boolean dailyCals = overUnder (tCals);
			if (dailyCals)
			{
				yourMeal.setUnderCals(true);
			}
			else 
			{
				yourMeal.setUnderCals (false);
			}
			printTotals(yourMeal);
			scnr.close();
		}
		
		public static void printWelcome()
		{
			System.out.println ("Welcome to the Calorie Counter.\n");
		}
		
		public static String getEntreeChoice ()
		{
			System.out.print("What was your entree:  ");
			String mainMeal = scnr.nextLine();
			return mainMeal;
		}
		
		public static String getDessertChoice ()
		{
			System.out.print("\nWhat was your dessert:  ");
			scnr.nextLine();
			String dessertMeal = scnr.nextLine();
			return dessertMeal;
		}
		
		public static int getCals (String choice)
		{
			System.out.printf("How many calories were in %s:  ", choice);
			int numCals = scnr.nextInt();
			while (numCals < 0)
			{
				System.out.println ("Number of calories may not be negative.  Try again.");
				System.out.printf("How many calories were in %s:  ", choice);
				numCals = scnr.nextInt();
			}
			return numCals;
		}
		public static boolean overUnder (int cals)
		{
			boolean result = true;
			
			if (cals > 2000)
			{
				result = false;
			}
			return result;
		}
		public static void printTotals ( Meal aMeal )  
		{   
			System.out.printf("\nYour meal of %s and %s had a total of %d calories.\n", aMeal.getEntree(), aMeal.getDessert(), aMeal.getTotalCals()); 
			System.out.printf("You are %s your suggested calorie total for the day with one meal.\n", aMeal.getUnderCals() ? "under" : "over");  
		}
	
	}
