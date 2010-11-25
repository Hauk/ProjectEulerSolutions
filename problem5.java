import java.util.*;

class EvenlyDivide
{
	static int smallestDiv()
	{
		//Track when a number which is evenly divisible is found.
		boolean divisibleEvenly = true;
		
		int trackCount = 0;
		int numRange = 20;
		
		while(divisibleEvenly)
		{
			//If the numberRange is evenly divisible.
			for(int i = 20; i > 0; i--)
			{
				//If number range divided by i is even.
				if(numRange % i == 0)
				{
					//Increase count.
					trackCount++;
				}
			}
			
			//If the count is == 20. It's not divisible by all values, so break.
			if(trackCount == 20)
			{
				divisibleEvenly = false;
				break;
			}
			else
			{
				//Reset the count.
				trackCount = 0;
			}
			//Increase the number to check by 20(i.e. the value must divide by 20 evenly, so increasing by it makes sense).
			numRange = numRange + 20;	
		}
		//And return.
		return numRange;
	}
	
	public static void main(String [] args)
	{
		//Program to calculate the smallest divisible number by all nums from 1 - 20.
		System.out.println(smallestDiv());
	}
}