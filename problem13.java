import java.io.*;
import java.math.*;
import java.util.ArrayList;

class SumHundred
{
	static BigInteger calcTotal() throws IOException
	{
		//New FileReader Object to read numbers from file.
		FileInputStream getNums = new FileInputStream("prob13nums.txt");
		DataInputStream numDataStream = new DataInputStream(getNums);
		
		BufferedReader numBuffer = new BufferedReader(new InputStreamReader(numDataStream));
		
		//ArrayList to store BigIntegers
		ArrayList<BigInteger> bigNums = new ArrayList<BigInteger>();
		
		BigInteger sumTotal = new BigInteger("0");
		
		BigInteger fiftyDigits;
		
		fiftyDigits = new BigInteger(numBuffer.readLine());
		
		//Add initial number in list.
		bigNums.add(fiftyDigits);
		
		boolean checkFinished = false;
		
		//Begin reading in lines.
		while(checkFinished == false)
		{
			String tempLine = numBuffer.readLine();
			
			if(tempLine == null)
			{
				checkFinished = true;
			}
			else
			{
				//Convert to bigInt and add to bigNums.
				fiftyDigits = new BigInteger(tempLine);
				bigNums.add(fiftyDigits);
			}
		}
		
		//Close the file after reading.
		getNums.close();
		
		//Calculate total of all the numbers
		for(int x = 0; x < bigNums.size(); x++)
		{
			sumTotal = sumTotal.add(bigNums.get(x));
		}
		
		//Return the total.
		return sumTotal;
	}
	
	public static void main(String [] args)
	{
		//Program to calculate the sum of 100 50-digit numbers.
		BigInteger bigNum = new BigInteger("0");
		
		// Try/catch block due to file read operations.
		try
		{
			bigNum = calcTotal();
		}
		catch(IOException e)
		{
			System.out.println("Error reading file.");
		}
		
		//Print result to terminal.
		System.out.println("Total of file numbers is: " + bigNum + ".");
	}
}