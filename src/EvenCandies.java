import java.util.HashSet;
import java.util.Set;

public class EvenCandies
{
	
	public static void main(String[] args)
	{
		int arr[] = {1,1,2,3};
		System.out.println(distCandies(arr));
	}
	
	
	public static int distCandies(int[] candies)
	{
		
		
		Set<Integer> hash = new HashSet<>();
		for (int i = 0; i < candies.length; i++)
		{
			hash.add(candies[i]);
		}
		
		
		return Math.min(hash.size(), candies.length/2);
	}
	
}
