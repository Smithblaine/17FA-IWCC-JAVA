package bSmith_Prog4;
import java.util.Scanner;
public class SimpleInput 
{
	public static void main (String args [])
	{
    	Scanner scnr = new Scanner(System.in);
    	String yourName;
    	String favTvShow;
    	String favRestaurant;
    	String favMovie;
    	int favInteger = 0;
    	double favFloatNum = 0;
    	String whoWins;
    	
    	System.out.println("Welcome to the Get to Know You Program");
    	System.out.println();
		System.out.print("What is your name?  ");
		yourName =scnr.nextLine();
		
		System.out.print("What is your favorite TV show?  ");
		favTvShow = scnr.nextLine();
		
		System.out.print("What is your favorite restaurant?  ");
		favRestaurant = scnr.nextLine();
		
		System.out.print("What is your favorite movie?  ");
		favMovie = scnr.nextLine();
		
		System.out.print("Please enter an integer:  ");
		favInteger = scnr.nextInt();
		
		System.out.print("Please enter a decimal number:  ");
		favFloatNum = scnr.nextDouble();
		
		System.out.print("Viking vs. Scottish Highland Warrior, who wins?  ");
		scnr.nextLine();
		whoWins = scnr.nextLine();
		
		scnr.close();
		
		
		
		System.out.println();
		System.out.println("Here are your responses.");
		System.out.println("Name:  " + yourName);
		System.out.println("TV Show:  " + favTvShow);
		System.out.println("Restaurant:  " + favRestaurant);
		System.out.println("Movie:  " + favMovie);
		System.out.println("Integer:  " + favInteger);
		System.out.println("Decimal Number:  " + favFloatNum);
		System.out.println(whoWins + " wins!");
	}
}
