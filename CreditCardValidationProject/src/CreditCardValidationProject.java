
public class CreditCardValidationProject
	{
		public static void main(String[] args)
			{
			//practice it first with a valid: 
				//5424 1801 2345 6789
				//change 1 digit and test it then 
				//after that, import the file

				//import text file, split each line, strip spaces, and put each number into array
			int [] creditCardTest = {5, 4, 2, 4, 1, 8, 0, 1, 2, 3, 4, 5, 6, 7, 8, 9};
			
			for(int i = 0; i < creditCardTest.length; i+=2)
				{
					System.out.print(creditCardTest[i] + " ");
				}
			System.out.println("\n");
			for(int i = 0; i < creditCardTest.length; i+=2)
				{
					creditCardTest[i] = creditCardTest[i] * 2;
					System.out.print(creditCardTest[i] + " ");
				}
			for(int i = 0; i < creditCardTest.length; i++)
				{
					//split and add the digits if it is a two digit number
					if(creditCardTest[i] > 9)
						{
							//split it here and add them
						}
				}
			
				
			}

	}
