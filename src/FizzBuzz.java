import java.util.LinkedList;
import java.util.List;

public class FizzBuzz
{
	public static void main(String[] args)
	{
		System.out.println();
		fizzBuzz(1);
	}

	public static List<String> fizzBuzz(int n)
	{
		List<String> list = new LinkedList<>();
		for (int i = 1; i <= n; i++)
		{

			if ((i % 15) == 0)
			{
				list.add("FizzBuzz");
			} else if ((i % 5) == 0)
			{
				list.add("Buzz");
			} else if ((i % 3) == 0)
			{
				list.add("Fizz");

			} else
			{
				String num = String.valueOf(i);
				list.add(num);
			}
		}
		return list;
	}
}
