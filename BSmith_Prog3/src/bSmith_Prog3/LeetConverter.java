//This code will allow the user to select either a upper case or lower case letter 
//and will provide what that letter represents in leet code.

package bSmith_Prog3;
import java.util.Scanner;
public class LeetConverter 
{
	public static void main (String args[])
	{
		Scanner scnr = new Scanner(System.in);
		String conversion = " ";
		char s1;
		
		System.out.println("Welcome to the Leet Converter");
		
		System.out.println();
		
		System.out.print("Enter a character to convert:  ");
		s1 = scnr.next().charAt(0);
		
		scnr.close();
		
		
			switch(s1)
			{
				case 'A':
				case 'a':
					conversion = "/\\";
					break;
				case 'B':
				case 'b':
					conversion = "13";
					break;
				case 'C':
				case 'c':
					conversion = "(";
					break;
				case 'D':
				case 'd':
					conversion = "1)";
					break;
				case 'E':
				case 'e':
					conversion = "3";
					break;
				case 'F':
				case 'f':
					conversion = "1=";
					break;
				case 'G':
				case 'g':
					conversion = "6";
					break;
				case 'H':
				case 'h':
					conversion = "#";
					break;
				case 'I':
				case 'i':
					conversion = "1";
					break;
				case 'J':
				case 'j':
					conversion = "_/";
					break;
				case 'K':
				case 'k':
					conversion = "1<";
					break;
				case 'L':
				case 'l':
					conversion = "!";
					break;
				case 'M':
				case 'm':
					conversion = "/\\/\\";
					break;
				case 'N':
				case 'n':
					conversion = "1\1";
					break;
				case 'O':
				case 'o':
					conversion = "()";
					break;
				case 'P':
				case 'p':
					conversion = "1^";
					break;
				case 'Q':
				case 'q':
					conversion = "&";
					break;
				case 'R':
				case 'r':
					conversion = "12";
					break;
				case 'S':
				case 's':
					conversion = "5";
					break;
				case 'T':
				case 't':
					conversion = "+";
					break;
				case 'U':
				case 'u':
					conversion = "/_/";
					break;
				case 'V':
				case 'v':
					conversion = "\\/";
					break;
				case 'W':
				case 'w':
					conversion = "|/\\|";
					break;
				case 'X':
				case 'x':
					conversion = "><";
					break;
				case 'Y':
				case 'y':
					conversion = "Y";
					break;
				case 'Z':
				case 'z':
					conversion = "2";
					break;
				default:
					conversion = "-";
			}
			
			System.out.printf("%s ", s1);
			System.out.printf("%s\n", conversion);
	
		
		
	}
}
