import java.util.*;

class Palindrome
{
	//Boolean function checks if a given integer is a Palindrome.
	boolean checkPal(int inputNum)
	{
		boolean isPalindrome = false;
		
		//The following 3 lines convert the integer to a char array.
		int numLength = Integer.toString(inputNum).length();

		String numString = Integer.toString(inputNum);
		
		char [] charNum = numString.toCharArray();
		
		int k = 0;
		
		//Loop and check Palindrome.
		for(int i = 0; i < numLength - 1; i++)
		{
			if(charNum[i] != charNum[(numLength - 1) - k])
			{
				isPalindrome = false;
				break;
			}
			else if(charNum[i] == charNum[(numLength - 1) - k])
			{
				isPalindrome = true;
			}
			k++;
		}
		
		//Return result.
		return isPalindrome;
	}
	
	int [] sortPalindromes(List<Integer> palNums)
	{
		//This function writes the values in palNums into a new int array(so I can sort it).
		int [] returnArray = new int[palNums.size()];
		
		for(int i = 0; i < palNums.size(); i++)
			returnArray[i] = palNums.get(i);
		
		Arrays.sort(returnArray);
		
		return returnArray;
	}
	
	int crunchTheNumbers()
	{
		//Now to crunch. PEW PEW PEW.
		int largestPal = 0;
		
		int newMult = 0;
		
		List<Integer> palNums = new ArrayList<Integer>();
		
		//Yeah, I know. Hardcoded.
		for(int i = 100; i < 1000; i++)
		{	
			//Calculate and filter only palindromes into palNums.
			for(int k = 999; k > 100; k--)
			{
				//Calculate the product of i and k.
				newMult = (i * k);
				
				//If it's a palindrome, add it to the list.
				if(checkPal(newMult))
				{
					palNums.add(newMult);
				}
			}
		}
	
		//Create new int [] array from ArrayList<Integer>
		int [] palArray = sortPalindromes(palNums);
		
		//Set largestPal to the last element in the array(The largest palindrome). 	
		largestPal = palArray[palArray.length - 1];
		
		//And return.
		return largestPal;
	}
	
	public static void main(String [] args)
	{
		System.out.println("Program to calculate largest palindrome of two 3 digit numbers.");
		
		Palindrome calcBig = new Palindrome();		
		
		int largestValue = calcBig.crunchTheNumbers();
		
		System.out.println("Largest palindrome is: " + largestValue + ".");
	}
}