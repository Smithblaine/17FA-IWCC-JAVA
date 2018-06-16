package bSmith_Prog12;

public class Meal 
{
	private String entree;
	private String dessert;
	private int entreeCals;
	private int dessertCals;
	private int totalCals;
	private boolean underCals;
	
	public void setEntree(String entree1)
	{
		entree = entree1 ;
	}
	public String getEntree()
	{
		return entree;
	}
	
	public void setEntreeCals (int entreeCals1)
	{
		entreeCals = entreeCals1;
	}
	public int getEntreeCals()
	{
		return entreeCals;
	}
	
	public void setDessert (String dessert1)
	{
		dessert = dessert1;
	}
	public String getDessert()
	{
		return dessert;
	}
	
	public void setDessertCals (int dessertCals1)
	{
		dessertCals = dessertCals1;
	}
	public int getDessertCals()
	{
		return dessertCals;
	}
	
	public void setTotalCals ()
	{
		totalCals = dessertCals + entreeCals;
	}
	public int getTotalCals()
	{
		return totalCals;
	}
	
	public void setUnderCals(boolean underCals1)
	{
		underCals = underCals1;
	}
	public boolean getUnderCals()
	{
		return underCals;
	}
}
