import java.util.*;

class Fibo
{	
	int calcTotalFibo(int inputValue)
	{
		List<Integer> evenList = new ArrayList<Integer>();
		
		int finalSumTotal = 0;		
		int firstFibo = 0;
		int secondFibo = 1;
		
		boolean checkTotal = false;
		
		while(checkTotal == false)
		{				
			//Calculate sum total.
			if((firstFibo + secondFibo) % 2 == 0)
			{
				evenList.add(firstFibo + secondFibo);
			}
			
			if(evenList.isEmpty() == true)
			{
				System.out.println("Not adding elements this time");
			}
			else
			{
				if(evenList.get((evenList.size() - 1)) > 4000000)
				{
					checkTotal = true;
				}
			}
			
			//Calculate new Fibonacci numbers.
			firstFibo = firstFibo + secondFibo;
			secondFibo = firstFibo - secondFibo;
		}
		
		for(int i = 0; i < evenList.size() - 1; i++)
		{
			finalSumTotal = finalSumTotal + (evenList.get(i));
			System.out.println(finalSumTotal);
		}
		
		return finalSumTotal;
	}
	
	public static void main(String [] args)
	{
		System.out.println("Calculating even Fibo up to 4,000,000.");
		
		Fibo fibCalc = new Fibo();
		
		//Print final sum total of evens to 4,000,000
		System.out.println(fibCalc.calcTotalFibo(4000000));
	}
}