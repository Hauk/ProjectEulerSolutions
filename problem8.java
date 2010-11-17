import java.util.*;

class FiveProduct
{
	//Convert the string parameter into an integer array of single digit integers.
	int [] getIntArray(String intString)
	{
		//Create storage for single integers.
		int [] finalIntArray = new int [1000];
		
		//Convert to char array of individual chars.
		char [] charNums = intString.toCharArray();
		
		//Convert those chars into integers and insert into finalIntArray.
		for(int i = 0; i < charNums.length; i++)
		{
			finalIntArray[i] = Integer.parseInt(charNums[i] + "");
		} 
		
		//Return final integer array.
		return finalIntArray;
	}
	
	int largestValue(int [] singleInts)
	{
		int tempProd = 0;
		
		//List to store the product of the five integers.
		List<Integer> prodValues = new ArrayList<Integer>();
		
		for(int i = 0; i < singleInts.length; i++)
		{
			if(i == (singleInts.length - 5))
			{
				break;
			}
			
			//Grab product of proceeding elements at indexes up to and including 4 indexes ahead in integer array.
			tempProd = ((singleInts[i]) * (singleInts[i + 1]) * (singleInts[i + 2]) * (singleInts[i + 3]) * (singleInts[i + 4]));
			
			//Add this product value to a list for storage.
			prodValues.add(tempProd);
		}			
		
		//Sort our list of integers.
		Collections.sort(prodValues);
		
		//Return the largest value.
		return prodValues.get(prodValues.size() - 1);
	}
	
	public static void main(String [] args)
	{
		//This program finds the largest produce of consecutive 5 digits.

		FiveProduct fiver = new FiveProduct();
		
		String stringNum = "7316717653133062491922511967442657474235534919493496983520312774506326239578318016984801869478851843858615607891129494954595017379583319528532088055111254069874715852386305071569329096329522744304355766896648950445244523161731856403098711121722383113622298934233803081353362766142828064444866452387493035890729629049156044077239071381051585930796086670172427121883998797908792274921901699720888093776657273330010533678812202354218097512545405947522435258490771167055601360483958644670632441572215539753697817977846174064955149290862569321978468622482839722413756570560574902614079729686524145351004748216637048440319989000889524345065854122758866688116427171479924442928230863465674813919123162824586178664583591245665294765456828489128831426076900422421902267105562632111110937054421750694165896040807198403850962455444362981230987879927244284909188845801561660979191338754992005240636899125607176060588611646710940507754100225698315520005593572972571636269561882670428252483600823257530420752963450";
		
		//Get the integer result.
		int printResult = fiver.largestValue(fiver.getIntArray(stringNum));
		
		//Print the product value to terminal.
		System.out.println("The largest product of 5 consective integers in the integer number is:" + printResult + ".");		
	}
}