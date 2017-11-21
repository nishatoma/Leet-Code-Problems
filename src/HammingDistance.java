import java.util.Scanner;

public class HammingDistance
{
	public static void main(String[] args)
	{
		Scanner sc = new Scanner(System.in);
		int x = sc.nextInt();
		int y = sc.nextInt();
		System.out.println("Hamming distance: " + hammingDistance(x, y));
	}

	/**
	 *  Returns the hamming distance between two numbers x and y
	 *  The hamming distance is defined as the number of positions
	 *  in which the corresponding bits are different. 
	 * @param x first number
	 * @param y secodn number
	 * @return resturns the hamming distance between x and y 
	 * as an integer.
	 */
	public static int hammingDistance(int x, int y)
	{
		return Integer.bitCount(x ^ y);		
	}
}
