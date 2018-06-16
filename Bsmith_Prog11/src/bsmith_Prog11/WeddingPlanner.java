package bsmith_Prog11;
import java.util.Scanner;
public class WeddingPlanner 
{
	public static void main (String args[])
	{
		Scanner scnr = new Scanner(System.in);
		int userInt = 0;
		int i = 0;
		String meal = "";
		int Beef = 0;
		int Fish = 0;
		int Chicken = 0;
		int Vegetarian = 0;
		
		
		System.out.print("Welcome to Tying the Knot Wedding Planner Guide\n");
		
		System.out.print("\nFor each guest, please enter he/her choice for dinner:  Beef, Chicken, Fish, or Vegetarian.\n");
		System.out.print("How many guests will there be?  ");
		userInt = scnr.nextInt();
		
		do 
		{
			if (userInt <= 0)
			{
				System.out.print("That was not a valid number, try again.\n");
				System.out.print("How many guests will there be?  ");
				userInt = scnr.nextInt();
			}
		}while (userInt <=0);
		    System.out.print("\n");
			
			for (i = 1; i <= userInt; i++)
			{
				System.out.printf("Enter the choice for guest " + "%d:  ",i);
				meal = scnr.next();
				
				switch (meal)
				{
					
					case "Beef":
					case "beef":
						Beef++;
						break;
						
					case "Chicken":
					case "chicken":
						Chicken++;
						break;
						
					case "Fish":
					case "fish":
						Fish++;
						break;
						
					case "Vegetarian":
					case "vegetarian":
						Vegetarian++;
						break;
						
					default:
				}
			}
					System.out.printf("\nThere will be " + "%d" + " meals\n",userInt);
					System.out.printf("%d" + " Beef\n",Beef);
					System.out.printf("%d" + " Chicken\n",Chicken);
					System.out.printf("%d" + " Fish\n",Fish);
					System.out.printf("%d" + " Vegetarian\n",Vegetarian);
					System.out.print("\nThank you for your business.\n");
					
					scnr.close();
	}
}
