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
	
	static int calcThousanthPrime()
	{
		boolean endCalcPrime = false;
		
		int primeTracker = 0;
		int lastPrime = 0;
		int i = 2;
		
		while(endCalcPrime == false)
		{			
			if((checkPrime(i) == true) && (i % 2 != 0))
			{
				lastPrime = i;
				primeTracker++;
			}
			
			if(primeTracker == 10000)
				endCalcPrime = true;
			
			i++;
		}
		
		System.out.println("The 1001st prime is: " + lastPrime + ".");
		
		return lastPrime;
	}
	
	public static void main(String [] args)
	{
		calcThousanthPrime();
	}
}