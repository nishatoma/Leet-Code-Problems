
public class ReverseString
{
	public static String reverseString(String str)
	{
		char[] c = str.toCharArray();
		int beg = 0;
		int end = c.length - 1;
		
		while (beg < end)
		{
			char temp = c[beg];
			c[beg] = c[end];
			c[end] = temp;
			end--;
			beg++;
		}
		return new String(c);
	}
}
