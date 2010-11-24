class TwoMillionPrime
{
	static long sieveOfErat(long nthPrime)
	{
		//Create array of bools to keep track of primes.
		boolean [] isPrimes = new boolean [(int)nthPrime + 1];
		
		//Init all values to true.
		for(int x = 2; x <= nthPrime; x++)
		{
			//Set all to be true.
			isPrimes[x] = true;
		}

		//Strike out all multiples(i * i) of the prime number.
		for(int i = 2; i * i <= nthPrime; i++)
		{
			if(isPrimes[i])
			{
				//While the multiple is a multiple of the prime.
				//The multiple is not a prime, so set it to false.
				for(int j = i; i * j <= nthPrime; j++)
					isPrimes[i*j] = false;
			}
		}
		
		//long to store our sumTotal of primes.
		long primeTotal = 0;
		
		//Calculate the sumTotal of primes.
		for(int a = 2; a <= nthPrime; a++)
		{		
			if(isPrimes[a])
			{
				//Sum up the totals.
				primeTotal = primeTotal + a;
				
			}
		}
		
		return primeTotal;
	}
	
	public static void main(String [] args)
	{
		//Program to calculate the sum of primes below 2,000,000.
		long inputLong = Long.parseLong(args[0]);
		
		System.out.println("Prime number sum total is: " + sieveOfErat(inputLong) + ".");
	}
}