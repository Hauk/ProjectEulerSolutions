class ThousandPrimes
{
	//Boolean function to check primality of a given integer.
	static boolean checkPrime(int primeValue)
	{
		for(int i = 2; i < (primeValue / 2); i++)
		{
			if((primeValue % i == 0) && ((primeValue != i)))
				return false;
		}	
		return true;
	}
	
	//Function to generate the 10001st prime number.
	static void calcThousanthPrime()
	{
		boolean endCalcPrime = false;
		
		//Init our tracker and iterator.
		int primeTracker = 0;
		int lastPrime = 0;
		int i = 2;
		
		//While the primeTracker is less than 10,000.
		while(endCalcPrime == false)
		{			
			//If it's a prime number and i is an odd number
			if((checkPrime(i) == true) && (i % 2 != 0))
			{
				lastPrime = i;
				primeTracker++;
			}
			
			//If we have reached the 10,001st number: Finish.
			if(primeTracker == 10000)
				endCalcPrime = true;
			
			//Increment our tick.
			i++;
		}
		
		System.out.println("The 1001st prime is: " + lastPrime + ".");
	}
	
	public static void main(String [] args)
	{
		//A program to calculate the 10,001st prime number.
		
		calcThousanthPrime();
	}
}