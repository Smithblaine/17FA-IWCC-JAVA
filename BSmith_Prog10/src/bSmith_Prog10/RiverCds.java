package bSmith_Prog10;
import java.util.Scanner;
public class RiverCds 
{
	public static void main (String [] args)
	{
		Scanner scnr = new Scanner (System.in);
		int cdTotal = 0; 
		int col = 3;
		 
		System.out.println("The River Catalog:\n");
		System.out.print("How many CD's do you have:  ");
		cdTotal = scnr.nextInt();
		
		do 
		{
			if (cdTotal <= 0) 				
			{
				System.out.print("Must be a number greater than 0.\n");
				System.out.print("How many CD's do you have:  ");
				cdTotal = scnr.nextInt();
			}
			
		}while(cdTotal <= 0);
		
		String [][] list = new String [cdTotal][col];
		
		scnr.nextLine();
		
		System.out.print("\nFor each CD, enter the genre, then the artist, then the title.\n");
		
		
		for (int r = 0; r < list.length; r++)
		{	
			System.out.printf("\nFor CD " + "%d" + ":\n",r + 1); 
			
			for (int c = 0; c < list[r].length; c++) 
			{
				System.out.print("Enter:  ");
				list[r][c] = scnr.nextLine();
			}
		}
		
		System.out.print("\nHere is your catalog:\n");
		System.out.printf("\n%-20s" + "%-20s" + "%-20s\n","Genre","Artist","Title");
		System.out.println();
		
		for (int r = 0; r < list.length; r++)
		{
			for (int c = 0; c < list[r].length; c++)
			{
				System.out.printf("%-20s",list[r][c]); 
				
			}
			
			System.out.print("\n");
		}
		scnr.close(); 
	}
}
