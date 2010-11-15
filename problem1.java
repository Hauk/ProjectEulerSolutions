class Multiples
{

	int getTotal()
	{
		int finalSumTotal = 0;
		
		int intSum = 0;
		
		for(intSum = 0; intSum < 1000; intSum++)
		{
			if((intSum % 3 != 0) && (intSum % 5 != 0))
			{
				System.out.println("Value not added this time.");
			}
			else
			{
				finalSumTotal = finalSumTotal + intSum;
			}
		}
		
		System.out.println("Final Sum total is: " + finalSumTotal);
		
		return finalSumTotal;
	}

	public static void main(String[] args)
	{
		System.out.println("Finding the sum of all the multiples of 3 and 5 below 1000");
		
		Multiples inThousands = new Multiples();
		
		inThousands.getTotal();
	}
}