/*  
 * This program will let the user enter the desired amount they wish to invest over the course of a year.
 * It will then return the growth of their money over that course of a year.
*/
package bSmith_Prog9;
import java.util.Scanner;
public class SimpleInvest 
{
	public static void main (String [] args)
	{
		printWelcome();
		getInvestAmount(invest);
		getRate(investRate);
		calculateInterest(invest,investRate,year);
		printAmounts(year,currAmount);
		scnr.close();	
	}	
		public static Scanner scnr = new Scanner (System.in);
		public static double invest = 0;
		public static double investRate = 0.0;
		public static double currAmount = invest;
		public static double year [] = new double [12];
		
		public static void printWelcome()
		{
			System.out.print("Welcome to the Investment Calculator\n");
		}
		
		public static double getInvestAmount(double investAmount)
		{
			System.out.print("\nHow much will you be investing?  ");
	    		invest = scnr.nextDouble();		
	    	do
	    	 {
	    		if (invest <= 0)
	    		{
	    			System.out.print("Amount must be greater than 0.  Try again.");
	    			System.out.print("\nHow much will you be investing?  ");
	    			invest = scnr.nextDouble();
	    		}
	    	 }while (invest <= 0);
	    		System.out.println("");
	    		return invest;
		}
		
		public static double getRate(double rate)
		{
			System.out.print("What will be the rate of return?  ");
    		investRate = scnr.nextDouble();
    		investRate = investRate / 100;
    		do
	    	 {
	    		if (investRate <= 0)
	    		{
	    			System.out.print("Rate must be greater than 0.  Try again.");
	    			System.out.print("\nWhat will be the rate of return?  ");
	    			investRate = scnr.nextDouble();
	    			investRate = investRate / 100;
	    		}
	    	 }while (investRate <= 0);
	    		System.out.println("");
	    		return investRate;
		}
		
		public static void calculateInterest(double investAmount2,double rate2, double years [])
		{
			for (int i = 0; i < year.length; i++)
			{
				year[i] = (invest * investRate) + invest;
				invest = year[i];
			}
		}
		
		public static void printAmounts(double years [], double current )
		{
			for (int r = 0; r < year.length; r++)
			{
				System.out.printf("Your investment amount after month " + "%d " + "is " + "$" + "%.2f.\n",r + 1,year[r]);
			}
		}
}
