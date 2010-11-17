import java.util.*;
import java.lang.Math;

class SumSquares
{
	//Sum the squares up to given value and return.
	int sumSquare(int inputNum)
	{
		int squareTotal = 0;		
		
		for(int i = 1; i < (inputNum + 1); i++)
			squareTotal = squareTotal + (int)Math.pow(i, 2);
		
		return squareTotal;
	}
	
	//Square the sum of a given number of natural numbers and return.
	int squareOfSum(int sumNums)
	{
		int initSum = 0;
		int sumSquareTotal = 0;
		
		for(int i = 1; i < (sumNums + 1); i++)
			initSum = initSum + i;
		
		return sumSquareTotal = (int)Math.pow(initSum, 2);
	}
	
	public static void main(String [] args)
	{
		System.out.println("Program to print the diff between sum of squares and square of sums.");
		
		SumSquares diff = new SumSquares();
		
		System.out.println(diff.sumSquare(10));
		System.out.println(diff.squareOfSum(10));
		
		//Get final result by calling both functions.
		int diffResult = ((diff.squareOfSum(100)) - (diff.sumSquare(100)));
		
		//Print result to terminal.
		System.out.println("The difference is: " + diffResult);
	}
}