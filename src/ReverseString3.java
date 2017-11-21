
public class ReverseString3
{
	public static void main(String[] args)
	{
		String hello = "Let's take LeetCode contest";
		String reverse = reverseWords(hello);
		System.out.println(reverse);
	}
	
	public static String reverseWords(String s)
	{
		String[] split = s.split(" ");
		//System.out.println(split.toString());
		StringBuilder sb = new StringBuilder();
		for (int i = 0; i < split.length; i++)
		{
			split[i] = reverse(split[i]);
			if (i != split.length - 1)
			{
				sb.append(split[i] + " ");
			} else 
			{
				sb.append(split[i]);
			}
			
		}
		//StringBuilder sb = new StringBuilder();
		
		
		return sb.toString();
	}
	
	public static String reverse(String s)
	{
		char c[] = s.toCharArray();
		int start = 0;
		int end = c.length - 1;
		char temp;
		while (start < end)
		{
			temp = c[start];
			c[start] = c[end];
			c[end] = temp;
			end--;
			start++;
		}
		
		return new String(c);
	}
	
}
