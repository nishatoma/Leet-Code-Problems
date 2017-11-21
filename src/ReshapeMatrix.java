import java.util.LinkedList;
import java.util.Queue;

public class ReshapeMatrix
{
	
	
	public static void main(String[] args)
	{
		
	}
	
	public static int[][] reshapeMatrix(int nums[][], int r, int c)
	{
		
		//For brute force approach, use Queue
		int size = nums.length * nums[0].length;
		Queue<Integer> q = new LinkedList<>();
		// Result array
		int[][] result = new int[r][c];
		//If dimensions don't match
		if (size != r*c)
		{
			return nums;
		}
		
		//Without Queue
		int rows = 0, cols = 0;
		for (int i = 0; i < nums.length; i++)
		{
			for (int j = 0; j < nums[0].length; j++)
			{
				result[rows][cols] = nums[i][j];
				cols++;
				if (cols == c)
				{
					rows++;
					cols = 0;
				}
			}
			
		}
		
		return result;
	}
	
}
