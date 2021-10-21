import java.io.File;
import java.io.IOException;
import java.util.Scanner;


public class CreditCardValidationProject
	{
		//an L on the end tells the computer it is a Long
		static long creditCardTest;
		static long creditCardTest1;
		static long [] ccArray = new long[16];
		static long digit;
		static long doubleDigit1;
		static long doubleDigit2;
		static long ccSum;
		
		
		//digit strip each number and put it into an int array
		public static void main(String[] args) throws IOException
			{
				Scanner myFile = new Scanner(new File("credit.txt"));
				
				//while it goes through each token
				while(myFile.hasNext()) 
					{
						creditCardTest = myFile.nextLong();
						creditCardTest1 = myFile.nextLong();
						intoArray();
						//printArray();
						takeAltNums();
						//printAfterAlt();
						addDoubleDigits();
						//printAfterDD();
						sumAllDigits();
					}
			}
	
		public static void intoArray()
			{
				//takes all the numbers and puts into array
				for(int i = 0; i < ccArray.length; i++)
					{
						digit = creditCardTest1 % 10;
						ccArray[15 - i] = digit;
						creditCardTest1 = creditCardTest1 / 10;
					}
			}
		public static void printArray()
		{
			System.out.println("Your array is: ");
			for(int i = 0; i < ccArray.length; i++)
				{
					System.out.print(ccArray[i] + " ");
				}
		}
		public static void takeAltNums()
		{
			for(int i = 0; i < ccArray.length; i+=2)
				{
					ccArray[i] = ccArray[i] * 2;
				}
		}
		public static void printAfterAlt()
		{
			System.out.println("\n\nYour new array is: ");
			for(int i = 0; i < ccArray.length; i++)
				{
					System.out.print(ccArray[i] + " ");
				}
		}
		public static void addDoubleDigits()
		{
			for(int i = 0; i < ccArray.length; i++)
				{
					if(ccArray[i] > 9)
						{
							//digit strip it
							doubleDigit1 = ccArray[i] % 10;
							doubleDigit2 = ccArray[i] / 10;
							ccArray[i] = doubleDigit1 + doubleDigit2;
						}
				}
		}
		public static void printAfterDD()
		{
			System.out.println("\n\nYour new array is: ");
			for(int i = 0; i < ccArray.length; i++)
				{
					System.out.print(ccArray[i] + " ");
				}
		}
		public static void sumAllDigits()
		{
			ccSum = 0;
			for(int i = 0; i < ccArray.length; i++)
				{
					ccSum = ccSum + ccArray[i]; 
				}
			System.out.println("\n\nThe sum is: " + ccSum);
			
			if(ccSum % 10 == 0)
				{
					System.out.println("The credit card number " + creditCardTest + " is potentially valid.");
				}
			else
				{
					System.out.println("The credit card number " + creditCardTest + "is not valid.");
				}
				
			
		}
		
		//practice it first with a valid: 
				//5424 1801 2345 6789
				//change 1 digit and test it then 
				//after that, import the file

				//import text file, split each line, strip spaces, and put each number into array
				

	}
