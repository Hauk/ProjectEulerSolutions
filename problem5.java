import java.util.*;

class EvenlyDivide
{
	static int smallestDiv()
	{
		boolean divisibleEvenly = true;
		
		int trackCount = 0;
		int numRange = 20;
		
		while(divisibleEvenly)
		{
			for(int i = 20; i > 0; i--)
			{
				if(numRange % i == 0)
				{
					trackCount++;
				}
			}
				if(trackCount == 20)
				{
					divisibleEvenly = false;
					break;
				}
				else
				{
					trackCount = 0;
				}
			numRange = numRange + 20;	
		}
		
		return numRange;
	}
	
	public static void main(String [] args)
	{
		//Program to calculate the smallest divisible number by all nums from 1 - 20.
		
		int answer = smallestDiv();
		
		System.out.println(answer);
	}
}