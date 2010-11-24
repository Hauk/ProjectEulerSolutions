class LargestPrime
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
	
	//Function to find all the factors of a given large number.
	static void findFactor(long largeValue)
	{		
		for(int i = 2; i <= largeValue; i++)
		{
			if((largeValue % i == 0) && (checkPrime(i) == true))
				System.out.println("Factor of: " + largeValue + " is: " + i + ".");
		}
	}
	
	public static void main(String [] args)
	{
		//Large number! :O
		long longNum = 600851475143L;
		
		findFactor(longNum);
	}
}