import java.lang.Math;
import java.math.BigInteger;

class SumDigits
{
	int calcSum(int userValue, int powValue)
	{
		int finResult = 0;
		
		//Using BigInteger, as power of 2 to 1000 is *HUGE*
		BigInteger poweredValue = new BigInteger("2");
		
		//Power the base number to the given exponent.
		poweredValue = poweredValue.pow(powValue);
		
		//Convert to string.
		String tempIntVal = poweredValue.toString();
		
		//Convert this to a char array.
		char [] singleValues = tempIntVal.toCharArray();
		
		//Then convert to decimal integers and sum up the individual integers.
		for(int i = 0; i < singleValues.length; i++)
			finResult = finResult + Integer.parseInt(singleValues[i] + "");
		
		//Return the answer.
		return finResult;
	}
	
	public static void main(String [] args)
	{
		System.out.println("Calculating the sum of the powered digit results integers.");
		
		SumDigits sumUp = new SumDigits();
		
		System.out.println("The sum value of the result digits powered is: " + sumUp.calcSum(2, 1000));
	}
}